package net.derohimat.mvpandroid.data.datamanager.preference;


import android.content.Context;
import android.content.SharedPreferences;

import net.derohimat.mvpandroid.di.qualifiers.ApplicationContext;
import net.derohimat.mvpandroid.di.qualifiers.PrefFile;
import net.derohimat.mvpandroid.di.scopes.ApplicationScope;
import net.derohimat.mvpandroid.utils.Constants;

import javax.inject.Inject;

@ApplicationScope
public class AppPreferenceManager implements PreferenceHelper {

    private SharedPreferences mPrefs;

    @Inject
    public AppPreferenceManager(@ApplicationContext Context context, @PrefFile String prefName) {
        mPrefs = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
    }

    @Override
    public void addCurrentUserEmail(final String email) {
        mPrefs.edit().putString(Constants.PREF_USER_EMAIL, email).apply();
    }

    @Override
    public String getCurrentUserEmail() {
        return mPrefs.getString(Constants.PREF_USER_EMAIL, null);
    }

    @Override
    public void deleteCredentials() {
        mPrefs.edit().clear().apply();
    }


}
