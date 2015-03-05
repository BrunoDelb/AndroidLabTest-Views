package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main
		     extends Activity {
			 
	static final String[] items = new String[] {"One", "Two", "Three", "Four", "Five"};
	
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.main);
		final Spinner spinner = (Spinner) findViewById(R.id.spinner);
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
		arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(arrayAdapter);

		Button btnEnable = (Button) findViewById(R.id.btn_enable);
		btnEnable.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				if (spinner.isEnabled()) {
					spinner.setEnabled(false);
				} else {
					spinner.setEnabled(true);
				}
			}
		});
	}
}
