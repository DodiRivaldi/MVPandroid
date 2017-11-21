package net.derohimat.mvpandroid.ui.popularshows;

import net.derohimat.mvpandroid.ui.base.BaseMvpPresenter;

public interface PopularShowsMvpPresenter<V extends PopularShowsMvpView> extends BaseMvpPresenter<V> {

    void fetchPopularTvListFromApi(String pgNo);
}
