package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TranslateAnimation translateAnimation = new TranslateAnimation(200, 0, 0, 0);
        translateAnimation.setStartOffset(200);
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(500);
        Button btnAnimation = (Button)findViewById (R.id.btn_animation);
        btnAnimation.startAnimation (translateAnimation);
    }
}
