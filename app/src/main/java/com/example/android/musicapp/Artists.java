package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
       ImageView NowPlaying = (ImageView) findViewById(R.id.NowPlaying);
        ImageView Home = (ImageView) findViewById(R.id.Home);
        NowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent NowPlayingIntent = new Intent(Artists.this, NowPlaying.class);
                startActivity(NowPlayingIntent);
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent NowPlayingIntent = new Intent(Artists.this, MainActivity.class);
                startActivity(NowPlayingIntent);
            }
        });
    }
}
