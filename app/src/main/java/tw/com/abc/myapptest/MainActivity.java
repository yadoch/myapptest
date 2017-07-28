package tw.com.abc.myapptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyApp myApp;
    private String name ="Geoff";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myApp=(MyApp)getApplication();
        Log.i("geoff","Main activity: onCreate:" + myApp.stage);
        myApp.mainActivity = this;

    }
    public String getName(){
        return  name;
    }

    public void gotoPage2(View v){
        Intent it = new Intent(this,Page2Activity.class);
        startActivity(it);
    }

}
