package com.cs407.shotpal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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
    }

    // ... any additional methods or logic for your RetryActivity ...
}
