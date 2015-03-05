package com.mma.androidlabtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnLaunch = (Button)findViewById(R.id.btn_launch);
        btnLaunch.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent (Main.this, Activity2.class);
				startActivity (intent);
			}
		});
    }
}
