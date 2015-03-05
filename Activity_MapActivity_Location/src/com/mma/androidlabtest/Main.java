package com.mma.androidlabtest;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

public class Main extends MapActivity 
		implements LocationListener {
	
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
        mapController = mapView.getController();
        mapController.setZoom(12);
        mapController.setCenter(point);
		LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000L, 500.0f, this);
    }

	public void onLocationChanged(Location location) {
		if (location != null) {
			Toast.makeText(this, "New position : " + location.getLatitude() + ", " + location.getLongitude(), Toast.LENGTH_SHORT).show();
			mapController.animateTo(new GeoPoint((int)(location.getLatitude()*1000000),(int)(location.getLongitude()*1000000)));
		}
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
}
