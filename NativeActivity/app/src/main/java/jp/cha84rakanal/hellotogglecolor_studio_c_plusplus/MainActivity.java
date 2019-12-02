package jp.cha84rakanal.hellotogglecolor_studio_c_plusplus;

import android.annotation.SuppressLint;
import android.app.NativeActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class MainActivity extends NativeActivity {

    MainActivity activity;
    PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("java_code","in onCreate");
    }

    // Our popup window, you will call it from your C/C++ code later
    @SuppressLint("InflateParams")
    public void showUI() {

        Log.v("java_code","showui Called");

        if( popupWindow != null )
            return;

        activity = this;

        this.runOnUiThread(()->{

            LayoutInflater layoutInflater
                    = (LayoutInflater)getBaseContext()
                    .getSystemService(LAYOUT_INFLATER_SERVICE);
            View popupView = layoutInflater.inflate(R.layout.activity_main, null);

            popupWindow = new PopupWindow(
                    popupView,
                    WindowManager.LayoutParams.WRAP_CONTENT,
                    WindowManager.LayoutParams.WRAP_CONTENT);

            LinearLayout mainLayout = new LinearLayout(activity);
            ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
            params.setMargins(0, 0, 0, 0);

            activity.setContentView(mainLayout, params);

            // Show our UI over NativeActivity window
            popupWindow.showAtLocation(mainLayout, Gravity.CENTER, 0, 0);
            popupWindow.update();

        });

    }

}
