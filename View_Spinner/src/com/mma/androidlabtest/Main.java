package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Main extends Activity /*implements AdapterView.OnItemSelectedListener*/ {
			 
	TextView tv_selection;
	String[] items = {"Value 1", "Value 2", "Value 3", "Value 4", "Value 5"};
	Spinner spinner;

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView (R.layout.main);
		tv_selection = (TextView)findViewById (R.id.tv_selection);
		spinner = (Spinner)findViewById (R.id.spinner);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				tv_selection.setText (items [position]);
			}

			public void onNothingSelected(AdapterView<?> parent) {
				tv_selection.setText ("");
			}
		});
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
			this, 
			android.R.layout.simple_spinner_item, 
			items
		);
		arrayAdapter.setDropDownViewResource (android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter (arrayAdapter);
	}
}
