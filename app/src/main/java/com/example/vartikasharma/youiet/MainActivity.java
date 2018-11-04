package com.example.vartikasharma.youiet;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    SharedPreferences sharedpreferences;
    TextView br;
    TextView sem;
    public static final String mypreference = "mypref";
    public static final String Branch = "nameKey";
    public static final String Semester = "emailKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        br = (TextView) findViewById(R.id.branch);
        sem = (TextView) findViewById(R.id.semester);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(Branch)) {
            br.setText(sharedpreferences.getString(Branch, ""));
        }
        if (sharedpreferences.contains(Semester)) {
            sem.setText(sharedpreferences.getString(Semester, ""));

        }

    }

    public void Save(View view) {
        String n = br.getText().toString();
        String e = sem.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(Branch, n);
        editor.putString(Semester, e);
        editor.commit();
        if(br.getText().toString().isEmpty() )
        {

            br.setError("please enter your branch");
            return;
        }
        if(sem.getText().toString().isEmpty() )
        {
            sem.setError("please enter your semester");

            return;
        }

        else {
            Intent intent = new Intent(MainActivity.this,attendacechecker.class);
            startActivity(intent);
        }
    }



    public void NEXT(View view) {

        if(br.getText().toString().isEmpty() )
        {

            br.setError("please enter your branch");
            return;
        }
        if(sem.getText().toString().isEmpty() )
        {
            sem.setError("please enter your semester");

            return;
        }

        else {
            Intent intent = new Intent(MainActivity.this,attendacechecker.class);
            startActivity(intent);
        }


    }



}
