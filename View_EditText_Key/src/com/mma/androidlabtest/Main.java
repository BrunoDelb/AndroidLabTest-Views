package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

public class Main extends Activity {

	EditText etOutput;

	public void onCreate (Bundle bundle) {
		super.onCreate (bundle);
		setContentView (R.layout.main);
		etOutput = (EditText)findViewById (R.id.et_output);
		etOutput.setOnKeyListener (new OnKeyListener() {
			public boolean onKey (View view, int keyCode, KeyEvent keyEvent) {
				etOutput.setText ("KeyCode: " + keyCode + ", KeyEvent: " + keyEvent);
				return false;
			}
		});
	}
}
