package com.mma.androidlabtest;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class Main extends Activity {
			 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ImageView imgView = (ImageView)findViewById(R.id.imageView);
		imgView.setImageBitmap (BitmapFactory.decodeResource (this.getResources(), R.drawable.app));
	}
}
