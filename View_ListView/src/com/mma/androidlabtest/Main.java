package com.mma.androidlabtest;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main 
		extends ListActivity {
	
	String[] items = new String[]{"One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		ListView listView = getListView();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
			this,
			android.R.layout.simple_list_item_1, 
			items
		);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick (AdapterView<?> adView, View view , int position, long id) {
				Toast.makeText(getApplicationContext(), "Position: " + position + ", id=" + id, Toast.LENGTH_SHORT);
			}
		});
    }
}
