package com.example.vartikasharma.youiet;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class firstpage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    LinearLayout mABOUT;
    LinearLayout mFEES;
    LinearLayout mATTENDANCE;
    LinearLayout mCOMPLAINT;
    LinearLayout mHOSTEL;
    LinearLayout mRESULT;
    LinearLayout mCOMMITTEE;
    LinearLayout mMAPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        initfirst();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.firstpage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_timetable) {
            startActivity(new Intent(getApplicationContext(),timetable.class));
        }
        else if (id == R.id.nav_contact)
        {
      startActivity(new Intent(getApplicationContext(),contacts.class));

        } else if (id == R.id.nav_majorevents) {
            startActivity(new Intent(getApplicationContext(),eventspage.class));


        } else if (id == R.id.nav_about) {

            startActivity(new Intent(getApplicationContext(),aboutdevelopers.class));

        }
        else if (id == R.id.nav_form)
        {
            startActivity(new Intent(getApplicationContext(),ImportantForms.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void initfirst(){
        mABOUT=findViewById(R.id.drawable_about);
        mABOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(firstpage.this,About.class));
            }
        });
        mCOMMITTEE=findViewById(R.id.drawable_committee);
        mCOMMITTEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(firstpage.this,uietcom.class));
            }
        });
       mRESULT=findViewById(R.id.drawable_result);
        mRESULT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(firstpage.this,result.class));
            }
        });
        mCOMPLAINT=findViewById(R.id.drawable_cbox);
        mCOMPLAINT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(firstpage.this,complaintbox.class));
            }
        });
        mATTENDANCE=findViewById(R.id.drawable_attendance);
        mATTENDANCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(firstpage.this,MainActivity.class));
            }
        });
        mFEES=findViewById(R.id.drawable_fees);
        mFEES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(firstpage.this,feepage.class));
            }
        });
        /*mOSMIUM=findViewById(R.id.drawable_osm);
        mOSMIUM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(uietcom.this,osmium.class));
            }
        });
        mDIG=findViewById(R.id.drawable_dig);
        mDIG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(uietcom.this,dig.class));
            }
        }); */

    }



}
