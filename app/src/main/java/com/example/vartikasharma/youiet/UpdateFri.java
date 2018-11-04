package com.example.vartikasharma.youiet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateFri extends AppCompatActivity {
    EditText fri_one, fri_two, fri_three, fri_four,fri_five , fri_six, fri_seven, fri_eight;
    SharedPreferences sharedpreferences;

    Button save;
    public static final String fri1 = "Key1";
    public static final String fri2 = "Key2";
    public static final String fri3 = "Key3";
    public static final String fri4 = "Key4";
    public static final String fri5 = "Key5";
    public static final String fri6 = "Key6";
    public static final String fri7 = "Key7";
    public static final String fri8 = "Key8";
    public static final String mypreference = "mypref";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_fri);
        fri_one = findViewById(R.id.one);
        fri_two = findViewById(R.id.two);
        fri_three = findViewById(R.id.three);
        fri_four = findViewById(R.id.four);
        fri_five = findViewById(R.id.five);
        fri_six = findViewById(R.id.six);
        fri_seven = findViewById(R.id.seven);
        fri_eight = findViewById(R.id.eight);
        save = findViewById(R.id.save5);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(fri1)) {
            fri_one.setText(sharedpreferences.getString(fri1, ""));
        }
        if (sharedpreferences.contains(fri2)) {
            fri_two.setText(sharedpreferences.getString(fri2, ""));

        }
        if (sharedpreferences.contains(fri3)) {
            fri_three.setText(sharedpreferences.getString(fri3, ""));

        }
        if (sharedpreferences.contains(fri4)) {
            fri_four.setText(sharedpreferences.getString(fri4, ""));

        }
        if (sharedpreferences.contains(fri5)) {
            fri_five.setText(sharedpreferences.getString(fri5, ""));

        }
        if (sharedpreferences.contains(fri6)) {
            fri_six.setText(sharedpreferences.getString(fri6, ""));

        }
        if (sharedpreferences.contains(fri7)) {
            fri_seven.setText(sharedpreferences.getString(fri7, ""));

        }
        if (sharedpreferences.contains(fri8)) {
            fri_eight.setText(sharedpreferences.getString(fri8, ""));

        }
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String f1 = fri_one.getText().toString();
                String f2 = fri_two.getText().toString();
                String f3 = fri_three.getText().toString();
                String f4 = fri_four.getText().toString();
                String f5 = fri_five.getText().toString();
                String f6 = fri_six.getText().toString();
                String f7 = fri_seven.getText().toString();
                String f8 = fri_eight.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(fri1, f1);
                editor.putString(fri2, f2);
                editor.putString(fri3, f3);
                editor.putString(fri4, f4);
                editor.putString(fri5, f5);
                editor.putString(fri6, f6);
                editor.putString(fri7, f7);
                editor.putString(fri8, f8);
                editor.commit();

                Intent i5 = new Intent(getApplicationContext(), timetable.class);
                startActivity(i5);

            }
        });
    }
}
