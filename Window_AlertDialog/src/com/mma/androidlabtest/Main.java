package com.mma.androidlabtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class Main extends Activity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        AlertDialog dialog;
        dialog = new AlertDialog.Builder(this).create();
        dialog.setTitle("The title here");
        dialog.setIcon(android.R.drawable.ic_dialog_info);
        dialog.setMessage("The message here");
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	dialog.dismiss();
            }    
        });
        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, "No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	dialog.dismiss();
            }    
        });
        dialog.show();
    }
}
