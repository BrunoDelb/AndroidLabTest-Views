package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

public class Main extends Activity {
			 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageButton imageButton = (ImageButton)findViewById (R.id.imageButton);        	
		imageButton.setImageResource(R.drawable.app);
	}
}
