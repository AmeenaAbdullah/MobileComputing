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
        Student s= getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.customizedview, parent, false);
        TextView Name=convertView.findViewById(R.id.textView2);
        TextView Id=convertView.findViewById(R.id.id2);
        ImageView i=convertView.findViewById(R.id.imageView2);

        Name.setText(s.Name);
        Id.setText(s.Id);
        i.setImageResource(s.imgId);
        return convertView;
    }

    public MyViewadapter(@NonNull Context context, ArrayList<Student> studentArrayList) {
        super(context, 0, studentArrayList);
    }

}
