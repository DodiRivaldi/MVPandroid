package derohimat.mvpandroid.di.components;

import dagger.Component;
import derohimat.mvpandroid.MvpAndroid;
import derohimat.mvpandroid.data.datamanager.DataManager;
import derohimat.mvpandroid.di.modules.ApplicationModule;
import derohimat.mvpandroid.di.modules.NetworkModule;
import derohimat.mvpandroid.di.scopes.ApplicationScope;

/**
 * Created by mohak on 19/5/17.
 */

@ApplicationScope
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {

    void inject(MvpAndroid app);

    DataManager getDataManager();

}

