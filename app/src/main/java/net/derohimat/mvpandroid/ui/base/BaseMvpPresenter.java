package net.derohimat.mvpandroid.ui.base;

/**
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the View type that wants to be attached with.
 */
public interface BaseMvpPresenter<V> {

    void onAttach(V mvpView);

    void onDetach();

}
