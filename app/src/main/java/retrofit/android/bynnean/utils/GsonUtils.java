package retrofit.android.bynnean.utils;

import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Comment:
 * <p>
 * Name: GsonUtils
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-27 15:00
 */

public class GsonUtils {

    private static GsonBuilder instance;

    private static synchronized GsonBuilder build() {
        if( instance == null ) {
            instance = new GsonBuilder();
        }
        return instance;
    }

    private static GsonBuilder getInstance() {
        return build();
    }

    public static String toJson( Object obj ) {

        try {
            return getInstance().create().toJson( obj );
        } catch( Exception e ) {

        }
        return null;
    }

    public static String toJson( List<?> list ) {

        try {
            return getInstance().create().toJson( list );
        } catch( Exception e ) {

        }
        return null;
    }

    public static <T> T fromJson( String json, Class<T> clazz ) {
        try {
            return getInstance().create().fromJson( json, clazz );
        } catch( Exception e ) {

        }
        return null;

    }

}

