package tw.com.abc.myapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private MyApp myApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myApp=(MyApp)getApplication();
        Log.i("geoff","Main activity: onCreate:" + myApp.stage);

    }
}
