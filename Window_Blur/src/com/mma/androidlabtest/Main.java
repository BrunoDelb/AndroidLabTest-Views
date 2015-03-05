package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Main extends Activity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND, WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        setContentView(R.layout.main);
    }
}
