package com.sulaiman.camx;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.rgb(12, 12, 12));
        layout.setPadding(24, 24, 24, 24);

        TextView logo = new TextView(this);
        logo.setText("S A");
        logo.setTextSize(54);
        logo.setTextColor(Color.rgb(218, 175, 75));
        logo.setGravity(Gravity.CENTER);

        TextView title = new TextView(this);
        title.setText("SULAIMAN CAM X");
        title.setTextSize(25);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 20, 0, 12);

        TextView subtitle = new TextView(this);
        subtitle.setText("PREMIUM CAMERA EXPERIENCE");
        subtitle.setTextSize(12);
        subtitle.setTextColor(Color.rgb(218, 175, 75));
        subtitle.setGravity(Gravity.CENTER);

        layout.addView(logo);
        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
}
