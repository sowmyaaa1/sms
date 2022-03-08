package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed,eg;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.editTextTextPersonName);
        eg=findViewById(R.id.editTextTextPersonName2);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmsManager sm=SmsManager.getDefault();
                sm.sendTextMessage(ed.getText().toString(),
                        null,
                        eg.getText().toString(),
                        null,
                        null);
            }
        });
    }
}
