package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ViewSwitcher.ViewFactory;

public class Main extends Activity {

	ImageSwitcher imageSwitcher;
	int current = -1;
	int images[] = null;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageButton imageButton = (ImageButton)findViewById (R.id.imageButton);        	
		imageButton.setImageResource(R.drawable.app);
		images = new int[] {R.drawable.app, R.drawable.app, R.drawable.app, R.drawable.app};
		// to keep current Index of ImageID array
		int currentIndex=-1; 
		Button btnNext = (Button)findViewById(R.id.btn_next);
		btnNext.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				current++;
				if(current == images.length)
					current = 0;
				imageSwitcher.setImageResource (images [current]);
			}
		});
		imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
		imageSwitcher.setFactory(new ViewFactory() {
			public View makeView() {
				ImageView imageView = new ImageView(getApplicationContext());
				imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
				imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));
				return imageView;
			}
		});
		Animation animationIn = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
		imageSwitcher.setInAnimation(animationIn);
		Animation animationOut = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
		imageSwitcher.setOutAnimation(animationOut);
	}
}
