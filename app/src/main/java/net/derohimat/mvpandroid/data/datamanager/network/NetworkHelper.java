package derohimat.mvpandroid.data.datamanager.network;

import io.reactivex.Observable;
import derohimat.mvpandroid.data.model.TvModelResult;
import derohimat.mvpandroid.data.model.TvShowDetail;
import retrofit2.Response;

/**
 * Created by mohak on 26/5/17.
 */

public interface NetworkHelper {

    Observable<Response<TvModelResult>> getTvPopularList(String pageNo);

    Observable<Response<TvModelResult>> getTvTopRatedList(String pageNo);

    Observable<Response<TvShowDetail>> getTvShowDetails(int movie_id);
}
