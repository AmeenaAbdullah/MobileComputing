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
    String heading;
    String subheading;
    int imageid;
    public Student(String heading, String subheading, int imageid) {
        this.heading = heading;
        this.subheading = subheading;
        this.imageid = imageid;
    }

    public String getHeading() {
        return heading;
    }

    public String getSubheading() {
        return subheading;
    }

    public int getImageid() {
        return imageid;
    }

}