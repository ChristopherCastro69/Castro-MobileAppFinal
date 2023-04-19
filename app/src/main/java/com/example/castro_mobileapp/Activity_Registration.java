package com.example.castro_mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity_Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button btnClear = findViewById(R.id.btnClear);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        EditText firstName = findViewById(R.id.firstName);
        EditText lastName = findViewById(R.id.lastName);
        EditText bDate = findViewById(R.id.bDate);
        EditText phoneNum = findViewById(R.id.phoneNum);
        EditText emailAdd = findViewById(R.id.emailAdd);

        RadioButton male = findViewById(R.id.male);
        RadioButton female = findViewById(R.id.female);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstName.setText("");
                lastName.setText("");
                bDate.setText("");
                phoneNum.setText("");
                emailAdd.setText("");
                radioGroup.clearCheck();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = firstName.getText().toString();
                String lname = lastName.getText().toString();
                String name = fname.concat(" ").concat(lname);
                String gender;

                if(female.isSelected()) gender = "Female";
                else gender = "Male";

                String bdate = bDate.getText().toString();
                String phonenum = phoneNum.getText().toString();
                String emailadd = emailAdd.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Activity_Display.class);
                intent.putExtra("name_key", name);
                intent.putExtra("gender_key", gender);
                intent.putExtra("bdate_key", bdate);
                intent.putExtra("phone_key", phonenum);
                intent.putExtra("email_key", emailadd);
                startActivity(intent);
            }
        });
    }
}