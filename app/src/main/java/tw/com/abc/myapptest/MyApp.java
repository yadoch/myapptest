package tw.com.abc.myapptest;

import android.app.Application;
import android.util.Log;

/**
 * Created by geoff on 2017/7/28.
 */

// extend Application -- 自訂Application
public class MyApp extends Application{
    public int stage;


    @Override
    public void onCreate() {
        super.onCreate();

        Log.i("geoff","app: onCreate");
        stage=10;
    }
}
