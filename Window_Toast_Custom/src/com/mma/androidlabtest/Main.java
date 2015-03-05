package com.mma.androidlabtest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnToast = (Button)findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new Button.OnClickListener() {
				public void onClick(View v) {
					Toast toast = new Toast(getApplicationContext());
	                TextView textView = new TextView(getApplicationContext());
	                textView.setTextColor(Color.BLUE);
	                textView.setBackgroundColor(Color.TRANSPARENT);
	                textView.setTextSize(30);
	                textView.setText("My custom Toast !");
	                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
	                toast.setView(textView);
				}
			}
        );
    }
}
