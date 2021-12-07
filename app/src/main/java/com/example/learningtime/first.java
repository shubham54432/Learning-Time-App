package com.example.learningtime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        CardView cd1=(CardView) findViewById(R.id.cd1);
        CardView cd2=(CardView)findViewById(R.id.cd2);
        CardView cd3=(CardView)findViewById(R.id.cd3);
        CardView cd4=(CardView)findViewById(R.id.cd4);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd1=new Intent(first.this,second.class);
                startActivity(cd1);
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd2=new Intent(first.this,second.class);
                startActivity(cd2);
            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd3=new Intent(first.this,second.class);
                startActivity(cd3);
            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cd4=new Intent(first.this,second.class);
                startActivity(cd4);
            }
        });
    }
}