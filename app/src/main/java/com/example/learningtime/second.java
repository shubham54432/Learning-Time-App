package com.example.learningtime;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class second extends AppCompatActivity {
    ListView l;
    String []ob={"Syllabus","e-books","Notes","Sample Practical Files","Programs","Question Papers"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        l=findViewById(R.id.list);
        ArrayAdapter<String>arr;
        arr=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,ob);
        l.setAdapter(arr);
    }
}