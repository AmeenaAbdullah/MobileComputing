package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,clear,add,sub,div,mul,equal;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=findViewById(R.id.display);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);

        clear=findViewById(R.id.clear);
        equal=findViewById(R.id.equal);

        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);

         one.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
             display.setText("1");
             }
         });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("2");
            }

        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("1");
            }

        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("1");
            }

        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("1");
            }

        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("1");
            }

        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("1");
            }

        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("1");
            }

        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("1");
            }

        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("1");
            }

        });

    }
}