package com.mma.androidlabtest;
import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnMenu = (Button)findViewById (R.id.btnMenu);
        btnMenu.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				openContextMenu(v);
			}
		});
        registerForContextMenu(btnMenu);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextmenu, menu);
        menu.setHeaderTitle("Menu title");
    }

    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()) {
			case R.id.option1:
				Toast.makeText (this, "Option 1", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.option2:
				Toast.makeText (this, "Option 2", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.option3:
				Toast.makeText (this, "Option 3", Toast.LENGTH_SHORT).show();
				return true;
        }
        return super.onContextItemSelected(item);
    }
}
