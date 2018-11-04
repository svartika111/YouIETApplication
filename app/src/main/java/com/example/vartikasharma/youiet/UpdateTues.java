package com.example.vartikasharma.youiet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateTues extends AppCompatActivity {
    EditText tu_one, tu_two, tu_three, tu_four,tu_five , tu_six, tu_seven, tu_eight;
    SharedPreferences sharedpreferences;

    Button save;
    public static final String tu1 = "t_Key1";
    public static final String tu2 = "t_Key2";
    public static final String tu3 = "t_Key3";
    public static final String tu4 = "t_Key4";
    public static final String tu5 = "t_Key5";
    public static final String tu6 = "t_Key6";
    public static final String tu7 = "t_Key7";
    public static final String tu8 = "t_Key8";
    public static final String mypreference = "mypref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_tues);
        tu_one = findViewById(R.id.one);
        tu_two = findViewById(R.id.two);
        tu_three = findViewById(R.id.three);
        tu_four = findViewById(R.id.four);
        tu_five = findViewById(R.id.five);
        tu_six = findViewById(R.id.six);
        tu_seven = findViewById(R.id.seven);
        tu_eight = findViewById(R.id.eight);
        save = (Button)findViewById(R.id.save2);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(tu1)) {
            tu_one.setText(sharedpreferences.getString(tu1, ""));
        }
        if (sharedpreferences.contains(tu2)) {
            tu_two.setText(sharedpreferences.getString(tu2, ""));

        }
        if (sharedpreferences.contains(tu3)) {
            tu_three.setText(sharedpreferences.getString(tu3, ""));

        }
        if (sharedpreferences.contains(tu4)) {
            tu_four.setText(sharedpreferences.getString(tu4, ""));

        }
        if (sharedpreferences.contains(tu5)) {
            tu_five.setText(sharedpreferences.getString(tu5, ""));

        }
        if (sharedpreferences.contains(tu6)) {
            tu_six.setText(sharedpreferences.getString(tu6, ""));

        }
        if (sharedpreferences.contains(tu7)) {
            tu_seven.setText(sharedpreferences.getString(tu7, ""));

        }
        if (sharedpreferences.contains(tu8)) {
            tu_eight.setText(sharedpreferences.getString(tu8, ""));

        }
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String t1 = tu_one.getText().toString();
                String t2 = tu_two.getText().toString();
                String t3 = tu_three.getText().toString();
                String t4 = tu_four.getText().toString();
                String t5 = tu_five.getText().toString();
                String t6 = tu_six.getText().toString();
                String t7 = tu_seven.getText().toString();
                String t8 = tu_eight.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(tu1, t1);
                editor.putString(tu2, t2);
                editor.putString(tu3, t3);
                editor.putString(tu4, t4);
                editor.putString(tu5, t5);
                editor.putString(tu6, t6);
                editor.putString(tu7, t7);
                editor.putString(tu8, t8);
                editor.commit();

                Intent i2= new Intent(getApplicationContext(), timetable.class);
                startActivity(i2);

            }
        });
    }
}
