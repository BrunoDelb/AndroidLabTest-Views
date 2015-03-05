package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Main extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toast myToast = Toast.makeText (this.getApplicationContext(), "My Toast !", Toast.LENGTH_LONG);
        myToast.show();
    }
}
