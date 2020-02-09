package com.example.umpire_buddy_20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// Created by Jonathan Dang for Assignment 1 of CS_449
public class MainActivity extends AppCompatActivity {

    public int StrikeNum = 0; //Strike Counter
    public int BallNum = 0;   //Ball Counter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // If User presses it will increase the Strike Counter(Number).
        final TextView SCounter = findViewById(R.id.StrikeCounter);
        final Button buttonStrike = findViewById(R.id.StrikeIncrease);
        buttonStrike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrikeNum = StrikeNum + 1;
                if(StrikeNum == 3) {
                    buttonStrike.setEnabled(false);
                    startActivity(new Intent(MainActivity.this, StrikePop.class));
                }
                SCounter.setText(String.valueOf(StrikeNum));
            }
        });
        // If User presses it will increase the Ball Counter(Number).
        final TextView BCounter = findViewById(R.id.BallCounter);
        final Button buttonBall = findViewById(R.id.BallIncrease);
        buttonBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BallNum = BallNum + 1;
                if(BallNum == 4) {
                    buttonBall.setEnabled(false);
                    startActivity(new Intent(MainActivity.this, BallPop.class));
                }
                BCounter.setText(String.valueOf(BallNum));
            }
        });
        // If User presses Reset it will change Strike Number and Reset Number to 0.
        Button buttonReset = findViewById(R.id.ResetCounts);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrikeNum = 0;
                BallNum = 0;
                buttonStrike.setEnabled(true);
                buttonBall.setEnabled(true);
                BCounter.setText(String.valueOf(BallNum));
                SCounter.setText(String.valueOf(StrikeNum));
            }
        });
        // If User Presses Exit it will Exit the application.
        Button Exit = findViewById(R.id.buttonExit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        Button aboutB = findViewById(R.id.about);
        aboutB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutPop.class));
            }
        });

    }
}



