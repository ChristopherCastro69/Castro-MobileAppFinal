package com.example.castro_mobileapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity2_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity2_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuItem1:
//                Toast.makeText(this, "Register menu item is clicked", Toast.LENGTH_SHORT).show();
                Intent register = new Intent(MainActivity2_Menu.this, Activity_Registration.class);
                startActivity(register);

                break;
            case R.id.menuItem2:
                Toast.makeText(this, "View List menu item is clicked", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}