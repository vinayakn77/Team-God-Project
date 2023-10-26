package com.example.godappmaps.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.godappmaps.R;
import com.google.android.gms.maps.GoogleMap;


public class LandDetails extends AppCompatActivity  {

    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_details);

    }

}