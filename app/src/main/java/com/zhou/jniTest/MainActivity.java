package com.zhou.jniTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    JniDemo jni ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         jni = new JniDemo();
    }

    public void click(View view) {
       String str = jni.getFromC();
        Log.d("MainActivity", str);
    }
}
