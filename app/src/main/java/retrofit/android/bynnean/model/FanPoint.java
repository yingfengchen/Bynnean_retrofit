package retrofit.android.bynnean.model;

import android.util.Log;

/**
 * Created by 乾隆大帝001 on 2017/5/17.
 */

public class FanPoint<T,F> {
    T x;
    F y;

    public FanPoint() {

    }
    public FanPoint(T x, F y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public F getY() {
        return y;
    }

    public void setY(F y) {
        this.y = y;
    }

    public <V,D> void  printPoint(V v,D d)
    {
        V x=v;
        D y=d;
        Log.i("test","this point is"+x +","+y);
    }
}
