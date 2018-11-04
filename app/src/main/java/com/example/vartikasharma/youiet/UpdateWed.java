package com.example.vartikasharma.youiet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateWed extends AppCompatActivity {
    EditText w_one, w_two, w_three, w_four,w_five , w_six, w_seven, w_eight;
    SharedPreferences sharedpreferences;

    Button save;
    public static final String wed1 = "wKey1";
    public static final String wed2 = "wKey2";
    public static final String wed3 = "wKey3";
    public static final String wed4 = "wKey4";
    public static final String wed5 = "wKey5";
    public static final String wed6 = "wKey6";
    public static final String wed7 = "wKey7";
    public static final String wed8 = "wKey8";
    public static final String mypreference = "mypref";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_wed);
        w_one = findViewById(R.id.one);
        w_two = findViewById(R.id.two);
        w_three = findViewById(R.id.three);
        w_four = findViewById(R.id.four);
        w_five = findViewById(R.id.five);
        w_six = findViewById(R.id.six);
        w_seven = findViewById(R.id.seven);
        w_eight = findViewById(R.id.eight);
        save =(Button)findViewById(R.id.save3);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(wed1)) {
            w_one.setText(sharedpreferences.getString(wed1, ""));
        }
        if (sharedpreferences.contains(wed2)) {
            w_two.setText(sharedpreferences.getString(wed2, ""));

        }
        if (sharedpreferences.contains(wed3)) {
            w_three.setText(sharedpreferences.getString(wed3, ""));

        }
        if (sharedpreferences.contains(wed4)) {
            w_four.setText(sharedpreferences.getString(wed4, ""));

        }
        if (sharedpreferences.contains(wed5)) {
            w_five.setText(sharedpreferences.getString(wed5, ""));

        }
        if (sharedpreferences.contains(wed6)) {
            w_six.setText(sharedpreferences.getString(wed6, ""));

        }
        if (sharedpreferences.contains(wed7)) {
            w_seven.setText(sharedpreferences.getString(wed7, ""));

        }
        if (sharedpreferences.contains(wed8)) {
            w_eight.setText(sharedpreferences.getString(wed8, ""));

        }
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String w1 = w_one.getText().toString();
                String w2 = w_two.getText().toString();
                String w3 = w_three.getText().toString();
                String w4 = w_four.getText().toString();
                String w5 = w_five.getText().toString();
                String w6 = w_six.getText().toString();
                String w7 = w_seven.getText().toString();
                String w8 = w_eight.getText().toString();

                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(wed1, w1);
                editor.putString(wed2, w2);
                editor.putString(wed3, w3);
                editor.putString(wed4, w4);
                editor.putString(wed5, w5);
                editor.putString(wed6, w6);
                editor.putString(wed7, w7);
                editor.putString(wed8, w8);
                editor.commit();

                Intent i3 = new Intent(getApplicationContext(), timetable.class);
                startActivity(i3);

            }
        });
    }
}
