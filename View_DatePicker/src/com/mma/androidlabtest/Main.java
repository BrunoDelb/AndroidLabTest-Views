package com.mma.androidlabtest;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class Main extends Activity {
			 
	DatePicker datePicker;
	DatePickerDialog datePickerDialog;
	Button btnSet;

	public void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.main);
		Calendar today = Calendar.getInstance();
		datePickerDialog = new DatePickerDialog (
			this, 
			new DatePickerDialog.OnDateSetListener() {
				public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
					Toast.makeText (getBaseContext(), "Value : " + (monthOfYear + 1) + "/" + dayOfMonth + "/" + year, Toast.LENGTH_SHORT).show();
				}
			}, 
			today.get (Calendar.YEAR), 
			today.get (Calendar.MONTH), 
			today.get (Calendar.DAY_OF_MONTH)
		);
		datePicker = (DatePicker)findViewById (R.id.datepicker);
		btnSet = (Button) findViewById (R.id.btn_set);
		btnSet.setOnClickListener (new View.OnClickListener() {
			public void onClick (View view) {
				Toast.makeText (getBaseContext(), "Set " + (datePicker.getMonth() + 1) + "/" + datePicker.getDayOfMonth() + "/" + datePicker.getYear(), Toast.LENGTH_SHORT).show();
			}
		});
	}
}
