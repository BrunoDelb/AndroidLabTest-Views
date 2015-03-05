package com.mma.androidlabtest;

import java.util.Calendar;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class Main extends Activity {
			 
	TimePicker timePicker;
	TimePickerDialog timePickerDialog;
	Button btnSet;

	public void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.main);
		Calendar today = Calendar.getInstance();
		timePicker = (TimePicker)findViewById (R.id.timepicker);
		timePicker.setIs24HourView (true);
		timePickerDialog = new TimePickerDialog (this, timeSetListener, today.get (Calendar.HOUR), today.get (Calendar.MINUTE), false);
		btnSet = (Button)findViewById (R.id.btn_set);
		btnSet.setOnClickListener (new View.OnClickListener() {
			public void onClick (View view) {
				Toast.makeText (getBaseContext(), "Selection: " + timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute(), Toast.LENGTH_SHORT).show();
			}
		});
	}

	private TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
		public void onTimeSet(TimePicker view, int hourOfDay, int minuteOfHour) {
			Toast toast = Toast.makeText (getBaseContext(), "Selection: " + hourOfDay + ":" + minuteOfHour, Toast.LENGTH_SHORT);
			toast.show();
		}
	};
}
