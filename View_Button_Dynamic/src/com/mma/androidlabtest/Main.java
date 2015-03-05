package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;

public class Main extends Activity {
			 
	public void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        Button button = new Button (this);
        button.setText ("New button");
		setContentView (button, new LayoutParams (LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
    }
}
