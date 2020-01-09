package com.beacool.screenmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics dm = getResources().getDisplayMetrics();
        float density = dm.density;        // 屏幕密度（像素比例：0.75/1.0/1.5/2.0）
        int densityDPI = dm.densityDpi;

        float xdpi = dm.xdpi;
        float ydpi = dm.ydpi;

        Log.e(TAG , "  DisplayMetrics111---> density: "   + density + "; densityDPI=" + densityDPI);
        Log.e(TAG ,"  DisplayMetrics222 --->" +  "xdpi=" + xdpi + "; ydpi=" + ydpi);

    }
}
