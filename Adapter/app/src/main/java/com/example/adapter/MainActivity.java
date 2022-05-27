package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<String> arraylist=new ArrayList<String>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arraylist.add("Laiba");
        arraylist.add("iqra");
        arraylist.add("amna");
        arraylist.add("ameena");

    }
}