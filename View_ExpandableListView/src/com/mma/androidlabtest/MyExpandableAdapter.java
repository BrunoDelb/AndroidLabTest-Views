package com.mma.androidlabtest;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MyExpandableAdapter extends BaseExpandableListAdapter  {

	private Activity activity;
	private ArrayList<Object> children;
	private LayoutInflater inflater;
	private ArrayList<String> parentItems, child;

	public MyExpandableAdapter(ArrayList<String> parents, ArrayList<Object> children) {
		this.parentItems = parents;
		this.children = children;
	}

	public void setInflater(LayoutInflater inflater, Activity activity) {
		this.inflater = inflater;
		this.activity = activity;
	}

	public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.child_view, null);
		}
		TextView textViewChild = (TextView)convertView.findViewById(R.id.textViewChild);
		//child = (ArrayList<String>)children.get(groupPosition);
		textViewChild.setText (child.get (childPosition));
		convertView.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				Toast.makeText(activity, child.get(childPosition), Toast.LENGTH_SHORT).show();
			}
		});
		return convertView;
	}

	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.parent_view, null);
		}
		CheckedTextView checkedTextView = (CheckedTextView)convertView;
		checkedTextView.setText (parentItems.get (groupPosition));
		checkedTextView.setChecked (isExpanded);
		return checkedTextView;
	}

	public Object getChild(int groupPosition, int childPosition) {
		return null;
	}

	public long getChildId(int groupPosition, int childPosition) {
		return 0;
	}

	public int getChildrenCount(int groupPosition) {
		ArrayList<String> childrenList = (ArrayList<String>)children.get (groupPosition);
		return childrenList.size();
	}

	public Object getGroup(int groupPosition) {
		return null;
	}

	public int getGroupCount() {
		return parentItems.size();
	}

	public void onGroupCollapsed(int groupPosition) {
		super.onGroupCollapsed(groupPosition);
	}

	public void onGroupExpanded(int groupPosition) {
		super.onGroupExpanded(groupPosition);
	}

	public long getGroupId(int groupPosition) {
		return 0;
	}

	public boolean hasStableIds() {
		return false;
	}

	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return false;
	}
}
