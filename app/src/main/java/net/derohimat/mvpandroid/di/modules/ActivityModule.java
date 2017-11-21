package derohimat.mvpandroid.di.modules;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;
import derohimat.mvpandroid.data.model.TvModel;
import derohimat.mvpandroid.di.qualifiers.ActivityContext;
import derohimat.mvpandroid.di.scopes.ActivityScope;
import derohimat.mvpandroid.ui.CommonFragmentAdapter;
import derohimat.mvpandroid.ui.detail.DetailMvpPresenter;
import derohimat.mvpandroid.ui.detail.DetailMvpView;
import derohimat.mvpandroid.ui.detail.DetailPresenter;
import derohimat.mvpandroid.ui.main.MainMvpPresenter;
import derohimat.mvpandroid.ui.main.MainMvpView;
import derohimat.mvpandroid.ui.main.MainPresenter;
import derohimat.mvpandroid.ui.popularshows.PopularShowsMvpPresenter;
import derohimat.mvpandroid.ui.popularshows.PopularShowsMvpView;
import derohimat.mvpandroid.ui.popularshows.PopularShowsPresenter;
import derohimat.mvpandroid.ui.signup.SignUpMvpPresenter;
import derohimat.mvpandroid.ui.signup.SignUpMvpView;
import derohimat.mvpandroid.ui.signup.SignUpPresenter;
import derohimat.mvpandroid.ui.topratedshows.TopRatedShowsMvpPresenter;
import derohimat.mvpandroid.ui.topratedshows.TopRatedShowsMvpView;
import derohimat.mvpandroid.ui.topratedshows.TopRatedShowsPresenter;

/**
 * Created by mohak on 19/5/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @ActivityContext
    @ActivityScope
    @Provides
    Context provideContext() {
        return activity;
    }

    @ActivityScope
    @Provides
    Activity provideActivity() {
        return activity;
    }

    @ActivityScope
    @Provides
    SignUpMvpPresenter<SignUpMvpView> provideLoginPresenter(SignUpPresenter<SignUpMvpView> signUpPresenter) {
        return signUpPresenter;
    }

    @ActivityScope
    @Provides
    MainMvpPresenter<MainMvpView> provideMainPresenter(MainPresenter<MainMvpView> mainPresenter) {
        return mainPresenter;
    }

    @ActivityScope
    @Provides
    DetailMvpPresenter<DetailMvpView> provideDetailPresenter(DetailPresenter<DetailMvpView> detailPresenter) {
        return detailPresenter;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    CommonFragmentAdapter provideTvShowsAdapter() {
        return new CommonFragmentAdapter(new ArrayList<TvModel>());
    }

    @Provides
    PopularShowsMvpPresenter<PopularShowsMvpView> provideTvShowsPresenter(PopularShowsPresenter<PopularShowsMvpView> popularTvShowsPresenter) {
        return popularTvShowsPresenter;
    }

    @Provides
    TopRatedShowsMvpPresenter<TopRatedShowsMvpView> provideTopRatedPresenter(TopRatedShowsPresenter<TopRatedShowsMvpView> topRatedShowsPresenter) {
        return topRatedShowsPresenter;
    }
}
