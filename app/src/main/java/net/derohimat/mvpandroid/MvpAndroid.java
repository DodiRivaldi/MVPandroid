package net.derohimat.mvpandroid;

import android.app.Application;
import android.content.Context;

import net.derohimat.mvpandroid.di.components.ApplicationComponent;
import net.derohimat.mvpandroid.di.components.DaggerApplicationComponent;
import net.derohimat.mvpandroid.di.modules.ApplicationModule;
import net.derohimat.mvpandroid.di.modules.NetworkModule;
import net.derohimat.mvpandroid.di.qualifiers.ApplicationContext;

import javax.inject.Inject;

public class MvpAndroid extends Application {

    private ApplicationComponent mApplicationComponent;

    @Inject
    @ApplicationContext
    Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .networkModule(new NetworkModule())
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    public Context getApplicationContext() {
        return applicationContext;
    }

}
