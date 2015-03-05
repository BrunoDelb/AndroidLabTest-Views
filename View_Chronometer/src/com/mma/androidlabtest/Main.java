package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Main extends Activity {
			 
    Chronometer chronometer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        chronometer = (Chronometer) findViewById(R.id.chronometer);
		
        Button btnStart = (Button) findViewById(R.id.btnStart);
		btnStart.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				chronometer.start();
			}
		});
		
		Button btnStop = (Button) findViewById(R.id.btnStop);
		btnStop.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				chronometer.stop();
			}
		});
		
		Button btnReset = (Button) findViewById(R.id.btnReset);
		btnReset.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				chronometer.setBase(SystemClock.elapsedRealtime());
			}
		});
    }
}
