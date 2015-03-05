package com.mma.androidlabtest;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Main extends Activity {
			 
	public void onCreate (Bundle savedInstanceState) {
		requestWindowFeature (Window.FEATURE_NO_TITLE);
		Window window = getWindow();
		window.setFlags (WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate (savedInstanceState);
	}
}
