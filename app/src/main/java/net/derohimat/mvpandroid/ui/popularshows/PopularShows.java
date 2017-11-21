package net.derohimat.mvpandroid.ui.popularshows;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.derohimat.mvpandroid.data.model.TvModel;
import net.derohimat.mvpandroid.data.model.TvModelResult;
import net.derohimat.mvpandroid.ui.CommonFragmentAdapter;
import net.derohimat.mvpandroid.ui.base.BaseFragment;

import java.util.ArrayList;
import java.util.Arrays;

import javax.inject.Inject;

public class PopularShows extends BaseFragment implements PopularShowsMvpView {


    public PopularShows() {
        // Required empty public constructor
    }


    public static PopularShows newInstance() {
        PopularShows fragment = new PopularShows();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Inject
    CommonFragmentAdapter adapter;

    @Inject
    PopularShowsMvpPresenter<PopularShowsMvpView> popularTvShowsMvpPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = super.onCreateView(inflater, container, savedInstanceState);

        getActivityComponent().injectPopularTvShows(this);
        popularTvShowsMvpPresenter.onAttach(this);
        popularTvShowsMvpPresenter.fetchPopularTvListFromApi("1");

        adapter.setImageClickListener(this);
        gridView.setAdapter(adapter);

        return view;
    }

    @Override
    public void update(int scroll) {
        popularTvShowsMvpPresenter.fetchPopularTvListFromApi("" + scroll);
    }


    @Override
    public void fetchedList(TvModelResult result) {

        TvModel[] model = result.getModels();
        ArrayList<TvModel> apiData = new ArrayList<>(Arrays.asList(model));
        adapter.updateList(apiData);

    }

    @Override
    public void onRefresh() {
        popularTvShowsMvpPresenter.fetchPopularTvListFromApi("1");
        swipeRefreshLayout.setRefreshing(false);
    }


}
