package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Gravity;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class Main extends Activity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Chronometer chronometer = new Chronometer(Main.this);
		chronometer.setFormat("Chronometer: %s");
		chronometer.setBase(SystemClock.elapsedRealtime());
		chronometer.start();
		setContentView(chronometer, new LayoutParams (LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
    }
}
