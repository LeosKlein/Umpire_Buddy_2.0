package com.example.umpire_buddy_20;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class StrikePop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutstrike);

        DisplayMetrics strikeDM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(strikeDM);

        int strikeWidth = strikeDM.widthPixels;
        int strikeHeight = strikeDM.heightPixels;

        getWindow().setLayout((int) (strikeWidth *.8), (int) (strikeHeight *.5));

        Button StrikePopExit = findViewById(R.id.closeStrike);
        StrikePopExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}
