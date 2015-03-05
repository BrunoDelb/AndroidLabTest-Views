package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Main 
		extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);        
        findViewById(R.id.scrollView).setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);
    }
}
