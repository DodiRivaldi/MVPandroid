package net.derohimat.mvpandroid.ui.topratedshows;

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

public class TopRatedShows extends BaseFragment implements TopRatedShowsMvpView {

    public TopRatedShows() {
        // Required empty public constructor
    }

    public static TopRatedShows newInstance() {
        TopRatedShows fragment = new TopRatedShows();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Inject
    CommonFragmentAdapter adapter;


    @Inject
    TopRatedShowsMvpPresenter<TopRatedShowsMvpView> topRatedShowsMvpPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = super.onCreateView(inflater, container, savedInstanceState);

        getActivityComponent().injectTopRatedTvShows(this);
        topRatedShowsMvpPresenter.onAttach(this);
        topRatedShowsMvpPresenter.fetchTopRatedTvListFromApi("1");

        adapter.setImageClickListener(this);
        gridView.setAdapter(adapter);


        return view;
    }

    @Override
    public void update(int scroll) {
        topRatedShowsMvpPresenter.fetchTopRatedTvListFromApi("" + scroll);
    }

    @Override
    public void fetchedTopRatedList(TvModelResult result) {

        TvModel[] model = result.getModels();
        ArrayList<TvModel> apiData = new ArrayList<>(Arrays.asList(model));
        adapter.updateList(apiData);

    }

    @Override
    public void onDestroyView() {
        topRatedShowsMvpPresenter.onDetach();
        super.onDestroyView();
    }

    @Override
    public void onRefresh() {
        topRatedShowsMvpPresenter.fetchTopRatedTvListFromApi("1");
        swipeRefreshLayout.setRefreshing(false);
    }

}
