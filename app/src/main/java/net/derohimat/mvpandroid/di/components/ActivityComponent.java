package derohimat.mvpandroid.di.components;

import dagger.Component;
import derohimat.mvpandroid.di.modules.ActivityModule;
import derohimat.mvpandroid.di.scopes.ActivityScope;
import derohimat.mvpandroid.ui.detail.DetailActivity;
import derohimat.mvpandroid.ui.main.MainActivity;
import derohimat.mvpandroid.ui.popularshows.PopularShows;
import derohimat.mvpandroid.ui.signup.SignUpActivity;
import derohimat.mvpandroid.ui.topratedshows.TopRatedShows;

/**
 * Created by mohak on 19/5/17.
 */

@ActivityScope
@Component(modules = {ActivityModule.class}, dependencies = {ApplicationComponent.class})
public interface ActivityComponent {

    void injectMainActivity(MainActivity mainActivity);

    void injectLoginActivity(SignUpActivity mainActivity);

    void injectPopularTvShows(PopularShows popularTvShows);

    void injectTopRatedTvShows(TopRatedShows topRatedShows);

    void injectDetailActivity(DetailActivity detailActivity);
}
