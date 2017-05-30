package retrofit.android.bynnean;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Comment:
 * <p>
 * Name: Api
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-28 11:23
 */

public class Api extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        Realm realm = Realm.getInstance(new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .name(getPackageName()+".realm")
                .build());
    }
}
