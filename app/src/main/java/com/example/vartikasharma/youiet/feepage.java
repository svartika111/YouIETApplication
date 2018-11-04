package com.example.vartikasharma.youiet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class feepage extends AppCompatActivity {

    private LinearLayout text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feepage);
        text1 = (LinearLayout) findViewById(R.id.second);
        text2 = (LinearLayout) findViewById(R.id.third);

        text1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), feewelcome.class);
                startActivity(i);
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinesbi.com/prelogin/icollecthome.htm"));
                startActivity(browserIntent);


            }
        });


        getSupportActionBar().hide();
    }
}

