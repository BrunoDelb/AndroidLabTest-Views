package com.mma.androidlabtest;

import android.app.Activity;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main extends Activity {

	TextView tvTitle;
	ImageButton ibPreview;
	Cursor cursor;
	Bitmap bmp;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tvTitle = (TextView)this.findViewById(R.id.tv_title);
		cursor = managedQuery(
			Media.EXTERNAL_CONTENT_URI, 
			new String[] {Media.DATA, Media._ID, Media.TITLE, Media.DISPLAY_NAME}, 
			null, 
			null, 
			null
		);
		ibPreview = (ImageButton)this.findViewById(R.id.imageButton);
		ibPreview.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (cursor.moveToNext()) {
					tvTitle.setText(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DISPLAY_NAME)));
					String filePath = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA));
					BitmapFactory.Options options = new BitmapFactory.Options();
					options.inSampleSize = 2;
					Bitmap bitmap = BitmapFactory.decodeFile(filePath, options);
					ibPreview.setImageBitmap(bitmap);
				}
			}
		});
	}
}
