package com.example.umpire_buddy_20;


import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;


public class BallPop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ball);

        DisplayMetrics ballDM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(ballDM);

        int ballWidth = ballDM.widthPixels;
        int ballHeight = ballDM.heightPixels;

        getWindow().setLayout((int) (ballWidth * .8), (int) (ballHeight * .5));

        Button StrikePopExit = findViewById(R.id.close_ball_pop);
        StrikePopExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
