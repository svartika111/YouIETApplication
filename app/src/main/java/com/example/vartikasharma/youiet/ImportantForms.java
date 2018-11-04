package com.example.vartikasharma.youiet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ImportantForms extends AppCompatActivity {

    private TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_forms);

        // http://webopac.puchd.ac.in/membershipform/ (Library Form)
        // http://sports.puchd.ac.in/show-forms.php (Sports Forms: Cricket, sp, directorate of sports
        // http://netportal.pu.ac.in (Wifi form)

        txt1 = (TextView) findViewById(R.id.text_1);
        txt2 = (TextView) findViewById(R.id.text_2);
        txt3 = (TextView) findViewById(R.id.text_3);

        txt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri=Uri.parse("http://netportal.pu.ac.in");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }

            });
        txt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri1=Uri.parse("http://webopac.puchd.ac.in/membershipform/");
                Intent intent1=new Intent(Intent.ACTION_VIEW,uri1);
                startActivity(intent1);
            }

        });
        txt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri2=Uri.parse("http://sports.puchd.ac.in/show-forms.php");
                Intent intent2=new Intent(Intent.ACTION_VIEW,uri2);
                startActivity(intent2);
            }

        });




    }
}
