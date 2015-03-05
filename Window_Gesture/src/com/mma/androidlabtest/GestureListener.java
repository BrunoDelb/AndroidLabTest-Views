package com.mma.androidlabtest;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class GestureListener extends GestureDetector.SimpleOnGestureListener {

	static String name = "";

	public boolean onSingleTapUp(MotionEvent ev) {
		name = "Single tap up (" + ev.toString() + ")";
		return true;
	}

	public void onShowPress(MotionEvent ev) {
		name = "Show press (" + ev.toString() + ")";
	}

	public void onLongPress(MotionEvent ev) {
		name = "Long press (" + ev.toString() + ")";
	}

	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
		name = "Scroll 1 (" + e1.toString() + "), 2 (" + e2.toString() + "), distance " + distanceX + ", " + distanceY;
		return true;
	}

	public boolean onDown(MotionEvent ev) {
		name = ev.toString();
		return true;
	}

	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
		name = "Fling 1 (" + e1.toString() + "), 2 (" + e2.toString() + "), velocity " + velocityX + ", " + velocityY;
		return true;
	}
}
