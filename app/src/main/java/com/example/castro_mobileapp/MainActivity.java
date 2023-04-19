package com.example.castro_mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnHelloWorld, btnExercise1, btnActivity1, btnActivity2, btnActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHelloWorld = (Button) findViewById(R.id.btnHelloWorld);
        btnExercise1 = (Button) findViewById(R.id.btnExercise1);
        btnActivity1 = (Button) findViewById(R.id.btnActivity1);
        btnActivity2 = (Button) findViewById(R.id.btnActivity2);
        btnActivity3 = (Button) findViewById(R.id.btnActivity3);

        btnHelloWorld.setOnClickListener(this);
        btnExercise1.setOnClickListener(this);
        btnActivity1.setOnClickListener(this);
        btnActivity2.setOnClickListener(this);
        btnActivity3.setOnClickListener(this);
    }

    //    @Override
    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {
       // Intent intent = new Intent(this, MyActivity1Circle.class);
        switch (v.getId()) {
            case R.id.btnHelloWorld:
                Toast.makeText(MainActivity.this, "Hello World Button is clicked!", Toast.LENGTH_SHORT).show();
//                intent = new Intent(this, MyActivity1Circle.class);
//                startActivity(intent);
                break;
            case R.id.btnExercise1:
                Toast.makeText(MainActivity.this, "Exercise 1 Circle Button is clicked!", Toast.LENGTH_SHORT).show();
//               Intent intent = new Intent(this, MyActivity1Circle.class);
//               startActivity(intent);
                break;
            case R.id.btnActivity1:
                Toast.makeText(MainActivity.this, "Activity 1 (Circle) Button is clicked!", Toast.LENGTH_SHORT).show();
//                intent = new Intent(this, MyActivity1Circle.class);
//                startActivity(intent);
                break;
            case R.id.btnActivity2:
                Toast.makeText(MainActivity.this, "Activity 2 (Menu) is clicked!", Toast.LENGTH_SHORT).show();
//                intent = new Intent(this, MyActivity1Circle.class);
                Intent intent2 = new Intent(this, MainActivity2_Menu.class);
                startActivity(intent2);
                break;
            case R.id.btnActivity3:
                Toast.makeText(MainActivity.this, "Activity 3 (SMS) Button is clicked!", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this, sendSMS.class);
                startActivity(intent3);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());

        }


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}