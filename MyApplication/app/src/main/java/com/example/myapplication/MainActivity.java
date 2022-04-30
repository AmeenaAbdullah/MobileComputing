package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button reset,increase,decrease;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increase=findViewById(R.id.button2);
        decrease=findViewById(R.id.button3);
        reset=findViewById(R.id.button);

    }
}