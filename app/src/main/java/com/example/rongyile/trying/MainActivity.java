package com.example.rongyile.trying;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("trying");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i=add(9,11);
        ((TextView) findViewById(R.id.tv)).setText(String.valueOf(i));
    }

    public native int add(int a,int b);
}
