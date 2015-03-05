package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class Main extends Activity /*implements RadioGroup.OnCheckedChangeListener*/ {
			 
	RadioGroup rgHorizontal;
	RadioGroup rgVertical;

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		rgHorizontal = (RadioGroup) findViewById(R.id.rg_horizontal);
		rgHorizontal.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
					case R.id.vertical1:
						Toast.makeText(getApplicationContext(), "Vertical 1", 5000).show();
						break;
					case R.id.vertical2:
						Toast.makeText(getApplicationContext(), "Vertical 2", 5000).show();
						break;
				}
			}
		});
		rgVertical = (RadioGroup) findViewById(R.id.rg_vertical);
		rgVertical.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
					case R.id.horizontal1:
						Toast.makeText(getApplicationContext(), "Horizontal 1", 5000).show();
						break;
					case R.id.horizontal2:
						Toast.makeText(getApplicationContext(), "Horizontal 2", 5000).show();
						break;
				}
				
			}
		});
	}
}
