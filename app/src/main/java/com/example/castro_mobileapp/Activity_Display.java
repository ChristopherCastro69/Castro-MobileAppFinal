package com.example.castro_mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView tname = findViewById(R.id.name);
        TextView tgender = findViewById(R.id.gender);
        TextView tbdate = findViewById(R.id.bdate);
        TextView temail = findViewById(R.id.email);
        TextView tphone = findViewById(R.id.phone);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String email = intent.getStringExtra("email_key");
        String phone = intent.getStringExtra("phone_key");

        tname.setText(name);
        tgender.setText(gender);
        tbdate.setText(bdate);
        temail.setText(email);
        tphone.setText(phone);
    }
}