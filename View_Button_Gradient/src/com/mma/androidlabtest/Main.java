package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {

	public void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.main);
		Button btnGradient = (Button)findViewById (R.id.btn_gradient);
	}
}
