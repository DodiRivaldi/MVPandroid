package derohimat.mvpandroid.data.datamanager.preference;

/**
 * Created by mohak on 26/5/17.
 */

public interface PreferenceHelper {

    void addCurrentUserEmail(String email);

    String getCurrentUserEmail();

    void deleteCredentials();
}
