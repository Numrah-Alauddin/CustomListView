package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayAdapter<Student> adapter;
    ArrayList<Student> arrayList;
    EditText std_id;
    EditText std_name;
    Button add;
    Button dlt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.students_list);
        std_id=findViewById(R.id.std_id);
        std_name=findViewById(R.id.name);
        add=findViewById(R.id.add);
        dlt=findViewById(R.id.delete);

        arrayList=new ArrayList<>();

       /* Student s1 = new Student(R.drawable.ic_launcher_background, "Ali", "123");
        arrayList.add(s1);
        Student s2 = new Student(R.drawable.ic_launcher_background, "Ali", "123");
        arrayList.add(s2);

        arrayList.add(new Student(R.drawable.ic_launcher_background, "Ali", "123"));*/

        final CustomAdapter adapter = new CustomAdapter(this, R.layout.student_item, arrayList);

        //adapter=new ArrayAdapter<>(this,R.layout.student_item,students);

        list.setAdapter(adapter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=std_id.getText().toString();
                String name=std_name.getText().toString();

                Student std=new Student(R.mipmap.ic_launcher,name,id);
                arrayList.add(std);
                adapter.notifyDataSetChanged();
            }
        });

        dlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.remove(0);
                Toast.makeText(MainActivity.this, "Item removed", Toast.LENGTH_SHORT).show();
                adapter.notifyDataSetChanged();
            }
        });

    }
}
