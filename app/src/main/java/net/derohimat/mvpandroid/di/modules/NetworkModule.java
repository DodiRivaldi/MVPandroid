package net.derohimat.mvpandroid.di.modules;

import net.derohimat.mvpandroid.data.datamanager.network.TvDbService;
import net.derohimat.mvpandroid.di.qualifiers.Url;
import net.derohimat.mvpandroid.di.scopes.ApplicationScope;
import net.derohimat.mvpandroid.utils.Constants;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    @ApplicationScope
    @Provides
    Retrofit provideRetrofit(@Url String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Url
    @Provides
    String retrofitUrl() {
        return Constants.BASE_URL;
    }

    @ApplicationScope
    @Provides
    TvDbService getMovieDbService(Retrofit retrofit) {
        return retrofit.create(TvDbService.class);
    }
}
