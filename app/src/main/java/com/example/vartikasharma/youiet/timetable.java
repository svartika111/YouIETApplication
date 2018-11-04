package com.example.vartikasharma.youiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class timetable extends AppCompatActivity {

    TextView upmon, uptues, upwed, upthurs, upfri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        upmon = findViewById(R.id.upmon);
        uptues = findViewById(R.id.uptues);
        upwed = findViewById(R.id.upwed);
        upthurs = findViewById(R.id.upthur);
        upfri = findViewById(R.id.upfri);

        upmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), UpdateMon.class);
                startActivity(i1);
            }
        });
        uptues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(), UpdateTues.class);
                startActivity(i2);
            }
        });
        upwed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(), UpdateWed.class);
                startActivity(i3);
            }
        });
        upthurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getApplicationContext(), UpdateThurs.class);
                startActivity(i4);
            }
        });
        upfri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getApplicationContext(), UpdateFri.class);
                startActivity(i5);
            }
        });

    }
}

