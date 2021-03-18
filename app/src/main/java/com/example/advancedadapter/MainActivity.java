package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         listView = (ListView) findViewById(R.id.student);

         String[] student1 = {"Bob", "Smith", "Computer Science"};
         String[] student2 = {"Mary", "Johnson", "Communications"};
         String[] student3 = {"Andrew", "Robertson", "Art History"};
         String[] student4 = {"Nicole", "Baker", "Biology"};
         String[] student5 = {"Olivia", "Helms", "Data Science"};

        ArrayList<ArrayList<String> > students = new ArrayList<ArrayList<String> >();

        students.add(new ArrayList<String>(Arrays.asList(student1)));
        students.add(new ArrayList<String>(Arrays.asList(student2)));
        students.add(new ArrayList<String>(Arrays.asList(student3)));
        students.add(new ArrayList<String>(Arrays.asList(student4)));
        students.add(new ArrayList<String>(Arrays.asList(student5)));



    }
}