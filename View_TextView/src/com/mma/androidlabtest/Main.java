package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main extends Activity {
			 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TextView textView = (TextView)findViewById(R.id.textview);
		CharSequence text_view_old = textView.getText();
		textView.setText(text_view_old);
	}
}
