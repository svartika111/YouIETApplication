package com.example.vartikasharma.youiet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bpc1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpc1);
    }
    public void goToinsta (View view) {

        goToUrl ( "http://stackoverflow.com/");
    }

    public void goTofb (View view)
    {
        goToUrl ( "https://www.facebook.com/bpcuietpu/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
