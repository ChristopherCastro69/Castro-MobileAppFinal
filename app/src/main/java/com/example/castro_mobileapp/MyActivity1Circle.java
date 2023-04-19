package com.example.castro_mobileapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity1Circle extends AppCompatActivity {

    Button btnCalculate;
    EditText txtArea, txtCircumference;
    EditText txtRadius;
    Circle circle = new Circle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity1_circle);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        txtRadius = (EditText) findViewById(R.id.txtRadius);
        txtCircumference = (EditText) findViewById(R.id.txtCircumference);
        txtArea = (EditText) findViewById(R.id.txtArea);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radiusText;
                try {
                    radiusText = txtRadius.getText().toString();
                    if(radiusText.equals("")) {
                        Toast.makeText(MyActivity1Circle.this, "Please enter the radius!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    double radius = Integer.parseInt(radiusText);
                    circle.setRadius(radius);
                    double area = circle.getArea();
                    double circumference = circle.getCircumference();
                    txtArea.setText(String.format("%.2f",area));
                    txtCircumference.setText(String.format("%.2f", circumference));
                    Toast.makeText(MyActivity1Circle.this, "Area and Circumference of the Circle has been computed!", Toast.LENGTH_SHORT).show();

                } catch (NumberFormatException e) {
                    Toast.makeText(MyActivity1Circle.this, "Input should be a number! Please try again.", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(MyActivity1Circle.this, "Invalid input! Please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}