package com.example.vartikasharma.youiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class uietcom extends AppCompatActivity {

    LinearLayout mEDC;
    LinearLayout mBPC;
    LinearLayout mMAGB;
    LinearLayout mTPC;
    LinearLayout mROTRACT;
    LinearLayout mOSMIUM;
    LinearLayout mDIG;
    LinearLayout mMITRA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uietcom);
        initcom();
    }

    public void initcom(){
        mEDC=findViewById(R.id.drawable_edc);
        mEDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(uietcom.this,edc.class));
            }
        });
        mBPC=findViewById(R.id.drawable_bpc);
        mBPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(uietcom.this,bpc1.class));
            }
        });
        mMAGB=findViewById(R.id.drawable_mag);
        mMAGB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(uietcom.this,magboard.class));
            }
        });
        mROTRACT=findViewById(R.id.drawable_rotract);
        mROTRACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(uietcom.this,rotract.class));
            }
        });
        mTPC=findViewById(R.id.drawable_tpc);
        mTPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(uietcom.this,tpc.class));
            }
        });
        mMITRA=findViewById(R.id.drawable_mitra);
        mMITRA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(uietcom.this,mitra.class));
            }
        });
        mOSMIUM=findViewById(R.id.drawable_osm);
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
        });

    }

}

