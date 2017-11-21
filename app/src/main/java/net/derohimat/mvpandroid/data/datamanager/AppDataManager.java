package net.derohimat.mvpandroid.data.datamanager;

import android.content.Context;

import net.derohimat.mvpandroid.data.datamanager.network.NetworkHelper;
import net.derohimat.mvpandroid.data.datamanager.preference.PreferenceHelper;
import net.derohimat.mvpandroid.data.model.TvModelResult;
import net.derohimat.mvpandroid.data.model.TvShowDetail;
import net.derohimat.mvpandroid.di.qualifiers.ApplicationContext;
import net.derohimat.mvpandroid.di.scopes.ApplicationScope;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.Response;

@ApplicationScope
public class AppDataManager implements DataManager {

    private PreferenceHelper mPreferenceHelper;
    private NetworkHelper mNetworkHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context, NetworkHelper networkHelper,
                          PreferenceHelper preferenceHelper) {
        this.mPreferenceHelper = preferenceHelper;
        this.mNetworkHelper = networkHelper;
    }

    @Override
    public Observable<Response<TvModelResult>> getTvPopularList(String pageNo) {
        return mNetworkHelper.getTvPopularList(pageNo);
    }

    @Override
    public Observable<Response<TvModelResult>> getTvTopRatedList(String pageNo) {
        return mNetworkHelper.getTvTopRatedList(pageNo);
    }

    @Override
    public Observable<Response<TvShowDetail>> getTvShowDetails(int tv_id) {
        return mNetworkHelper.getTvShowDetails(tv_id);
    }

    @Override
    public void addCurrentUserEmail(String email) {
        mPreferenceHelper.addCurrentUserEmail(email);

    }

    @Override
    public String getCurrentUserEmail() {
        return mPreferenceHelper.getCurrentUserEmail();
    }

    @Override
    public void deleteCredentials() {
        mPreferenceHelper.deleteCredentials();
    }
}
