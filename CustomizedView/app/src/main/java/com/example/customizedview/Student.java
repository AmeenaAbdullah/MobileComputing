package com.example.customizedview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Student {

    public String Name;
    public String Id;
    public int imgId;

    public Student(String name, String id, int imgId) {
        Name = name;
        Id = id;
        this.imgId = imgId;
    }

    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }

    public int getImgId() {
        return imgId;
    }


}