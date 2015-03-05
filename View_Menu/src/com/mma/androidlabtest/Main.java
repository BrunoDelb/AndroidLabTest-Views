package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class Main extends Activity {
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    private void onCreateMenu(Menu menu){
		menu.setQwertyMode(true);
		SubMenu subMenu = menu.addSubMenu (0, 1000, 0, "Menu 1");
    	subMenu.setHeaderIcon (android.R.drawable.ic_menu_call);
    	subMenu.setIcon (android.R.drawable.ic_menu_camera);
    	MenuItem menuItem1 = subMenu.add (0, 1001, 0, "Option 1");
    	menuItem1.setChecked (true);
    	menuItem1.setCheckable (true);
		menuItem1.setAlphabeticShortcut('a');
    	MenuItem menuItem2 = subMenu.add (0, 1002, 0, "Option 2");
    	menuItem2.setEnabled (false);
		menuItem2.setAlphabeticShortcut('b');
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()){
			case 1001:
				Toast.makeText (this, "Option 1 selected", Toast.LENGTH_SHORT).show();
				break;
			case 1002:
				Toast.makeText (this, "Option 2 selected", Toast.LENGTH_SHORT).show();
				break;
    	}
    	return super.onOptionsItemSelected(item);
    }
 
    public boolean onPrepareOptionsMenu(Menu menu) {
    	MenuItem menuItem = menu.findItem (1002);
    	menuItem.setTitle ("It's the menu");
    	return super.onPrepareOptionsMenu(menu);
    }
}
