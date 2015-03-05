package com.mma.androidlabtest;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main extends ListActivity {
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(
        	this, 															// context
        	android.R.layout.simple_list_item_multiple_choice, 				// layout
        	new String[] {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"}	// items
        ));
        ListView listView = getListView();
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
}
