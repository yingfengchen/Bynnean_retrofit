package retrofit.android.bynnean.annotation;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class App implements InvocationHandler {

    @MethodInfo(
    	name = "xujun",id =12,gid = Long.class)
    public String getAppName() {
        return "trinea";
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}