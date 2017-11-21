package net.derohimat.mvpandroid.ui.detail;

import net.derohimat.mvpandroid.ui.base.BaseMvpPresenter;

public interface DetailMvpPresenter<V extends DetailMvpView> extends BaseMvpPresenter<V> {

    void getTvShowDetail(int tv_id);
}
