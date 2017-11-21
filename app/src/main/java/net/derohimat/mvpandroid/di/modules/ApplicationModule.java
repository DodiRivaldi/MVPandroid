package net.derohimat.mvpandroid.di.modules;

import android.content.Context;

import net.derohimat.mvpandroid.MvpAndroid;
import net.derohimat.mvpandroid.data.datamanager.AppDataManager;
import net.derohimat.mvpandroid.data.datamanager.DataManager;
import net.derohimat.mvpandroid.data.datamanager.network.AppNetworkManager;
import net.derohimat.mvpandroid.data.datamanager.network.NetworkHelper;
import net.derohimat.mvpandroid.data.datamanager.preference.AppPreferenceManager;
import net.derohimat.mvpandroid.data.datamanager.preference.PreferenceHelper;
import net.derohimat.mvpandroid.di.qualifiers.ApplicationContext;
import net.derohimat.mvpandroid.di.qualifiers.PrefFile;
import net.derohimat.mvpandroid.di.scopes.ApplicationScope;
import net.derohimat.mvpandroid.utils.Constants;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private MvpAndroid app;

    public ApplicationModule(MvpAndroid app) {
        this.app = app;
    }

    @ApplicationContext
    @Provides
    Context provideContext() {
        return app;
    }

    @PrefFile
    @Provides
    String providePrefFile() {
        return Constants.PREF_FILENAME;
    }

    @ApplicationScope
    @Provides
    DataManager provideDataManger(AppDataManager appDataManager) {
        return appDataManager;
    }

    @ApplicationScope
    @Provides
    PreferenceHelper providePreferenceHelper(AppPreferenceManager appPreferenceManager) {
        return appPreferenceManager;
    }

    @ApplicationScope
    @Provides
    NetworkHelper provideNetworkHelper(AppNetworkManager networkManager) {
        return networkManager;
    }
}
