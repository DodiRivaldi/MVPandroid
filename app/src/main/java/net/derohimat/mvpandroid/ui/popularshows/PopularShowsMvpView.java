package net.derohimat.mvpandroid.ui.popularshows;

import net.derohimat.mvpandroid.data.model.TvModelResult;
import net.derohimat.mvpandroid.ui.base.BaseMvpView;

public interface PopularShowsMvpView extends BaseMvpView {

    void fetchedList(TvModelResult result);
}
