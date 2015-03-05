package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

public class Main 
		extends Activity {

	TextView tvKeys;
	TextView tvMotion;
	TextView tvTrack;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tvKeys = (TextView)findViewById (R.id.tv_test_keys);
        tvMotion = (TextView)findViewById (R.id.tv_test_motion);
        tvTrack = (TextView)findViewById (R.id.tv_test_track);
    }
    
    public boolean onTouchEvent(MotionEvent event) {
    	String text = "x: " + event.getX() + ", y: " + event.getY() + ", ";
    	switch(event.getAction()){
			case MotionEvent.ACTION_DOWN:
				text += "Down !";
				break;
			case MotionEvent.ACTION_UP:
				text += "Up !";
				break;
			case MotionEvent.ACTION_MOVE:
				text += "Move !";
				break;
    	}
    	tvMotion.setText(text);
    	return super.onTouchEvent(event);
    }
    
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		tvKeys.setText ("KeyDown: " + keyCode);
		return super.onKeyDown(keyCode, event);
	} 
 
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		tvKeys.setText ("KeyUp: " + keyCode);
		return super.onKeyUp(keyCode, event);
	}
   
	public boolean onTrackballEvent(MotionEvent event) {
		switch(event.getAction()){
			case MotionEvent.ACTION_DOWN:
				tvTrack.setText("Trackball: Down");
				break;
			case MotionEvent.ACTION_UP:	
				tvTrack.setText ("Trackball: Up");
				break;
			case MotionEvent.ACTION_MOVE:
				tvTrack.setText ("Trackball: " + event.getX() + ", " + event.getY());
				break;
		}
		return super.onTrackballEvent(event);
	}
}
