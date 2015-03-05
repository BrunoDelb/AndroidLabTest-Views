package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		ImageView imageView = (ImageView)findViewById(R.id.imageView);
		imageView.setImageResource(R.drawable.app);
    }
}
