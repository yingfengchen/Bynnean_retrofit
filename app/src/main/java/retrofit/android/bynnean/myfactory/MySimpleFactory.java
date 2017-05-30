package retrofit.android.bynnean.myfactory;

/**
 * Created by 乾隆大帝001 on 2017/5/18.
 */

public class MySimpleFactory {
    public  static  <T extends IProduct> T create(Class<T> cls)
    {
        IProduct iProduct= null;
        try {
            iProduct = (IProduct)Class.forName(cls.getName()).newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
       return (T) iProduct;
    }
}
