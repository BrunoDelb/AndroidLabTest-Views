package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {

	Button button;
	EditText et_value;
	float value = 0;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button = (Button)findViewById(R.id.rotatingButton);
        et_value = (EditText)findViewById (R.id.et_value);
        Button btnTranslationX = (Button)findViewById(R.id.btn_translationx);
        btnTranslationX.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		        button.setTranslationX(value);				
			}
		});
        Button btnTranslationY = (Button)findViewById(R.id.btn_translationy);
        btnTranslationY.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		        button.setTranslationY(value);
			}
		});
        Button btnSetScaleX = (Button)findViewById(R.id.btn_setscalex);
        btnSetScaleX.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		        button.setScaleX(value / 10);
			}
		});
        Button btnSetScaleY = (Button)findViewById(R.id.btn_setscaley);
        btnSetScaleY.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		        button.setScaleY(value / 10);
			}
		});
        Button btnSetRotationX = (Button)findViewById(R.id.btn_setrotationx);
        btnSetRotationX.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		        button.setRotationX(value);
			}
		});
        Button btnSetRotationY = (Button)findViewById(R.id.btn_setrotationy);
        btnSetRotationY.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		        button.setRotationY(value);
			}
		});
        Button btnRotation = (Button)findViewById(R.id.btn_rotation);
        btnRotation.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		        button.setRotation(value);
			}
		});
   }
}
