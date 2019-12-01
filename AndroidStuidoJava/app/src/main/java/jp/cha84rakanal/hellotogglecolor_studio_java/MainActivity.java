package jp.cha84rakanal.hellotogglecolor_studio_java;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    private boolean mToggle = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onButtonClick(View v){
        Log.v(MainActivity.class.getSimpleName(),"onButtonClick");
        mToggle = !mToggle;
        findViewById(R.id.back).setBackgroundColor( mToggle? 0xFFFF0000 : 0xFF0000FF);
    }
}
