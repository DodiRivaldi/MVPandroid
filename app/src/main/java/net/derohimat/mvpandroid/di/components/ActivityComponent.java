package net.derohimat.mvpandroid.di.components;

import net.derohimat.mvpandroid.di.modules.ActivityModule;
import net.derohimat.mvpandroid.di.scopes.ActivityScope;
import net.derohimat.mvpandroid.ui.detail.DetailActivity;
import net.derohimat.mvpandroid.ui.main.MainActivity;
import net.derohimat.mvpandroid.ui.popularshows.PopularShows;
import net.derohimat.mvpandroid.ui.signup.SignUpActivity;
import net.derohimat.mvpandroid.ui.topratedshows.TopRatedShows;

import dagger.Component;

@ActivityScope
@Component(modules = {ActivityModule.class}, dependencies = {ApplicationComponent.class})
public interface ActivityComponent {

    void injectMainActivity(MainActivity mainActivity);

    void injectLoginActivity(SignUpActivity mainActivity);

    void injectPopularTvShows(PopularShows popularTvShows);

    void injectTopRatedTvShows(TopRatedShows topRatedShows);

    void injectDetailActivity(DetailActivity detailActivity);
}
