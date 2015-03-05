package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ToggleButton toggle = (ToggleButton)findViewById(R.id.toggle_button);
        toggle.setChecked(true);
        toggle.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					Toast.makeText(getApplicationContext(), "Checked !",  Toast.LENGTH_SHORT);
				} else {
					Toast.makeText(getApplicationContext(), "Unchecked !",  Toast.LENGTH_SHORT);
				}
			}
		});
    }
}
