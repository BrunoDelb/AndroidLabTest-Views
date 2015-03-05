package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main extends Activity {

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		LinearLayout linearLayout = new LinearLayout(this);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		TextView tvText = new TextView(this);
		tvText.setText("Hello world");
		LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
		LinearLayout.LayoutParams layoutParamsTv = new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		linearLayout.addView (tvText, layoutParamsTv);
		addContentView (linearLayout, layoutParams);
	}
}
