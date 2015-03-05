package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class Main 
	extends Activity {
	
    private boolean mShortcutsCollapsed;
    private boolean mCheckmarksCollapsed;
    TableLayout tableLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tableLayout = (TableLayout) findViewById(R.id.menu);
        Button btnCollapse1 = (Button) findViewById(R.id.btn_collapse1);
        btnCollapse1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mShortcutsCollapsed = !mShortcutsCollapsed;
                tableLayout.setColumnCollapsed(2, mShortcutsCollapsed);
            }
        });
        Button btnCollapse2 = (Button) findViewById(R.id.btn_collapse2);
        btnCollapse2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mCheckmarksCollapsed = !mCheckmarksCollapsed;
                tableLayout.setColumnCollapsed(1, mCheckmarksCollapsed);
            }
        });
        mCheckmarksCollapsed = tableLayout.isColumnCollapsed(1);
        mShortcutsCollapsed = tableLayout.isColumnCollapsed(2);
    }
}
