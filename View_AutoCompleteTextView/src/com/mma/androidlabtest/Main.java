package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Main extends Activity {
			 
	String[] cities = {"Paris", "Marseille", "Lyon", "Lille"};
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        	this, 
        	android.R.layout.simple_dropdown_item_1line, 
        	cities
        );
        AutoCompleteTextView actvCity = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        actvCity.setThreshold(3);
        actvCity.setAdapter(adapter);      
    }
}
