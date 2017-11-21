package net.derohimat.mvpandroid.di.components;

import net.derohimat.mvpandroid.MvpAndroid;
import net.derohimat.mvpandroid.data.datamanager.DataManager;
import net.derohimat.mvpandroid.di.modules.ApplicationModule;
import net.derohimat.mvpandroid.di.modules.NetworkModule;
import net.derohimat.mvpandroid.di.scopes.ApplicationScope;

import dagger.Component;

@ApplicationScope
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {

    void inject(MvpAndroid app);

    DataManager getDataManager();

}

