package derohimat.mvpandroid.di.modules;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import derohimat.mvpandroid.MvpAndroid;
import derohimat.mvpandroid.data.datamanager.AppDataManager;
import derohimat.mvpandroid.data.datamanager.DataManager;
import derohimat.mvpandroid.data.datamanager.network.AppNetworkManager;
import derohimat.mvpandroid.data.datamanager.network.NetworkHelper;
import derohimat.mvpandroid.data.datamanager.preference.AppPreferenceManager;
import derohimat.mvpandroid.data.datamanager.preference.PreferenceHelper;
import derohimat.mvpandroid.di.qualifiers.ApplicationContext;
import derohimat.mvpandroid.di.qualifiers.PrefFile;
import derohimat.mvpandroid.di.scopes.ApplicationScope;
import derohimat.mvpandroid.utils.Constants;

/**
 * Created by mohak on 19/5/17.
 */

@Module
public class ApplicationModule {

    private MvpAndroid app;

    public ApplicationModule(MvpAndroid app) {
        this.app = app;
    }

    @ApplicationContext
    @Provides
    Context provideContext() {
        return app;
    }

    @PrefFile
    @Provides
    String providePrefFile() {
        return Constants.PREF_FILENAME;
    }

    @ApplicationScope
    @Provides
    DataManager provideDataManger(AppDataManager appDataManager) {
        return appDataManager;
    }

    @ApplicationScope
    @Provides
    PreferenceHelper providePreferenceHelper(AppPreferenceManager appPreferenceManager) {
        return appPreferenceManager;
    }

    @ApplicationScope
    @Provides
    NetworkHelper provideNetworkHelper(AppNetworkManager networkManager) {
        return networkManager;
    }
}
