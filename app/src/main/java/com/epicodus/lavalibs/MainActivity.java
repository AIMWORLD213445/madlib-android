package com.epicodus.lavalibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button button;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verb = editText1.getText().toString();
                String adjective = editText2.getText().toString();
                String noun = editText3.getText().toString();
                Intent intent = new Intent(MainActivity.this, MadlibActivity.class);
                intent.putExtra("verb", verb);
                intent.putExtra("adjective", adjective);
                intent.putExtra("noun", noun);
                startActivity(intent);
            }
        });

    }
}