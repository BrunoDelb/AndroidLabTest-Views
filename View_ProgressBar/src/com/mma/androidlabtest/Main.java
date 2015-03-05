package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class Main extends Activity {

	private ProgressBar progressBar;
	private Handler handler = new Handler();
	private int counter = 0;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		progressBar = (ProgressBar)findViewById (R.id.progressBar);
		progressBar.setMax (100);
		new Thread (new Runnable() {
			public void run() {
				while (counter < 100) {
					counter++;
					try {
						Thread.sleep (500);
					} catch (InterruptedException e) {
					}
					handler.post (new Runnable() {
						public void run() {
							progressBar.setProgress (counter);
						}
					});
				}
				handler.post (new Runnable() {
					public void run() {
						progressBar.setVisibility (8); // 0 (visible), 4 (invisible), 8 (gone)
					}
				});
			}
		}).start();
	}
}
