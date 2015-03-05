package com.mma.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.androidlabtest.com.R;

public class Main 
		extends Activity {
		
    private boolean mStretch;
    private TableLayout tableLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tableLayout = (TableLayout)findViewById(R.id.table_layout);
        Button button = (Button)findViewById(R.id.btn_invert_stretch);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mStretch = !mStretch;
                tableLayout.setColumnStretchable(1, mStretch);
            }
        });
        mStretch = tableLayout.isColumnStretchable(1);
    }
}
