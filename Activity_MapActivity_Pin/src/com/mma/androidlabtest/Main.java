package com.mma.androidlabtest;

import java.util.ArrayList;
import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;

public class Main extends MapActivity {
	
	MapView mapView = null;
	MapController mapController = null;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mapView = (MapView)findViewById(R.id.googlemap);
        mapView.setBuiltInZoomControls(true);
    	double latitude = 48.87552;
    	double longitude = 2.33578;
        GeoPoint point = new GeoPoint ((int)(latitude*1000000), (int)(longitude*1000000));
        MyOverlayItem myOverlayItem = new MyOverlayItem(getResources().getDrawable(R.drawable.marker));
        myOverlayItem.addPoint(point);
		mapView.getOverlays().add(myOverlayItem);
		mapController = mapView.getController();
		mapController.setZoom(12);
		mapController.setCenter(point);
    }

	public void onProviderDisabled(String provider) {
	}

	public void onProviderEnabled(String provider) {
	}

	public void onStatusChanged(String provider, int status, Bundle extras) {
	}

	protected boolean isRouteDisplayed() {
		return false;
	}

	public class MyOverlayItem 
			extends ItemizedOverlay<OverlayItem> {

	    private List<GeoPoint> points = new ArrayList<GeoPoint>();

	    public MyOverlayItem(Drawable defaultMarker) {
	        super(boundCenterBottom(defaultMarker));
	    }

		protected OverlayItem createItem(int i) {
	        return new OverlayItem (points.get(i), "Title", "Description");
	    }

		public int size() {
	        return points.size();
	    }

	    public void addPoint(GeoPoint point) {
	        this.points.add(point);
	        populate();
	    }
		
	    public void clearPoint() {
	        this.points.clear();
	        populate();
	    }
	}
}
