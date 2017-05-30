package retrofit.android.bynnean.myinvoke;

import java.lang.reflect.Proxy;

/**
 * Created by 乾隆大帝001 on 2017/5/26.
 */

public class SellImp {
    public static  void sellRun(){
        //创建中介类实例
        MyDynicAgent  inter = new MyDynicAgent(new Vendor());// 加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
          ISell sell = (ISell)(Proxy.newProxyInstance(ISell.class.getClassLoader(), new Class[] {ISell.class}, inter));  //通过代理类对象调用代理类方法，实际上会转到invoke方法调用
         sell.sell();
         sell.ad();
    }
}
