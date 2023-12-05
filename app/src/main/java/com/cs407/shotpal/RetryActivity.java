package com.cs407.shotpal;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RetryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to activity_retry.xml
        setContentView(R.layout.activity_retry);

        Button RetryButton = findViewById(R.id.startButton);
        // Set an OnClickListener on the button
        RetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the StopActivity
                Intent intent = new Intent(RetryActivity.this, StopActivity.class);
                startActivity(intent);
            }
        });

        Button BackButton = findViewById(R.id.backbutton);

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the StopActivity
                Intent intent = new Intent(RetryActivity.this, MainActivity.class);
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
                    Intent intent = new Intent(RetryActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    return true;
                }
                if (id == R.id.navigation_settings) {
                    // Start the Profile Activity
                    Intent intent = new Intent(RetryActivity.this, SettingsActivity.class);
                    startActivity(intent);
                    return true;
                }
                // ... additional if-else statements for other menu items ...
                return false;
            }
        });
    }

    // ... any additional methods or logic for your RetryActivity ...
}
