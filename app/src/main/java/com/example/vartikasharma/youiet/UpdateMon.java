package com.example.vartikasharma.youiet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateMon extends AppCompatActivity {

    EditText mon_one, mon_two, mon_three, mon_four,mon_five , mon_six, mon_seven, mon_eight;
    SharedPreferences sharedpreferences;

    Button save;
    public static final String mon1 = "m_Key1";
    public static final String mon2 = "m_Key2";
    public static final String mon3 = "m_Key3";
    public static final String mon4 = "m_Key4";
    public static final String mon5 = "m_Key5";
    public static final String mon6 = "m_Key6";
    public static final String mon7 = "m_Key7";
    public static final String mon8 = "m_Key8";
    public static final String mypreference = "mypref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_mon);

        mon_one = findViewById(R.id.one);
        mon_two = findViewById(R.id.two);
        mon_three = findViewById(R.id.three);
        mon_four = findViewById(R.id.four);
        mon_five = findViewById(R.id.five);
        mon_six = findViewById(R.id.six);
        mon_seven = findViewById(R.id.seven);
        mon_eight = findViewById(R.id.eight);
        save = (Button)findViewById(R.id.save1);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(mon1)) {
            mon_one.setText(sharedpreferences.getString(mon1, ""));
        }
        if (sharedpreferences.contains(mon2)) {
            mon_two.setText(sharedpreferences.getString(mon2, ""));

        }
        if (sharedpreferences.contains(mon3)) {
            mon_three.setText(sharedpreferences.getString(mon3, ""));

        }
        if (sharedpreferences.contains(mon4)) {
            mon_four.setText(sharedpreferences.getString(mon4, ""));

        }
        if (sharedpreferences.contains(mon5)) {
            mon_five.setText(sharedpreferences.getString(mon5, ""));

        }
        if (sharedpreferences.contains(mon6)) {
            mon_six.setText(sharedpreferences.getString(mon6, ""));

        }
        if (sharedpreferences.contains(mon7)) {
            mon_seven.setText(sharedpreferences.getString(mon7, ""));

        }
        if (sharedpreferences.contains(mon8)) {
            mon_eight.setText(sharedpreferences.getString(mon8, ""));

        }

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String m1 = mon_one.getText().toString();
                String m2 = mon_two.getText().toString();
                String m3 = mon_three.getText().toString();
                String m4 = mon_four.getText().toString();
                String m5 = mon_five.getText().toString();
                String m6 = mon_six.getText().toString();
                String m7 = mon_seven.getText().toString();
                String m8 = mon_eight.getText().toString();
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString(mon1,m1);
                editor.putString(mon2,m2);
                editor.putString(mon3,m3);
                editor.putString(mon4,m4);
                editor.putString(mon5,m5);
                editor.putString(mon6,m6);
                editor.putString(mon7,m7);
                editor.putString(mon8,m8);
                editor.commit();

                Intent i1 = new Intent(getApplicationContext(), timetable.class);
                startActivity(i1);


            }
        });
    }
}
