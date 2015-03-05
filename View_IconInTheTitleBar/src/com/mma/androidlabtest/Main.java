package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Main extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_LEFT_ICON);
		setContentView(R.layout.dialog_activity);
		Window window = getWindow();
		window.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, android.R.drawable.ic_dialog_alert);
	}
}
