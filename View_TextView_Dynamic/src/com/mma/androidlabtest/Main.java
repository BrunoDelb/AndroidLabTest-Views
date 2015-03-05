package com.mma.androidlabtest;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main extends Activity {
			 
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.main);
        TextView tvValue = new TextView (this);
        tvValue.setText ("The value !");
        setContentView (tvValue);
    }
}
