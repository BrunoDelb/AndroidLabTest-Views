package com.mma.androidlabtest;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Main extends TabActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TabHost tabHost = getTabHost();
        
        TabSpec tab1 = tabHost.newTabSpec("tab1");
        tab1.setIndicator("list");
        tab1.setContent(new Intent(this, ActivityTab.class));
        tabHost.addTab(tab1);
        
        TabSpec tab2 = tabHost.newTabSpec("tab2");
        tab2.setIndicator("photo list");
        tab2.setContent(new Intent(this, ActivityTab.class));
        tabHost.addTab(tab2);
        		
        TabSpec tab3 = tabHost.newTabSpec("tab3");
        tab3.setIndicator("destroy");
        tab3.setContent(new Intent(this, ActivityTab.class));
        tabHost.addTab(tab3);
    }
}
