package com.example.vartikasharma.youiet;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class feewelcome extends AppCompatActivity {

    private ViewPager mpager;
    private int[] img_resources = {R.layout.activity_step1,R.layout.activity_step2,R.layout.activity_step3,
            R.layout.activity_step4,R.layout.activity_step5,R.layout.activity_step6,R.layout.activity_step7,
            R.layout.activity_step8};
    private  com.example.vartikasharma.youiet.MpagerAdapter mpagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feewelcome);
        mpager = (ViewPager)findViewById(R.id.viewpager);
        mpagerAdapter =new com.example.vartikasharma.youiet.MpagerAdapter(img_resources,this);
        mpager.setAdapter(mpagerAdapter);
        getSupportActionBar().hide();


    }
}

