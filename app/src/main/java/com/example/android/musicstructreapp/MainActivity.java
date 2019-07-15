package com.example.android.musicstructreapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Layout that shows the Now Is Playing category
        LinearLayout nowIsPlaying = (LinearLayout) findViewById(R.id.country);
        LinearLayout albums = (LinearLayout) findViewById(R.id.reggae);
        LinearLayout artists = (LinearLayout) findViewById(R.id.rnb);
        LinearLayout musicStore = (LinearLayout) findViewById(R.id.gospel);

        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);
                startActivity(countryIntent);
            }
        });

        reggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reggaeIntent = new Intent(MainActivity.this, ReggaeActivity.class);
                startActivity(reggaeIntent);
            }
        });

        rnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rnbIntent = new Intent(MainActivity.this, RnBActivity.class);
                startActivity(rnbIntent);
            }
        });

        gospel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gospelIntent = new Intent(MainActivity.this, GospelActivity.class);
                startActivity(gospelIntent);
            }
        });

           }
}