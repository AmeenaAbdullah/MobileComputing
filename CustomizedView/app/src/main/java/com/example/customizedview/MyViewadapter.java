package com.example.customizedview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyViewadapter extends ArrayAdapter<Student> {

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student myclass = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.customizedview,parent,false);
        ImageView imageview = convertView.findViewById(R.id.imageheading);
        TextView fruittv = convertView.findViewById(R.id.fruitnames);
        TextView subtv = convertView.findViewById(R.id.submsg);
        imageview.setImageResource(myclass.imageid);
        fruittv.setText(myclass.heading);
        subtv.setText(myclass.subheading);

        return convertView;
    }

    public MyViewadapter(@NonNull Context context, ArrayList<Student> studentArrayList) {
        super(context, 0, studentArrayList);
    }

}
