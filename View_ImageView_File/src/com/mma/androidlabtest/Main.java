package com.mma.androidlabtest;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;

public class Main extends Activity {
			 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageView imageView = (ImageView)findViewById(R.id.imageView);
		imageView.setImageURI(Uri.parse(Environment.getExternalStorageDirectory() + "image.jpg"));
	}
}
