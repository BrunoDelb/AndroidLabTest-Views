package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

public class Main extends Activity {

	GestureDetector gestureDetector;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		gestureDetector = new GestureDetector(this, new GestureListener());
	}

	public boolean onTouchEvent(MotionEvent event) {
		boolean received = gestureDetector.onTouchEvent(event);
		if (received) {
			Toast.makeText (this, GestureListener.name, Toast.LENGTH_LONG).show();
			return true;
		} else
			return false;
	}
}
