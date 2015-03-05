package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main 
			 extends Activity {

	CheckBox cbDone;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		cbDone = (CheckBox)findViewById(R.id.cb_done);
		Button btnRead = (Button)findViewById(R.id.btnRead);
		btnRead.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(Main.this, "" + cbDone.isChecked(), Toast.LENGTH_LONG).show();
			}
		});
	}
}
