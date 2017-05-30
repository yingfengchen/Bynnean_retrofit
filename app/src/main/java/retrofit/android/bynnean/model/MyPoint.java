package retrofit.android.bynnean.model;

import android.graphics.Point;

/**
 * Created by 乾隆大帝001 on 2017/5/17.
 */

public class MyPoint {
    private  Object x;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }

    private  Object y;


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(String strX, String strY) {

        this.x = strX;
        this.y = strY;
    }

    public MyPoint(Point pointX, Point pointY) {
        this.x = pointX;
        this.y = pointY;
    }
    public  MyPoint(Object x,Object y)
    {

    }

}
