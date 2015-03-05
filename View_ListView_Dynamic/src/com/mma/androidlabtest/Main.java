package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;

public class Main 
		extends Activity {
	
	String[] items = new String[] {"One", "Two", "Three", "Four", "Five"};
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
		ListView listView = new ListView(Main.this);        	
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
			this,
			android.R.layout.simple_list_item_1, 
			items
		);
		listView.setAdapter(adapter);
        layout.setOrientation (LinearLayout.VERTICAL);
        layout.setGravity (Gravity.CENTER);
		layout.addView (listView, new LayoutParams (LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
        setContentView(layout);
    }
}
