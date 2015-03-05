package com.mma.androidlabtest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;

public class Main extends Activity {
			 
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		CheckBox checkbox = (CheckBox)findViewById(R.id.cbCheckbox);
		checkbox.setTextColor(Color.RED);
	}
}
