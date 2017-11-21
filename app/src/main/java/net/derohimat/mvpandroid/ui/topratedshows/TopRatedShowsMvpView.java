package net.derohimat.mvpandroid.ui.topratedshows;

import net.derohimat.mvpandroid.data.model.TvModelResult;
import net.derohimat.mvpandroid.ui.base.BaseMvpView;

public interface TopRatedShowsMvpView extends BaseMvpView {

    void fetchedTopRatedList(TvModelResult result);
}
