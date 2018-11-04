package com.example.vartikasharma.youiet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mitra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitra);
    }
    public void goTofb (View view) {
        goToUrl ( "https://www.facebook.com/MITRA-touching-lives-246074672095279/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void goToinsta (View view) {

        goToUrl ( "https://www.instagram.com/mitra_touchinglives/");
    }


}
