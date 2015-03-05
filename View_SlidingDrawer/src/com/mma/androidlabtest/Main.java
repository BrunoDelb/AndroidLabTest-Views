package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SlidingDrawer;
import android.widget.SlidingDrawer.OnDrawerScrollListener;

public class Main extends Activity {
    
	SlidingDrawer slidingDrawer;
	ImageView imageView;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        slidingDrawer = (SlidingDrawer)findViewById(R.id.slide);
        imageView = (ImageView)findViewById(R.id.imageView);
        slidingDrawer.setOnDrawerScrollListener(new OnDrawerScrollListener(){
			public void onScrollEnded() {
				if (slidingDrawer.isOpened()) {
					imageView.setImageResource(android.R.drawable.ic_menu_edit);
				} else {
					imageView.setImageResource(android.R.drawable.ic_delete);
				}
			}

			public void onScrollStarted() {
			}
		});
    }
}
