package com.study.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String value=JNITest.get();
        Toast.makeText(this,JNITest.get()+"返回值为->"+value,Toast.LENGTH_SHORT).show();
//        Log.e("message->",JNITest.get()+"------------");
    }
}
