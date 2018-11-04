package com.example.vartikasharma.youiet;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class attendacechecker extends AppCompatActivity {
    //for sub1
    int minteger = 0;
     int ainteger = 0;
     int tinteger = 0;
    //for sub2
    int minteger1 = 0;
    int ainteger1 = 0;
    int tinteger1 = 0;
    //for sub3
    int minteger2 = 0;
    int ainteger2 = 0;
    int tinteger2 = 0;
    //for sub4
    int minteger3 = 0;
    int ainteger3 = 0;
    int tinteger3 = 0;
    //for sub5
    int minteger4 = 0;
    int ainteger4 = 0;
    int tinteger4 = 0;
    //for sub6
    int minteger5 = 0;
    int ainteger5 = 0;
    int tinteger5 = 0;

   //for sub1
    TextView displayInteger;
    TextView displayInteger1;
    TextView displayIntegertotal;
    EditText s1;
    //for sub2
    TextView displayIntegerp1;
    TextView displayIntegera1;
    TextView displayIntegertotal1;
    EditText s2;
    //for sub3
    TextView displayIntegerp2;
    TextView displayIntegera2;
    TextView displayIntegertotal2;
    EditText s3;
    //for sub4
    TextView displayIntegerp3;
    TextView displayIntegera3;
    TextView displayIntegertotal3;
    EditText s4;
    //for sub5
    TextView displayIntegerp4;
    TextView displayIntegera4;
    TextView displayIntegertotal4;
    EditText s5;
    //for sub6
    TextView displayIntegerp5;
    TextView displayIntegera5;
    TextView displayIntegertotal5;
    EditText s6;

    SharedPreferences sharedpreferences;
    public static final String mypreference = "mypref";
    public static final String present = "presentKey";
    public static final String absent = "absentKey";
    public static final String total = "totalKey";

    public static final String present1 = "presentKey1";
    public static final String absent1 = "absentKey1";
    public static final String total_1 = "totalKey1";

    public static final String present2 = "presentKey2";
    public static final String absent2 = "absentKey2";
    public static final String total_2 = "totalKey2";

    public static final String present3 = "presentKey3";
    public static final String absent3 = "absentKey3";
    public static final String total_3 = "totalKey3";

    public static final String present4 = "presentKey4";
    public static final String absent4 = "absentKey4";
    public static final String total_4 = "totalKey4";

    public static final String present5 = "presentKey5";
    public static final String absent5 = "absentKey5";
    public static final String total_5 = "totalKey5";
    //Subjects
    public static final String subject1 = "subjectKey1";
    public static final String subject2 = "subjectKey2";
    public static final String subject3 = "subjectKey3";
    public static final String subject4 = "subjectKey4";
    public static final String subject5 = "subjectKey5";
    public static final String subject6 = "subjectKey6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendacechecker);
        displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger1 = (TextView) findViewById(
                R.id.integer_number1);
        displayIntegertotal = (TextView) findViewById(
                R.id.total1);

        displayIntegerp1 = (TextView) findViewById(
                R.id.integer_numberp1);
        displayIntegera1 = (TextView) findViewById(
                R.id.integer_numbera1);
        displayIntegertotal1 = (TextView) findViewById(
                R.id.total2);

        displayIntegerp2 = (TextView) findViewById(
                R.id.integer_numberp2);
        displayIntegera2 = (TextView) findViewById(
                R.id.integer_numbera2);
        displayIntegertotal2 = (TextView) findViewById(
                R.id.total3);

        displayIntegerp3 = (TextView) findViewById(
                R.id.integer_numberp3);
        displayIntegera3 = (TextView) findViewById(
                R.id.integer_numbera3);
        displayIntegertotal3 = (TextView) findViewById(
                R.id.total4);

        displayIntegerp4 = (TextView) findViewById(
                R.id.integer_numberp4);
        displayIntegera4 = (TextView) findViewById(
                R.id.integer_numbera4);
        displayIntegertotal4 = (TextView) findViewById(
                R.id.total5);

        displayIntegerp5 = (TextView) findViewById(
                R.id.integer_numberp5);
        displayIntegera5 = (TextView) findViewById(
                R.id.integer_numbera5);
        displayIntegertotal5 = (TextView) findViewById(
                R.id.total6);
        s1 = (EditText) findViewById(R.id.sub1);
        s2 = (EditText) findViewById(R.id.sub2);
        s3 = (EditText) findViewById(R.id.sub3);
        s4 = (EditText) findViewById(R.id.sub4);
        s5 = (EditText) findViewById(R.id.sub5);
        s6 = (EditText) findViewById(R.id.sub6);

        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        //sub1
        if (sharedpreferences.contains(present)) {
            displayInteger.setText(sharedpreferences.getString(present, ""));
        }
        if (sharedpreferences.contains(absent)) {
            displayInteger1.setText(sharedpreferences.getString(absent, ""));

        }
        if (sharedpreferences.contains(total)) {
            displayIntegertotal.setText(sharedpreferences.getString(total, ""));

        }

        if (sharedpreferences.contains(subject1)) {
            s1.setText(sharedpreferences.getString(subject1, ""));
        }
        if (sharedpreferences.contains(subject2)) {
            s2.setText(sharedpreferences.getString(subject2, ""));
        }
        if (sharedpreferences.contains(subject3)) {
            s3.setText(sharedpreferences.getString(subject3, ""));
        }
        if (sharedpreferences.contains(subject4)) {
            s4.setText(sharedpreferences.getString(subject4, ""));
        }
        if (sharedpreferences.contains(subject5)) {
            s5.setText(sharedpreferences.getString(subject5, ""));
        }
        if (sharedpreferences.contains(subject6)) {
            s6.setText(sharedpreferences.getString(subject6, ""));
        }
        //sub2
        if (sharedpreferences.contains(present1)) {
            displayIntegerp1.setText(sharedpreferences.getString(present1, ""));
        }
        if (sharedpreferences.contains(absent1)) {
            displayIntegera1.setText(sharedpreferences.getString(absent1, ""));

        }
        if (sharedpreferences.contains(total_1)) {
            displayIntegertotal1.setText(sharedpreferences.getString(total_1, ""));

        }

        //sub3
        if (sharedpreferences.contains(present2)) {
            displayIntegerp2.setText(sharedpreferences.getString(present2, ""));
        }
        if (sharedpreferences.contains(absent2)) {
            displayIntegera2.setText(sharedpreferences.getString(absent2, ""));

        }
        if (sharedpreferences.contains(total_2)) {
            displayIntegertotal2.setText(sharedpreferences.getString(total_2, ""));

        }

        //sub4
        if (sharedpreferences.contains(present3)) {
            displayIntegerp3.setText(sharedpreferences.getString(present3, ""));
        }
        if (sharedpreferences.contains(absent3)) {
            displayIntegera3.setText(sharedpreferences.getString(absent3, ""));

        }
        if (sharedpreferences.contains(total_3)) {
            displayIntegertotal3.setText(sharedpreferences.getString(total_3, ""));

        }

        //sub5
        if (sharedpreferences.contains(present4)) {
            displayIntegerp4.setText(sharedpreferences.getString(present4, ""));
        }
        if (sharedpreferences.contains(absent4)) {
            displayIntegera4.setText(sharedpreferences.getString(absent4, ""));

        }
        if (sharedpreferences.contains(total_4)) {
            displayIntegertotal4.setText(sharedpreferences.getString(total_4, ""));

        }

        //sub6
        if (sharedpreferences.contains(present5)) {
            displayIntegerp5.setText(sharedpreferences.getString(present5, ""));
        }
        if (sharedpreferences.contains(absent5)) {
            displayIntegera5.setText(sharedpreferences.getString(absent5, ""));

        }
        if (sharedpreferences.contains(total_5)) {
            displayIntegertotal5.setText(sharedpreferences.getString(total_5, ""));

        }



    }

    //for sub1
    //for present
    public void increaseInteger(View view) {
        minteger = minteger + 1;
        display(minteger);

    }public void decreaseInteger(View view) {

        if (minteger > 0) {
            minteger = minteger - 1;
            display(minteger);
        }
    }
    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger.setText(""+number);
        displaytotal(number,ainteger);

    }
