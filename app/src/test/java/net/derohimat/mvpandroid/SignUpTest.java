package net.derohimat.mvpandroid;

import net.derohimat.mvpandroid.data.datamanager.DataManager;
import net.derohimat.mvpandroid.ui.signup.SignUpMvpPresenter;
import net.derohimat.mvpandroid.ui.signup.SignUpMvpView;
import net.derohimat.mvpandroid.ui.signup.SignUpPresenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import io.reactivex.disposables.CompositeDisposable;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SignUpTest {

    String email = "abc1712gmail.com";
    String pass = "fdgte%$";

    @Mock
    SignUpMvpView mMockLoginMvpView;

    @Mock
    DataManager mMockDataManager;

    @Mock
    CompositeDisposable compositeDisposable;

    SignUpMvpPresenter<SignUpMvpView> mvpPresenter;

    @Before
    public void setUp() throws Exception {
        mvpPresenter = new SignUpPresenter<>(mMockDataManager, compositeDisposable);
        mvpPresenter.onAttach(mMockLoginMvpView);
    }

    @Test
    public void signUpTest() {

        when(mMockLoginMvpView.isNetworkAvailable()).thenReturn(true);
        mvpPresenter.signUpCheck(email, pass);
        verify(mMockLoginMvpView).showError(R.string.invalid_email_error);
    }

    @After
    public void terminate() throws Exception {
        mvpPresenter.onDetach();
    }
}
