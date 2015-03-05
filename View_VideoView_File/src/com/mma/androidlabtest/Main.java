package com.mma.androidlabtest;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main extends Activity {
			 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main);
		VideoView videoView = (VideoView)this.findViewById(R.id.videoView);
		MediaController mediaController = new MediaController(this);
		videoView.setMediaController(mediaController);
		videoView.setVideoPath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES) + "/video.mp4");
		videoView.requestFocus();
		videoView.start();
	}
}
