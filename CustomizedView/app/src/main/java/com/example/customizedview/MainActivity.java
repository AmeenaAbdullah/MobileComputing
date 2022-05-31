package com.example.customizedview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.listView);
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(new Student("ameena","1",R.drawable.undraw_profile_pic_ic5t));
        studentArrayList.add(new Student("amna","3",R.drawable.undraw_profile_pic_ic5t));
        studentArrayList.add(new Student("Laiba","2",R.drawable.undraw_profile_pic_ic5t));
        studentArrayList.add(new Student("iqra","5",R.drawable.undraw_profile_pic_ic5t));
       MyViewadapter adapter = new MyViewadapter(this, studentArrayList);


        listView.setAdapter(adapter);

    }
}