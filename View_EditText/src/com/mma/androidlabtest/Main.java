package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends Activity {
			 
	EditText etOutput;
	Button btnRead;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		etOutput = (EditText)findViewById (R.id.et_output);
		btnRead = (Button)findViewById(R.id.btn_read);
		btnRead.setOnClickListener (new View.OnClickListener() {
			public void onClick(View view) {
				Toast.makeText (getApplicationContext(), etOutput.getText(), Toast.LENGTH_SHORT).show();
			}
		});
	}
}
