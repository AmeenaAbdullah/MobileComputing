package com.example.kidslearningapp;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.os.Bundle;
public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String value=getIntent().getStringExtra("alphabet");
       Button b=findViewById(R.id.button);
        b.setText(value);
        ImageView imageview = (ImageView) findViewById(R.id.imageView);
      // if(value=="a" || value=="A")
            imageview.setImageResource(R.drawable.a);



    }

}