package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Main extends Activity {    

    private Preview preview;
    
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        preview = new Preview(this);
        setContentView(preview);
    }
}
