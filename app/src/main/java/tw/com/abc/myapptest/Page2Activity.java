package tw.com.abc.myapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import static tw.com.abc.myapptest.MyApp.test;
public class Page2Activity extends AppCompatActivity {
    private MyApp myApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        myApp =(MyApp)getApplication();
        Log.i("geoff","Page2 onCreate:"+myApp.stage);

        Log.i("geoff","stage = "+myApp.stage);
        Log.i("geoff","name=" + myApp.mainActivity.getName());
        Log.i("geoff", "test is " + test);
    }
}
