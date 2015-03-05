package com.mma.androidlabtest;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main extends Activity {
			 
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.main);
		WebView webView = (WebView)findViewById (R.id.webview);
		webView.getSettings().setBuiltInZoomControls (true);
		webView.loadData("<h1>Helloworld</h1><p>It's <b>your</b> webpage.</i></p>", "text/html", "utf-8");
	}
}
