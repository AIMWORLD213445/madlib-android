package com.epicodus.lavalibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadlibActivity extends AppCompatActivity {
    private TextView madlib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlib);
        madlib = (TextView) findViewById(R.id.madlib);
        Intent intent = getIntent();
        String verb = intent.getStringExtra("verb");
        String adjective = intent.getStringExtra("adjective");
        String noun = intent.getStringExtra("noun");

        madlib.setText("your words:" + verb + adjective + noun);
    }
}
