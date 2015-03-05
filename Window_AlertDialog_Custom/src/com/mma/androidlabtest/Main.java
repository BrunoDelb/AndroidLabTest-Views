package com.mma.androidlabtest;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.main);
        dialog.setTitle("My title");
        EditText etText = (EditText)dialog.findViewById(R.id.et_text);
        Button btnYes = (Button)dialog.findViewById(R.id.btn_yes);
        Button btnNow = (Button)dialog.findViewById(R.id.btn_no);
        dialog.show();
    }
}
