package com.mma.androidlabtest;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.GridView;
import android.widget.SimpleCursorAdapter;

public class Main extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Cursor cursor = managedQuery(ContactsContract.Contacts.CONTENT_URI, null, null, null, ContactsContract.Contacts.DISPLAY_NAME);
        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(
        	this, 
        	android.R.layout.simple_list_item_1, 
        	cursor, 
        	new String[] {ContactsContract.Contacts.DISPLAY_NAME}, 
        	new int[] {android.R.id.text1}
        );
        GridView gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter (simpleCursorAdapter);
    }
}
