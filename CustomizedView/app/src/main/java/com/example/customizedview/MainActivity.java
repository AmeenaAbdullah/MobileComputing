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
       //ListView listView=findViewById(R.id.listView);



        ArrayList<Student> myClassArrayList = new ArrayList<Student>();
        myClassArrayList.add(new Student("Fruit Names","Learn about 10 Fruit Names",R.drawable.undraw_profile_pic_ic5t));
        myClassArrayList.add(new Student("Color Names","Learn about 10 Color Names",R.drawable.undraw_profile_pic_ic5t));
        myClassArrayList.add(new Student("Body Parts Names","Learn about 10 Body Part Names",R.drawable.undraw_profile_pic_ic5t));
        myClassArrayList.add(new Student("Vegetable Names","Learn about 10 Vegetable Names",R.drawable.undraw_profile_pic_ic5t));
        myClassArrayList.add(new Student("Animals Names","Learn about 10 Animal Names",R.drawable.undraw_profile_pic_ic5t));
        myClassArrayList.add(new Student("Flower Names","Learn about 10 Flower Names",R.drawable.undraw_profile_pic_ic5t));
        myClassArrayList.add(new Student("Vehicle Names","Learn about 10 Vehicle Names",R.drawable.undraw_profile_pic_ic5t));
        myClassArrayList.add(new Student("Birds Names","Learn about 10 Bird Names",R.drawable.undraw_profile_pic_ic5t));
        myClassArrayList.add(new Student("Insect Names","Learn about 10 Insect Names",R.drawable.undraw_profile_pic_ic5t));

        MyViewadapter adapter=new MyViewadapter(this,myClassArrayList);
        ListView listview=findViewById(R.id.listView);
        listview.setAdapter(adapter);
    }

}