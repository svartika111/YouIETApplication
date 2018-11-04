package com.example.vartikasharma.youiet;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;

public class MajorEvents extends Activity {

    private ViewPager viewPager;

    private slideshow_swipe adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_events);
        viewPager= (ViewPager) findViewById(R.id.view_pager);
        adapter= new slideshow_swipe(this);
        viewPager.setAdapter(adapter);
    }
}