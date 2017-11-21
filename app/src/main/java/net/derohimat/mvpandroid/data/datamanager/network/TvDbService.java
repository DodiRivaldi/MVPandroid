package net.derohimat.mvpandroid.data.datamanager.network;

import net.derohimat.mvpandroid.data.model.TvModelResult;
import net.derohimat.mvpandroid.data.model.TvShowDetail;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TvDbService {

    @GET("tv/popular")
    Observable<Response<TvModelResult>> getpopular(@QueryMap Map<String, String> queries);

    @GET("tv/top_rated")
    Observable<Response<TvModelResult>> getTopRated(@QueryMap Map<String, String> queries);

    @GET("tv/{tv_id}")
    Observable<Response<TvShowDetail>> getShowData(@Path("tv_id") int tv_id, @QueryMap Map<String, String> queries);
}
