package com.mma.androidlabtest;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main 
		extends ListActivity {
		
    private String[] cities = {
        "Bordeaux",
        "Marseille",
        "Paris",
        "Nantes"
    };
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(
        	this, 
        	android.R.layout.simple_list_item_1, 
        	cities
        ));
        AnimationSet animationSet = new AnimationSet(true);
        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(50);
        animationSet.addAnimation(animation);
        
        animation = new TranslateAnimation(
            Animation.RELATIVE_TO_SELF, 0.0f,Animation.RELATIVE_TO_SELF, 0.0f,
            Animation.RELATIVE_TO_SELF, -1.0f,Animation.RELATIVE_TO_SELF, 0.0f
        );
        animation.setDuration(100);
        animationSet.addAnimation(animation);
        
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(animationSet, 0.5f);
        ListView listView = getListView();        
        listView.setLayoutAnimation(layoutAnimationController);
    }
}
