package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Student> {

    Student[] students1;

    public CustomAdapter( Context context, int resource, Student[] students) {
        super(context, resource, students);
        this.students1=students;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view= LayoutInflater.from(getContext()).inflate(R.layout.student_item,parent,false);

        ImageView image=view.findViewById(R.id.student_image);
        TextView id=view.findViewById(R.id.student_id);
        TextView name=view.findViewById(R.id.student_name);

        /*name.setText("ALi");
        id.setText("123");
        image.setImageResource(R.drawable.ic_launcher_background);
        */

        Student std=students1[position];

        name.setText(std.getName());
        id.setText(std.getId());
        image.setImageResource(std.getStudent_image());

        return view;


    }
}
