package com.cs407.shotpal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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
    }

    // ... any additional methods or logic for your StopActivity ...
}
