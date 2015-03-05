package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class Main extends Activity {

    public static final int VERTICAL_ID = Menu.FIRST;
    public static final int HORIZONTAL_ID = Menu.FIRST + 1;
    public static final int TOP_ID = Menu.FIRST + 2;
    public static final int MIDDLE_ID = Menu.FIRST + 3;
    public static final int BOTTOM_ID = Menu.FIRST + 4;
    public static final int LEFT_ID = Menu.FIRST + 5;
    public static final int CENTER_ID = Menu.FIRST + 6;
    public static final int RIGHT_ID = Menu.FIRST + 7;
    private LinearLayout linearLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        linearLayout = (LinearLayout)findViewById(R.id.layout);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, VERTICAL_ID, 0, "Vertical");
        menu.add(0, HORIZONTAL_ID, 0, "Horizontal");
        menu.add(0, TOP_ID, 0, "Vertical top");
        menu.add(0, MIDDLE_ID, 0, "Vertical middle");
        menu.add(0, BOTTOM_ID, 0, "Vertical bottom");
        menu.add(0, LEFT_ID, 0, "Horizontal left");
        menu.add(0, CENTER_ID, 0, "Horizontal center");
        menu.add(0, RIGHT_ID, 0, "Horizontal right");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
	        case VERTICAL_ID:
	        	linearLayout.setOrientation(LinearLayout.VERTICAL);
	            return true;
	        case HORIZONTAL_ID:
	        	linearLayout.setOrientation(LinearLayout.HORIZONTAL);
	            return true;
	        case TOP_ID:
	        	linearLayout.setVerticalGravity(Gravity.TOP);
	            return true;
	        case MIDDLE_ID:
	        	linearLayout.setVerticalGravity(Gravity.CENTER_VERTICAL);
	            return true;
	        case BOTTOM_ID:
	        	linearLayout.setVerticalGravity(Gravity.BOTTOM);
	            return true;
	        case LEFT_ID:
	        	linearLayout.setHorizontalGravity(Gravity.LEFT);
	            return true;
	        case CENTER_ID:
	        	linearLayout.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);
	            return true;
	        case RIGHT_ID:
	        	linearLayout.setHorizontalGravity(Gravity.RIGHT);
	            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
