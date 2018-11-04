package com.example.vartikasharma.youiet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateThurs extends AppCompatActivity {
    EditText th_one, th_two, th_three, th_four,th_five , th_six, th_seven, th_eight;
    SharedPreferences sharedpreferences;

    Button save;
    public static final String th1 = "thKey1";
    public static final String th2 = "thKey2";
    public static final String th3 = "thKey3";
    public static final String th4 = "thKey4";
    public static final String th5 = "thKey5";
    public static final String th6 = "thKey6";
    public static final String th7 = "thKey7";
    public static final String th8 = "thKey8";
    public static final String mypreference = "mypref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_thurs);
        th_one = findViewById(R.id.one);
        th_two = findViewById(R.id.two);
        th_three = findViewById(R.id.three);
        th_four = findViewById(R.id.four);
        th_five = findViewById(R.id.five);
        th_six = findViewById(R.id.six);
        th_seven = findViewById(R.id.seven);
        th_eight = findViewById(R.id.eight);
        save = (Button)findViewById(R.id.save4);

        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(th1)) {
            th_one.setText(sharedpreferences.getString(th1, ""));
        }
        if (sharedpreferences.contains(th2)) {
            th_two.setText(sharedpreferences.getString(th2, ""));

        }
        if (sharedpreferences.contains(th3)) {
            th_three.setText(sharedpreferences.getString(th3, ""));

        }
        if (sharedpreferences.contains(th4)) {
            th_four.setText(sharedpreferences.getString(th4, ""));

        }
        if (sharedpreferences.contains(th5)) {
            th_five.setText(sharedpreferences.getString(th5, ""));

        }
        if (sharedpreferences.contains(th6)) {
            th_six.setText(sharedpreferences.getString(th6, ""));

        }
        if (sharedpreferences.contains(th7)) {
            th_seven.setText(sharedpreferences.getString(th7, ""));

        }
        if (sharedpreferences.contains(th8)) {
            th_eight.setText(sharedpreferences.getString(th8, ""));

        }
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tr1 = th_one.getText().toString();
                String tr2 = th_two.getText().toString();
                String tr3 = th_three.getText().toString();
                String tr4 = th_four.getText().toString();
                String tr5 = th_five.getText().toString();
                String tr6 = th_six.getText().toString();
                String tr7 = th_seven.getText().toString();
                String tr8 = th_eight.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(th1, tr1);
                editor.putString(th2, tr2);
                editor.putString(th3, tr3);
                editor.putString(th4, tr4);
                editor.putString(th5, tr5);
                editor.putString(th6, tr6);
                editor.putString(th7, tr7);
                editor.putString(th8, tr8);
                editor.commit();

                Intent i4 = new Intent(getApplicationContext(), timetable.class);
                startActivity(i4);

            }
        });
    }
}
