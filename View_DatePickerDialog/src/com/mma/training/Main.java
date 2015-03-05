package com.mma.training;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;

import com.mma.androidlabtest.R;

public class Main extends Activity {
	
	DatePickerDialog datePickerDialog;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		datePickerDialog = new DatePickerDialog(this, new OnDateSetListener(){
			public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
				// Date set
			}}, 
			2014, 2, 1
		);
        Button btnShow = (Button)this.findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				datePickerDialog.show();
			}
		});
    }
}
