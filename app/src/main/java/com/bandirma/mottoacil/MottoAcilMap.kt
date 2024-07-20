package com.bandirma.mottoacil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.bandirma.mottoacil.databinding.ActivityMottoAcilMapBinding

class MottoAcilMap : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
private lateinit var binding: ActivityMottoAcilMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMottoAcilMapBinding.inflate(layoutInflater)
     setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // lat  enlem
        // lon boylam
        val mandir = LatLng(40.3, 27.9)
        mMap.addMarker(MarkerOptions().position(mandir).title("Bandırma Onyedi Eylül Üniversitesindesiniz"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mandir))

    }
}