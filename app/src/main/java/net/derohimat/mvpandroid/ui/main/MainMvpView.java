package net.derohimat.mvpandroid.ui.main;

import net.derohimat.mvpandroid.ui.base.BaseMvpView;

public interface MainMvpView extends BaseMvpView {

    void setUserDetails(String currentUserEmail);

    void closeNavDrawer();

    void showPopularFrag();

    void showTopRatedFrag();

    void openLoginActivity();

    void openAboutActivity();
}
