package com.mma.androidlabtest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;

public class Main extends Activity {

	TextSwitcher textSwitcher;
	int current = -1;
	String texts[] = null;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		texts = new String[] {"One", "Two", "Three", "Four", "Five"};
		// to keep current Index of ImageID array
		int currentIndex=-1; 
		Button btnNext = (Button)findViewById(R.id.btn_next);
		btnNext.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				current++;
				if(current == texts.length)
					current = 0;
				textSwitcher.setText (texts [current]);
			}
		});
		textSwitcher = (TextSwitcher)findViewById(R.id.imageSwitcher);
		textSwitcher.setFactory(new ViewFactory() {
			public View makeView() {
				TextView textView = new TextView (Main.this);
				textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
				textView.setTextSize(30);
				textView.setTextColor(Color.RED);
				return textView;
			}
		});
		Animation animationIn = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
		textSwitcher.setInAnimation(animationIn);
		Animation animationOut = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
		textSwitcher.setOutAnimation(animationOut);
	}
}
