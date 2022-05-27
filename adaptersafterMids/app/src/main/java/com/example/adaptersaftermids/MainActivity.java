package com.example.adaptersaftermids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> arraylist=new ArrayList<String>(this,android.R);
        arraylist.add("Laiba");
        arraylist.add("iqra");
        arraylist.add("amna");
        arraylist.add("ameena");
        ListView listiew=findViewById(R.id.list);
        listiew.setAdapter((ListAdapter) arraylist);
    }
}