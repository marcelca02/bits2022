package com.example.bits2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {
        Button startBut = findViewById(R.id.quizButton);
        Button apuntsBut = findViewById(R.id.apuntsButton);
        Button exitBut = findViewById(R.id.exitButton);
        startBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
        apuntsBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeApp();
            }
        });
        exitBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
    private void start() {
        Intent switchActivityIntent = new Intent(this, AppActivity.class);
        startActivity(switchActivityIntent);
    }

    private void changeApp() {
        Intent switchActivityIntent = new Intent(this, InfoActivity.class);
        startActivity(switchActivityIntent);
    }

}