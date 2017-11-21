package net.derohimat.mvpandroid.ui.topratedshows;

import net.derohimat.mvpandroid.ui.base.BaseMvpPresenter;

public interface TopRatedShowsMvpPresenter<V extends TopRatedShowsMvpView> extends BaseMvpPresenter<V> {

    void fetchTopRatedTvListFromApi(String pgNo);
}
