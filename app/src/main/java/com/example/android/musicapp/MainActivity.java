package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the that category
        TextView NowPlaying = (TextView) findViewById(R.id.NowPlaying);
        TextView Playlists = (TextView) findViewById(R.id.Playlists);
        TextView Artists = (TextView) findViewById(R.id.Artists);
        // Set a click listener on that View
        NowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent NowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(NowPlayingIntent);
            }
        });
        // Set a click listener on that View
        Playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent PlaylistsIntent = new Intent(MainActivity.this, Playlists.class);
                startActivity(PlaylistsIntent);
            }
        });
        // Set a click listener on that View
        Artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ArtistsIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(ArtistsIntent);
            }
        });
    }
}

