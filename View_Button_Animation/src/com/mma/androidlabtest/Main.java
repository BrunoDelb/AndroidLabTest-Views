package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Main extends Activity {

	Button btnAnimation;
	
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.main);
		btnAnimation = (Button)findViewById (R.id.btn_animation);
		btnAnimation.setOnClickListener (new View.OnClickListener() {
			public void onClick(View view) {
				Animation animation = AnimationUtils.loadAnimation (getApplicationContext(), R.anim.anim);
				btnAnimation.startAnimation (animation);
			}
		});
	}
}
