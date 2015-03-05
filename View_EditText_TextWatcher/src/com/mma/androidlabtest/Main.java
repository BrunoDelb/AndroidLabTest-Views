package com.mma.androidlabtest;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class Main extends Activity /*implements TextWatcher*/ {

	EditText text;
	int textCount;
	EditText etOutput;
	EditText etCounter;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(text);
		etCounter = (EditText)findViewById(R.id.et_length);
		etOutput = (EditText)findViewById(R.id.et_output);
		etOutput.addTextChangedListener(new TextWatcher() {
			
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				etCounter.setText (etOutput.getText().length());
			}
			
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}
			
			public void afterTextChanged(Editable s) {
			}
		});
	}
}
