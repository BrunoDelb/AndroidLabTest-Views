package com.mma.androidlabtest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Main extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		GridView gvImages = (GridView)findViewById(R.id.grid_view);
		gvImages.setAdapter(new ImageAdapter(this));
	}

	public class ImageAdapter extends BaseAdapter {
	
		private Context context;
		private Integer[] images = {R.drawable.app, R.drawable.app, R.drawable.app, R.drawable.app};

		public ImageAdapter(Context context) {
			this.context = context;
		}

		public int getCount() {
			return images.length;
		}

		public Object getItem(int position) {
			return null;
		}

		public long getItemId(int position) {
			return 0;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView;
			if (convertView == null) {
				imageView = new ImageView(context);
				imageView.setLayoutParams(new GridView.LayoutParams(90, 90));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(10, 10, 10, 10);
			} else {
				imageView = (ImageView) convertView;
			}
			imageView.setImageResource(images [position]);
			return imageView;
		}
	}
}
