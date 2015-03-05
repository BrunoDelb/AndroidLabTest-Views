package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;

public class Main extends Activity {
			 
    RatingBar ratingBar;
    TextView tv_rating;
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv_rating = (TextView) findViewById(R.id.tv_rating);
        ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
		        int numStars = ratingBar.getNumStars();
		        tv_rating.setText (rating + "/" + numStars);
		        //ratingBar.setNumStars (numStars);
		    	//ratingBar.setRating(rating);
		        //float ratingBarStepSize = ratingBar.getStepSize();
		        //ratingBar.setStepSize(ratingBarStepSize);
			}
		});
    }
}
