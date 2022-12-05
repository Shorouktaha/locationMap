package com.example.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import java.util.List;

public class myLoctionProvider {
    private static final long TIME_UPDAT = 20000;
    private static final float DISTANCE_UPDATE =10;
    private Location location;
    private LocationManager locationManager;

    public myLoctionProvider(Context context) {
        locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        location = null;
    }

    private boolean isProviderEnabled() {
        boolean gps = locationManager.isProviderEnabled(locationManager.GPS_PROVIDER);
        boolean network = locationManager.isProviderEnabled(locationManager.NETWORK_PROVIDER);
        return gps || network;
    }

    @SuppressLint("MissingPermission")
    public Location getCurrrentLocation(LocationListener locationListener) {
        if (!isProviderEnabled())
            return null;
        String provider = locationManager.GPS_PROVIDER;
        if (!locationManager.isProviderEnabled(provider))
            provider = locationManager.NETWORK_PROVIDER;

        location = locationManager.getLastKnownLocation(provider);
        if (location == null)
            location = getBestLocation();
        if (locationListener!=null)
            locationManager.requestLocationUpdates(provider,
                    TIME_UPDAT,DISTANCE_UPDATE,locationListener);
        return location;
    }

    @SuppressLint("MissingPermission")
    private Location getBestLocation() {
        List<String> providers = locationManager.getAllProviders();
        Location bestLocation = null;
        for (String provider : providers) {
            Location tamp = locationManager.getLastKnownLocation(provider);
            if(tamp==null)
                continue;
            if (bestLocation==null)
                bestLocation=tamp;
            else {
                if (tamp.getAccuracy()>bestLocation.getAccuracy())
                    bestLocation=tamp;

            }
        }
        return bestLocation;
    }
}
