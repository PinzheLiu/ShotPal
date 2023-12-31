package com.cs407.shotpal;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to your layout file: activity_stop.xml
        setContentView(R.layout.activity_stop);

        Button startButton = findViewById(R.id.startButton);
        // Set an OnClickListener on the button
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the StopActivity
                Intent intent = new Intent(StopActivity.this, RetryActivity.class);
                startActivity(intent);
            }
        });

        //set the listener on the bottom navigation menu
        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.navigation_profile) {
                    // Start the Profile Activity
                    Intent intent = new Intent(StopActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    return true;
                }
                if (id == R.id.navigation_settings) {
                    // Start the Profile Activity
                    Intent intent = new Intent(StopActivity.this, SettingsActivity.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });
    }

    // ... any additional methods or logic for your StopActivity ...
}
