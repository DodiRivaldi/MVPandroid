package net.derohimat.mvpandroid.data.datamanager.network;

import net.derohimat.mvpandroid.data.model.TvModelResult;
import net.derohimat.mvpandroid.data.model.TvShowDetail;

import io.reactivex.Observable;
import retrofit2.Response;

public interface NetworkHelper {

    Observable<Response<TvModelResult>> getTvPopularList(String pageNo);

    Observable<Response<TvModelResult>> getTvTopRatedList(String pageNo);

    Observable<Response<TvShowDetail>> getTvShowDetails(int movie_id);
}