//for absent
    public void increaseIntegerabsent(View view) {
        ainteger = ainteger + 1;
        display1(ainteger);

    }public void decreaseIntegerabsent(View view) {
        if (ainteger > 0) {
            ainteger = ainteger - 1;
            display1(ainteger);
        }
    }
    private void display1(int number)
    {
        TextView displayInteger1 = (TextView) findViewById(
                R.id.integer_number1);
        displayInteger1.setText(""+number);
        displaytotal(minteger,number);

    }
//to display total
private void displaytotal(int n1, int n2)
{
    float per;
    TextView displayIntegertotal = (TextView)findViewById(R.id.total1);
    //double n1 = Double.parseDouble(n1.getText().toString());
    //double n2 = Double.parseDouble(n2.getText().toString());
    tinteger=n1+n2;
    per = (float)minteger/tinteger*100;
    displayIntegertotal.setText(String.format("%.2f",per));
    tinteger=0;
}


    //for sub2
    //for present
    public void increaseIntegerp1(View view) {
        minteger1 = minteger1 + 1;
        displayp1(minteger1);

    }public void decreaseIntegerp1(View view) {
        if (minteger1 > 0) {
            minteger1 = minteger1 - 1;
            displayp1(minteger1);
        }
    }
    private void displayp1(int number) {
        TextView displayIntegerp1 = (TextView) findViewById(
                R.id.integer_numberp1);
        displayIntegerp1.setText(""+number);
        displaytotal1(number , ainteger1);

    }
    //for absent
    public void increaseIntegera1(View view) {
        ainteger1 = ainteger1 + 1;
        displaya1(ainteger1);

    }public void decreaseIntegera1(View view) {
        if (ainteger1 > 0) {
            ainteger1 = ainteger1 - 1;
            displaya1(ainteger1);
        }
    }
    private void displaya1(int number)
    {
        TextView displayIntegera1 = (TextView) findViewById(
                R.id.integer_numbera1);
        displayIntegera1.setText(""+number);
        displaytotal1(minteger1,number);

    }
    //to display total
    private void displaytotal1(int n1, int n2)
    {
        float per;
        TextView displayIntegertotal1 = (TextView)findViewById(R.id.total2);
        //double n1 = Double.parseDouble(n1.getText().toString());
        //double n2 = Double.parseDouble(n2.getText().toString());
        tinteger1=n1+n2;
        per = (float)minteger1/tinteger1*100;
        displayIntegertotal1.setText(String.format("%.2f",per));
        tinteger1=0;
    }

    //for sub3
    //for present
    public void increaseIntegerp2(View view) {
        minteger2 = minteger2 + 1;
        displayp2(minteger2);

    }public void decreaseIntegerp2(View view) {
        if (minteger2 > 0) {
            minteger2 = minteger2 - 1;
            displayp2(minteger2);
        }
    }
    private void displayp2(int number) {
        TextView displayIntegerp2 = (TextView) findViewById(
                R.id.integer_numberp2);
        displayIntegerp2.setText(""+number);
        displaytotal2(number , ainteger2);

    }
    //for absent
    public void increaseIntegera2(View view) {
        ainteger2 = ainteger2 + 1;
        displaya2(ainteger2);

    }public void decreaseIntegera2(View view) {
        if (ainteger2 > 0) {
            ainteger2 = ainteger2 - 1;
            displaya2(ainteger2);
        }
    }
    private void displaya2(int number)
    {
        TextView displayIntegera2 = (TextView) findViewById(
                R.id.integer_numbera2);
        displayIntegera2.setText(""+number);
        displaytotal2(minteger2,number);

    }
    //to display total
    private void displaytotal2(int n1, int n2)
    {
        float per;
        TextView displayIntegertotal2 = (TextView)findViewById(R.id.total3);
        //double n1 = Double.parseDouble(n1.getText().toString());
        //double n2 = Double.parseDouble(n2.getText().toString());
        tinteger2=n1+n2;
        per = (float)minteger2/tinteger2*100;
        displayIntegertotal2.setText(String.format("%.2f",per));
        tinteger2=0;
    }

    //for sub4
    //for present
    public void increaseIntegerp3(View view) {
        minteger3 = minteger3 + 1;
        displayp3(minteger3);

    }public void decreaseIntegerp3(View view) {
        if (minteger3 > 0) {
            minteger3 = minteger3 - 1;
            displayp3(minteger3);
        }
    }

    private void displayp3(int number) {
        TextView displayIntegerp3 = (TextView) findViewById(
                R.id.integer_numberp3);
        displayIntegerp3.setText(""+number);
        displaytotal3(number , ainteger3);

    }
    //for absent
    public void increaseIntegera3(View view) {
        ainteger3 = ainteger3 + 1;
        displaya3(ainteger3);

    }public void decreaseIntegera3(View view) {
        if (ainteger3 > 0) {
            ainteger3 = ainteger3 - 1;
            displaya3(ainteger3);
        }
    }
    private void displaya3(int number)
    {
        TextView displayIntegera3 = (TextView) findViewById(
                R.id.integer_numbera3);
        displayIntegera3.setText(""+number);
        displaytotal3(minteger3,number);

    }
    //to display total
    private void displaytotal3(int n1, int n2)
    {
        float per;
        TextView displayIntegertotal3 = (TextView)findViewById(R.id.total4);
        //double n1 = Double.parseDouble(n1.getText().toString());
        //double n2 = Double.parseDouble(n2.getText().toString());
        tinteger3=n1+n2;
        per = (float)minteger3/tinteger3*100;
        displayIntegertotal3.setText(String.format("%.2f",per));
        tinteger3=0;
    }
    //for sub5
    //for present
    public void increaseIntegerp4(View view) {
        minteger4 = minteger4 + 1;
        displayp4(minteger4);

    }public void decreaseIntegerp4(View view) {
        if (minteger4 > 0) {
            minteger4 = minteger4 - 1;
            displayp4(minteger4);
        }
    }

    private void displayp4(int number) {
        TextView displayIntegerp4 = (TextView) findViewById(
                R.id.integer_numberp4);
        displayIntegerp4.setText(""+number);
        displaytotal4(number , ainteger4);

    }
    //for absent
    public void increaseIntegera4(View view) {
        ainteger4 = ainteger4 + 1;
        displaya4(ainteger4);

    }public void decreaseIntegera4(View view) {
        if (ainteger4 > 0) {
            ainteger4 = ainteger4 - 1;
            displaya4(ainteger4);
        }
    }
    private void displaya4(int number)
    {
        TextView displayIntegera4 = (TextView) findViewById(
                R.id.integer_numbera4);
        displayIntegera4.setText(""+number);
        displaytotal4(minteger4,number);

    }
    //to display total
    private void displaytotal4(int n1, int n2)
    {
        float per;
        TextView displayIntegertotal4 = (TextView)findViewById(R.id.total5);
        //double n1 = Double.parseDouble(n1.getText().toString());
        //double n2 = Double.parseDouble(n2.getText().toString());
        tinteger4=n1+n2;
        per = (float)minteger4/tinteger4*100;
        displayIntegertotal4.setText(String.format("%.2f",per));
        tinteger4=0;
    }

    //for sub6
    //for present
    public void increaseIntegerp5(View view) {
        minteger5 = minteger5 + 1;
        displayp5(minteger5);

    }public void decreaseIntegerp5(View view) {
        if (minteger5 > 0) {
            minteger5 = minteger5 - 1;
            displayp5(minteger5);
        }
    }

    private void displayp5(int number) {
        TextView displayIntegerp5 = (TextView) findViewById(
                R.id.integer_numberp5);
        displayIntegerp5.setText(""+number);
        displaytotal5(number , ainteger5);

    }
    //for absent
    public void increaseIntegera5(View view) {

        ainteger5 = ainteger5 + 1;
        displaya5(ainteger5);

    }public void decreaseIntegera5(View view) {
        if (ainteger5 > 0) {
            ainteger5 = ainteger5 - 1;
            displaya5(ainteger5);
        }
    }
    private void displaya5(int number)
    {
        TextView displayIntegera5 = (TextView) findViewById(
                R.id.integer_numbera5);
        displayIntegera5.setText(""+number);
        displaytotal5(minteger5,number);

    }
    //to display total
    private void displaytotal5(int n1, int n2)
    {
        float per;
        TextView displayIntegertotal5 = (TextView)findViewById(R.id.total6);
        //double n1 = Double.parseDouble(n1.getText().toString());
        //double n2 = Double.parseDouble(n2.getText().toString());
        tinteger5=n1+n2;
        per = (float)minteger5/tinteger5*100;
        displayIntegertotal5.setText(String.format("%.2f",per));
        tinteger5=0;
    }



    //to save result-sharedpreference
