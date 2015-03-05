package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Main extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnAnimate = (Button)findViewById (R.id.btn_animate);
        btnAnimate.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		        Animation shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
		        findViewById(R.id.et_animation).startAnimation(shake);
			}
		});
    }
}
