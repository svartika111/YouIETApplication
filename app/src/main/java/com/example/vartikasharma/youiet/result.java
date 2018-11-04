package com.example.vartikasharma.youiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        final WebView mywebview = (WebView) findViewById(R.id.webView);
        TextView imgButton =(TextView) findViewById(R.id.image_icon);

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mywebview.loadUrl("http://eakadamik.in/");
            }
        });
    }
}
