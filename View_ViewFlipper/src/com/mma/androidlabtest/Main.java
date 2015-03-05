package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.ViewFlipper;

public class Main extends Activity {

    private ViewFlipper viewFlipper;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        viewFlipper.startFlipping();
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        	this, 
        	android.R.layout.simple_spinner_item, 
        	new String[] {"Push up", "Push left", "Cross fade", "Hyperspace", "Left", "Right"}
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
	            switch (position) {
			        case 0:
			        	viewFlipper.setInAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.push_up_in));
			        	viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.push_up_out));
			            break;
			        case 1:
			        	viewFlipper.setInAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.push_left_in));
			        	viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.push_left_out));
			            break;
			        case 2:
			        	viewFlipper.setInAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_in));
			        	viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.fade_out));
			            break;
			        case 3:
			        	viewFlipper.setInAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.hyperspace_in));
			        	viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.hyperspace_out));
			            break;
			        case 4:
			        	viewFlipper.setInAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in_left));
			        	viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out_right));
			            break;
			        case 5:
			        	viewFlipper.setInAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in_right));
			        	viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out_left));
			            break;
		        }
			}

			public void onNothingSelected(AdapterView<?> v) {
			}
		});
    }
}
