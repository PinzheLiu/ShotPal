package com.cs407.shotpal;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to your layout file: activity_stop.xml
        setContentView(R.layout.activity_settings);

        //set the listener on the bottom navigation menu
        BottomNavigationView navView = findViewById(R.id.bottom_navigation);

        //set the selected item to "Profile"
        navView.setSelectedItemId(R.id.navigation_settings);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.navigation_time) {
                    // Start the Profile Activity
                    Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                }

                if (id == R.id.navigation_profile) {
                    // Start the Profile Activity
                    Intent intent = new Intent(SettingsActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    return true;
                }

                return false;
            }
        });



    }

    // ... any additional methods or logic for your StopActivity ...
}