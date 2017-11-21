package net.derohimat.mvpandroid.data.datamanager.preference;

public interface PreferenceHelper {

    void addCurrentUserEmail(String email);

    String getCurrentUserEmail();

    void deleteCredentials();
}
