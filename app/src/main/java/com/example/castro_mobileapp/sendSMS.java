package com.example.castro_mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sendSMS extends AppCompatActivity {

    Button btnSend;
    Button btnClear;
    EditText txtPhone;
    EditText txtMessage;
    String phone;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_sms);


        btnClear = (Button) findViewById(R.id.btnClear);
        btnSend = (Button) findViewById(R.id.btnSend);
        txtPhone = (EditText) findViewById(R.id.txtPhone);
        txtMessage = (EditText) findViewById(R.id.txtMessage);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phone = txtPhone.getText().toString();
                message = txtMessage.getText().toString();
                Intent i = new Intent (Intent.ACTION_VIEW, Uri.fromParts("sms", phone, null));
                i.putExtra("sms_body", message);
                startActivity(i);

                Toast.makeText(sendSMS.this, "SMS Sent", Toast.LENGTH_SHORT).show();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtPhone.setText("");
                txtMessage.setText("");
                Toast.makeText(sendSMS.this, "Cleared", Toast.LENGTH_SHORT).show();
            }
        });
    }

}