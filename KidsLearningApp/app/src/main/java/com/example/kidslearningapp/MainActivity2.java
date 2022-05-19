package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button a=findViewById(R.id.a);
    }

    public void clicked(View v) {
        Intent send = new Intent(MainActivity2.this, MainActivity3.class);
        switch(v.getId())
        {
            case R.id.a:{
              send.putExtra("alphabet","a");
                startActivity(send);
                break;
            }
        }


        }



}