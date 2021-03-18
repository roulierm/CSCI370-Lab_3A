package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         listView = (ListView) findViewById(R.id.student);

         Student student;
         ArrayList<Student> students = new ArrayList<>();

         student = new Student();
         student.setFirstName("Bob");
         student.setLastName("Smith");
         student.setMajor("Computer Science");
         students.add(student);

        student = new Student();
        student.setFirstName("Mary");
        student.setLastName("Johnson");
        student.setMajor("Communications");
        students.add(student);

        student = new Student();
        student.setFirstName("Andre");
        student.setLastName("Robertson");
        student.setMajor("Art History");
        students.add(student);

        student = new Student();
        student.setFirstName("Nicole");
        student.setLastName("Baker");
        student.setMajor("Biology");
        students.add(student);

        student = new Student();
        student.setFirstName("Olivia");
        student.setLastName("Helms");
        student.setMajor("Data Science");
        students.add(student);

        StudentAdapter adapter = new StudentAdapter(this,students);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Short Click", Toast.LENGTH_SHORT).show();
            }
        });


        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Long Click", Toast.LENGTH_SHORT).show();

                return true;
            }
        });

    }
}