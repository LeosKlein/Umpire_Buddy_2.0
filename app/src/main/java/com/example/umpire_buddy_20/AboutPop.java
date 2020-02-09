package com.example.umpire_buddy_20;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;


public class AboutPop extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_about);

        DisplayMetrics aboutDM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(aboutDM);

        int aboutWidth = aboutDM.widthPixels;
        int aboutHeight = aboutDM.heightPixels;



        getWindow().setLayout(aboutHeight , (aboutWidth));

        Button StrikePopExit = findViewById(R.id.About_Close);
        StrikePopExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
