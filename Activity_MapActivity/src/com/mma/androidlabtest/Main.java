package com.mma.androidlabtest;

import android.os.Bundle;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

public class Main extends MapActivity {
	
	MapView mapView = null;
	MapController mapController = null;
	// Intégrer l'API Key dans le fichier res\values\strings.xml, dans l'entrée apikey.
	// Vous pouvez obtenir cette apikey dans la console de Google.
	// Vous devrez obtenir l'empreinte (fingerprint) SHA1 du certificat.
	// Pour cela, vous devrez lancer cette commande : keytool -list -v -keystore mystore.keystore
	
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
		
		int zoom = mapView.getZoomLevel();
		mapController.setZoom (zoom);
		boolean satellite = mapView.isSatellite();
		mapView.setSatellite (satellite);
		boolean traffic = mapView.isTraffic();
		mapView.setTraffic (traffic);
		boolean streetView = mapView.isStreetView();
		mapView.setStreetView (streetView);
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
