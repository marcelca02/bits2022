package com.example.bits2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startGameButton = findViewById(R.id.startGameButton);
    Button showExplanationsButton = findViewById(R.id.explanationsButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {
        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame();
            }
        });

        showExplanationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showExplanations();
            }
        });
    }

    private void startGame() {
        Intent switchActivityIntent = new Intent(this, InGameActivity.class);
        startActivity(switchActivityIntent);
    }

    private void showExplanations() {
        Intent switchActivityIntent = new Intent(this, ExplanationsActivity.class);
        startActivity(switchActivityIntent);
    }

}