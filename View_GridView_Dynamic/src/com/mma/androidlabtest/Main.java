package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class Main extends Activity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		GridView view = new GridView(Main.this);        	
		view.setNumColumns(GridView.AUTO_FIT);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
			Main.this,
			android.R.layout.simple_list_item_1,
			new String[] {"One", "Two", "Three", "Four", "Five"}
		);
		view.setAdapter(adapter);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation (LinearLayout.VERTICAL);
        layout.setGravity (Gravity.CENTER);
		layout.addView (view, new LayoutParams (LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
        setContentView(layout);
    }
}
