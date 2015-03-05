package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Main extends Activity {
    
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.main);
        Window window = getWindow();
        window.setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_title);
    }
}
