package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Main extends Activity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
	 } 
    
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
	        case R.id.item1:
	        	Toast.makeText(getApplicationContext(), "Item 1 clicked", Toast.LENGTH_SHORT);
	        	return true;   
	        case R.id.item2:
	        	Toast.makeText(getApplicationContext(), "Item 2 clicked", Toast.LENGTH_SHORT);
	        	return true;
	        case R.id.item3:
	        	Toast.makeText(getApplicationContext(), "Item 3 clicked", Toast.LENGTH_SHORT);
	        	return true;
	        default:
	        	return super.onOptionsItemSelected(item);
        }
    }
}
