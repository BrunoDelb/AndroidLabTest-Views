package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class Main extends Activity {
    
    SeekBar seekBar;
    TextView tvProgress;
    TextView tvTracking;
    
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.main);
        tvProgress = (TextView)findViewById (R.id.tv_progress);
        tvTracking = (TextView)findViewById (R.id.tv_tracking);
        seekBar = (SeekBar)findViewById (R.id.seekBar);
        seekBar.setOnSeekBarChangeListener (new OnSeekBarChangeListener() {
			
			public void onStopTrackingTouch(SeekBar seekBar) {
		        tvTracking.setText ("Stoped");
			}
			
			public void onStartTrackingTouch(SeekBar seekBar) {
		        tvTracking.setText ("Started");
			}
			
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
		        tvProgress.setText ("Progress: " + progress + ", fromTouch: " + fromUser);
			}
		});
    }
}
