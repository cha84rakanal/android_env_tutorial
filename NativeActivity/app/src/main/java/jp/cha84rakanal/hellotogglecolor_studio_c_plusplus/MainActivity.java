package jp.cha84rakanal.hellotogglecolor_studio_c_plusplus;

import android.app.NativeActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends NativeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("java_code","in onCreate");
    }

}
