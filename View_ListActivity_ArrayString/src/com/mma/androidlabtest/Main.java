package com.mma.androidlabtest;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Main extends ListActivity {

    String[] items = {"One", "Two", "Three", "Four", "Five"};
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
        getListView().setTextFilterEnabled(true);
    }
}