public void saveresult(View view) {
    //sub1
    String p = displayInteger.getText().toString();
    String a = displayInteger1.getText().toString();
    String t = displayIntegertotal.getText().toString();

    //sub2
    String b = displayIntegerp1.getText().toString();
    String c = displayIntegera1.getText().toString();
    String d = displayIntegertotal1.getText().toString();

    //sub3
    String e = displayIntegerp2.getText().toString();
    String f = displayIntegera2.getText().toString();
    String g = displayIntegertotal2.getText().toString();

    //sub4
    String h = displayIntegerp3.getText().toString();
    String i = displayIntegera3.getText().toString();
    String j = displayIntegertotal3.getText().toString();

    //sub5
    String k = displayIntegerp4.getText().toString();
    String l = displayIntegera4.getText().toString();
    String m = displayIntegertotal4.getText().toString();

    //sub6
    String n = displayIntegerp5.getText().toString();
    String o = displayIntegera5.getText().toString();
    String q = displayIntegertotal5.getText().toString();

    String sem1 = s1.getText().toString();
    String sem2 = s2.getText().toString();
    String sem3 = s3.getText().toString();
    String sem4 = s4.getText().toString();
    String sem5 = s5.getText().toString();
    String sem6 = s6.getText().toString();

    SharedPreferences.Editor editor = sharedpreferences.edit();
    editor.putString(present, p);
    editor.putString(absent, a);
    editor.putString(total, t);

    editor.putString(present1, b);
    editor.putString(absent1, c);
    editor.putString(total_1, d);

    editor.putString(present2, e);
    editor.putString(absent2, f);
    editor.putString(total_2, g);

    editor.putString(present3, h);
    editor.putString(absent3, i);
    editor.putString(total_3, j);

    editor.putString(present4, k);
    editor.putString(absent4, l);
    editor.putString(total_4, m);

    editor.putString(present5, n);
    editor.putString(absent5, o);
    editor.putString(total_5, q);

    editor.putString(subject1, sem1);
    editor.putString(subject2, sem2);
    editor.putString(subject3, sem3);
    editor.putString(subject4, sem4);
    editor.putString(subject5, sem5);
    editor.putString(subject6, sem6);

    editor.commit();

startActivity(new Intent(attendacechecker.this,firstpage.class));

    }


}
