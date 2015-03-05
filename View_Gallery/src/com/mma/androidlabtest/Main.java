package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Gallery;

public class Main extends Activity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.main);
        Gallery gallery = (Gallery)findViewById (R.id.gallery);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
			Main.this,
			android.R.layout.simple_spinner_item,
			new String[]{"One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten"}
		);        	
		gallery.setBackgroundColor(0xFF0000FF);
		gallery.setAdapter(adapter);
    }
}
