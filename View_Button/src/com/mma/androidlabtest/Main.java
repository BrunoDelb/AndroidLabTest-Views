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
		Button btnClick = (Button)findViewById (R.id.btnDemo);
		btnClick.setOnClickListener (new View.OnClickListener() {
			public void onClick(View view) {
				Toast toast = Toast.makeText (getApplicationContext(), "Clicked", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
	}
}
