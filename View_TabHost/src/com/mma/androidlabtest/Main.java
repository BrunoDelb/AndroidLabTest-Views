package com.mma.androidlabtest;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Main extends TabActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
        TabSpec tabSpec1 = tabHost.newTabSpec("My tab 1");
        tabSpec1.setIndicator("Tab1");
        tabSpec1.setContent (new Intent (this, TabActivity1.class));
        TabSpec tabSpec2 = tabHost.newTabSpec("My tab 2");
        tabSpec2.setIndicator("Tab2");
        tabSpec2.setContent (new Intent (this, TabActivity2.class));
        TabSpec tabSpec3 = tabHost.newTabSpec("My tab 3");
        tabSpec3.setIndicator("Tab3");
        tabSpec3.setContent (new Intent (this, TabActivity3.class));
        tabHost.addTab (tabSpec1);
        tabHost.addTab (tabSpec2);
        tabHost.addTab (tabSpec3);
	}
}
