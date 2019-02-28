package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayAdapter<Student> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.students_list);


        Student[] students=new Student[3];
        students[0]=new Student(R.drawable.ic_launcher_background,"Ahmed","123");
        students[1]=new Student(R.drawable.ic_launcher_background,"Ali","456");
        students[2]=new Student(R.drawable.ic_launcher_background,"Sana","789");

        CustomAdapter adapter=new CustomAdapter(this,R.layout.student_item,students);

        //adapter=new ArrayAdapter<>(this,R.layout.student_item,students);

        list.setAdapter(adapter);

    }
}
