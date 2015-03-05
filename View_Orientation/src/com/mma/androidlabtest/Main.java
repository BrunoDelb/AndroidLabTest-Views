package com.mma.androidlabtest;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnPortrait = (Button)findViewById (R.id.btn_portrait);
        btnPortrait.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
			}
		});
        Button btnLandscape = (Button)findViewById (R.id.btn_landscape);
        btnLandscape.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
			}
		});
        Button btnUndefined = (Button)findViewById (R.id.btn_undefined);
        btnUndefined.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
			}
		});
        Button btnShow = (Button)findViewById (R.id.btn_show);
        btnShow.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		        switch (getResources().getConfiguration().orientation) {
				case Configuration.ORIENTATION_LANDSCAPE:
					Toast.makeText(getApplicationContext(), "Orientation: Landscape", Toast.LENGTH_SHORT);
					break;
				case Configuration.ORIENTATION_PORTRAIT:
					Toast.makeText(getApplicationContext(), "Orientation: Portrait", Toast.LENGTH_SHORT);
					break;
				default:
					Toast.makeText(getApplicationContext(), "Orientation: Landscape", Toast.LENGTH_SHORT);
					break;
	        }
			}
		});
    }
}
