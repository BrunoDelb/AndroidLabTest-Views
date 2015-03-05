package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {

	private EditText etUrl;
	private Button btnLoad;
	private WebView webView;

	public void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.main);
		webView = (WebView)findViewById (R.id.webView);
		btnLoad = (Button)findViewById (R.id.btn_load);
		btnLoad.setOnClickListener (new OnClickListener() {
			public void onClick (View view) {
				webView.loadUrl (etUrl.getText().toString());
				webView.requestFocus();
			}
		});
		etUrl = (EditText)findViewById (R.id.et_url);
		etUrl.setOnKeyListener (new OnKeyListener() {
			public boolean onKey (View view, int keyCode, KeyEvent event) {
				if (keyCode == KeyEvent.KEYCODE_ENTER) {
					webView.loadUrl (etUrl.getText().toString());
					webView.requestFocus();
					return true;
				}
				return false;
			}
		});
	}
}
