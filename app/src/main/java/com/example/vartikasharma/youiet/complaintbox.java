package com.example.vartikasharma.youiet;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class complaintbox extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] country = {"CSE", "Bio-technology", "ECE", "EEE", "IT", "Mechanical"};
    String[] to = {"Director", "Branch Coordinator"};
    EditText txtMessage;
    String Director = "8930900320";
    String CSE = "9466346970", ECE = "9996647468", Biotech = "8196861900", EEE = "8146264997", IT = "9416794900", Mechanical = "8630618338";
    String Coordinator="8199942004";
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
    String message, msgto, msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaintbox);

        txtMessage = findViewById(R.id.editText2);

        Spinner spin = findViewById(R.id.spinner);
        Spinner spin2 = findViewById(R.id.spinner2);
        spin.setOnItemSelectedListener(this);
        spin2.setOnItemSelectedListener(this);
        final ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        final ArrayAdapter aa2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, to);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        spin2.setAdapter(aa2);

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {
                    case 0: {
                        msgto = "Director";
                        break;
                    }
                    case 1: {
                        msgto = "Coordinator";
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {
                    switch (position2) {
                        case 0: {
                            msg2 = "CSE";
                            break;
                        }
                        case 1: {
                            msg2 = "Biotech";
                            break;
                        }
                        case 2: {
                            msg2 = "ECE";
                            break;
                        }
                        case 3: {
                            msg2 = "EEE";
                            break;
                        }
                        case 4: {
                            msg2 = "IT";
                            break;
                        }
                        case 5: {
                            msg2 = "Mechanical";
                            break;
                        }
                    }

                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "You selected nothing", Toast.LENGTH_LONG).show();
            }
        });

        Button submit = (Button)findViewById(R.id.msg);


        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sendSMSMessage();
            }


        });
    }

    protected void sendSMSMessage() {
        message = txtMessage.getText().toString();

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.SEND_SMS)) {
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (msgto == "Director") {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(Director, null, message, null, null);
                        Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                    }
                    else{

                         if (msg2 == "CSE") {
                            SmsManager smsManager1 = SmsManager.getDefault();
                            smsManager1.sendTextMessage(CSE, null, message, null, null);
                            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                        }
                        else if (msg2 == "Biotech") {
                            SmsManager smsManager2 = SmsManager.getDefault();
                            smsManager2.sendTextMessage(Biotech, null, message, null, null);
                            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                        }

                        else if (msg2 == "ECE") {
                            SmsManager smsManager3 = SmsManager.getDefault();
                            smsManager3.sendTextMessage(ECE, null, message, null, null);
                            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                        }
                        else if (msg2 == "EEE") {
                            SmsManager smsManager4 = SmsManager.getDefault();
                            smsManager4.sendTextMessage(EEE, null, message, null, null);
                            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                        }
                        else if (msg2 == "IT") {
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(IT, null, message, null, null);
                            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                        }
                        else if (msg2 == "Mechanical") {
                            SmsManager smsManager5 = SmsManager.getDefault();
                            smsManager5.sendTextMessage(Mechanical, null, message, null, null);
                            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}


