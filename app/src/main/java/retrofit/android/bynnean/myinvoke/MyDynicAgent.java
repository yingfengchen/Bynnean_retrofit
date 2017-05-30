package retrofit.android.bynnean.myinvoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 乾隆大帝001 on 2017/5/26.
 */

public class MyDynicAgent implements InvocationHandler {

    private Object obj; //obj为委托类对象；
    public MyDynicAgent(Object obj)
    {  this.obj = obj;   }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

      System.out.println("before");
        Object result = method.invoke(obj, args);
        System.out.println("after");
        return result;
    }
}
