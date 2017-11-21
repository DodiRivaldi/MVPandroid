package net.derohimat.mvpandroid.ui.signup;

import net.derohimat.mvpandroid.ui.base.BaseMvpPresenter;

public interface SignUpMvpPresenter<V extends SignUpMvpView> extends BaseMvpPresenter<V> {

    void signUpCheck(String email, String password);

    void alreadySignedUpCheck();
}
