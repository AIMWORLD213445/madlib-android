package com.epicodus.lavalibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MadlibActivity extends AppCompatActivity {
    private TextView madlib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlib);
        madlib = (TextView) findViewById(R.id.madlib);
        Intent intent = getIntent();
        ArrayList<String> madlibs = intent.getStringArrayListExtra("madlibs");


        madlib.setText("your words:" + madlibs.get(0) + madlibs.get(1) +madlibs.get(2));
    }
}
