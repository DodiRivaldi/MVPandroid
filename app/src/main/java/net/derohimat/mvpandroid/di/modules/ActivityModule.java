package net.derohimat.mvpandroid.di.modules;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import net.derohimat.mvpandroid.data.model.TvModel;
import net.derohimat.mvpandroid.di.qualifiers.ActivityContext;
import net.derohimat.mvpandroid.di.scopes.ActivityScope;
import net.derohimat.mvpandroid.ui.CommonFragmentAdapter;
import net.derohimat.mvpandroid.ui.detail.DetailMvpPresenter;
import net.derohimat.mvpandroid.ui.detail.DetailMvpView;
import net.derohimat.mvpandroid.ui.detail.DetailPresenter;
import net.derohimat.mvpandroid.ui.main.MainMvpPresenter;
import net.derohimat.mvpandroid.ui.main.MainMvpView;
import net.derohimat.mvpandroid.ui.main.MainPresenter;
import net.derohimat.mvpandroid.ui.popularshows.PopularShowsMvpPresenter;
import net.derohimat.mvpandroid.ui.popularshows.PopularShowsMvpView;
import net.derohimat.mvpandroid.ui.popularshows.PopularShowsPresenter;
import net.derohimat.mvpandroid.ui.signup.SignUpMvpPresenter;
import net.derohimat.mvpandroid.ui.signup.SignUpMvpView;
import net.derohimat.mvpandroid.ui.signup.SignUpPresenter;
import net.derohimat.mvpandroid.ui.topratedshows.TopRatedShowsMvpPresenter;
import net.derohimat.mvpandroid.ui.topratedshows.TopRatedShowsMvpView;
import net.derohimat.mvpandroid.ui.topratedshows.TopRatedShowsPresenter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

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
