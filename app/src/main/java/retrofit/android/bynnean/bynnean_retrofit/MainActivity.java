package retrofit.android.bynnean.bynnean_retrofit;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.reflect.ParameterizedType;

import retrofit.android.bynnean.annotation.ParseAnnotation;
import retrofit.android.bynnean.builder.BaseApi;
import retrofit.android.bynnean.bynnean_retrofit.convert.Gson2ConvertFactory;
import retrofit.android.bynnean.bynnean_retrofit.convert.StringConvertFactor;
import retrofit.android.bynnean.gennericity.TypeTest;
import retrofit.android.bynnean.model.DeviceMotionInfo;
import retrofit.android.bynnean.model.FanPoint;
import retrofit.android.bynnean.myfactory.IProduct;
import retrofit.android.bynnean.myfactory.MySimpleFactory;
import retrofit.android.bynnean.myfactory.ProductA;
import retrofit.android.bynnean.myinvoke.SellImp;
import retrofit.android.bynnean.reflect.MainTest;
import retrofit.android.bynnean.reflect.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.string_convert).setOnClickListener(new View.OnClickListener() {
            /**
             * @param
             */
            @Override
            public void onClick(View v) {
                new BaseApi().initRetrofitBuilder().addConverterFactory(new StringConvertFactor());
                startActivity(new Intent(MainActivity.this,VideoListActivity.class));
            }
        });

        findViewById(R.id.gson_convert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new BaseApi().initRetrofitBuilder().addConverterFactory(new Gson2ConvertFactory());
                startActivity(new Intent(MainActivity.this,VideoGsonListActivity.class));
            }
        });

        Bitmap bitmap= BitmapFactory.decodeFile("");
        findViewById(R.id.upgrade).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                new APPUpdate().initData();
                new SystemUpgrade().getSystemInfo();
//
//                new DeviceMotionInfo().initDeviceMotionInfo();
//                FanPoint<String,String> fanPoint=new FanPoint<String, String>();
//                fanPoint.setX("北纬91度");
//                fanPoint.setY("东京112度");
//                fanPoint.printPoint("this is A","this is b");
//
//                IProduct productA= MySimpleFactory.create(ProductA.class);
//                if(productA!=null)
//                {
//                    productA.diffMothed();
//                    productA.smaeMothed();
//                }
//                //注解
//                ParseAnnotation.parseTypeAnnotation();
//                ParseAnnotation.main(null);

                //反射
//                MainTest.main(null);
//                Person person=new Person("1234",5);
//
//                //Type
                TypeTest.main(null);
//
////                ParameterizedType
//
//
//                //动态代理
//                SellImp.sellRun();





            }
        });
    }



}
