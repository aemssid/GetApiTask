package com.test.ln.getapitask.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.test.ln.getapitask.R;

public class PlaceListActivity extends AppCompatActivity {

    SupportMapFragment map;
    private GoogleMap googleMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_list);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Intent intent=getIntent();
        String lat=intent.getStringExtra("lat");
        String lng=intent.getStringExtra("lng");
        String lat2=intent.getStringExtra("lat2");
        String lng2=intent.getStringExtra("lng2");
        LatLng latLng=new LatLng(Double.valueOf(lat),Double.valueOf(lng));
        LatLng latLng2=new LatLng(Double.valueOf(lat2),Double.valueOf(lng2));


        map=((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map));
        googleMap=map.getMap();

        googleMap.addMarker(new MarkerOptions().position(latLng));
        googleMap.addMarker(new MarkerOptions().position(latLng2));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,7));

    }
}
