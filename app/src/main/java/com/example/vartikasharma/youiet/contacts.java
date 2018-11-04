package com.example.vartikasharma.youiet;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class contacts extends AppCompatActivity {

    private ImageButton button;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;
    private ImageButton button7;
    private static final int REQUEST_CALL = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        button = (ImageButton) findViewById(R.id.buttonnitika);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall();
            }
        });
        button1 = (ImageButton) findViewById(R.id.buttoncall2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall1();
            }
        });
        button2 = (ImageButton) findViewById(R.id.buttoncall4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall2();
            }
        });
        button3 = (ImageButton) findViewById(R.id.buttoncall5);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall3();
            }
        });
        button4 = (ImageButton) findViewById(R.id.buttoncall6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall4();
            }
        });
        button5 = (ImageButton) findViewById(R.id.buttoncall7);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall5();
            }
        });
        button6 = (ImageButton) findViewById(R.id.buttoncall8);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall6();
            }
        });
        button7 = (ImageButton) findViewById(R.id.buttoncall9);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall7();
            }
        });
    }

    private void makePhoneCall() {

        if (ContextCompat.checkSelfPermission(contacts.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(contacts.this,
                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        } else {
            String dial = "tel:919996647468";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }

    }
    private void makePhoneCall1() {

        if (ContextCompat.checkSelfPermission(contacts.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(contacts.this,
                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        } else {
            String dial = "tel:918199942004";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }

    }

    private void makePhoneCall2() {

        if (ContextCompat.checkSelfPermission(contacts.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(contacts.this,
                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        } else {
            String dial = "tel:918199942004";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }

    }

    private void makePhoneCall3() {

        if (ContextCompat.checkSelfPermission(contacts.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(contacts.this,
                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        } else {
            String dial = "tel:918199942004";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }

    }
    private void makePhoneCall4() {

        if (ContextCompat.checkSelfPermission(contacts.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(contacts.this,
                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        } else {
            String dial = "tel:918199942004";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }

    }

    private void makePhoneCall5() {

        if (ContextCompat.checkSelfPermission(contacts.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(contacts.this,
                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        } else {
            String dial = "tel:918199942004";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }

    }

    private void makePhoneCall6() {

        if (ContextCompat.checkSelfPermission(contacts.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(contacts.this,
                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        } else {
            String dial = "tel:918199942004";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }

    }

    private void makePhoneCall7() {

        if (ContextCompat.checkSelfPermission(contacts.this,
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(contacts.this,
                    new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        } else {
            String dial = "tel:918199942004";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
        }

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                makePhoneCall();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
