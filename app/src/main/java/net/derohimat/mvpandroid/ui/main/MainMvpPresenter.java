package net.derohimat.mvpandroid.ui.main;

import net.derohimat.mvpandroid.ui.base.BaseMvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends BaseMvpPresenter<V> {

    void getUserDetail();

    void showPopularShowsFrag();

    void showTopRatedFrag();

    void logoutUser();

    void openAboutAct();
}
