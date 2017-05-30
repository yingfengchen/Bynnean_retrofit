package retrofit.android.bynnean.bynnean_retrofit.convert;


import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import retrofit.android.bynnean.utils.GsonUtils;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Comment:
 * <p>
 * Name: Gson2ConvertFactory
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-05-04 09:59
 */

public class Gson2ConvertFactory extends Converter.Factory {

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        final Class<?> cls = type.getClass();
        TypeToken typeToken = TypeToken.get(type);
        Class clss = typeToken.getRawType();
        if(!cls.isInterface()){
            return new GsonConverAdapter(clss);
        } else return  null;
    }


    class    GsonConverAdapter implements Converter<ResponseBody,Object>{

        Class objCls;

        public GsonConverAdapter(Class cls){
           this.objCls = cls;
        }


        @Override
        public Object convert(ResponseBody value) throws IOException {
            String jsonValue ="";
            if(null != value){
               jsonValue = value.string();
            }
            Object ob = GsonUtils.fromJson(jsonValue,objCls);
            return ob;
        }
    }
}
