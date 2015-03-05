package com.mma.androidlabtest;

import java.util.ArrayList;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ExpandableListView;

public class Main extends ExpandableListActivity {

	private ArrayList<String> parentItems = new ArrayList<String>();
	private ArrayList<Object> childItems = new ArrayList<Object>();

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ExpandableListView expandableListView = getExpandableListView(); 
		expandableListView.setDividerHeight(2);
		expandableListView.setGroupIndicator(null);
		parentItems.add("Parent 1");
		ArrayList<String> child = new ArrayList<String>();
		child.add("Item 1.1");
		child.add("Item 1.2");
		child.add("Item 1.3");
		childItems.add(child);
		parentItems.add("Parent 2");
		child = new ArrayList<String>();
		child.add("Item 2.1");
		child.add("Item 2.2");
		child.add("Item 2.3");
		childItems.add(child);
		MyExpandableAdapter myExpandableAdapter = new MyExpandableAdapter(parentItems, childItems);
		myExpandableAdapter.setInflater((LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE), this);
		expandableListView.setAdapter(myExpandableAdapter);
		expandableListView.setOnChildClickListener(this);
	}
}
