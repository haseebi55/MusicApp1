package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        // Find the View that shows the listed category
        TextView NowPlaying = (TextView) findViewById(R.id.NowPlaying);
        TextView MainMenu = (TextView) findViewById(R.id.MainMenu);
        TextView Album = (TextView) findViewById(R.id.Albums);
        // Set a click listener on that View
        NowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent NowPlayingIntent = new Intent(Playlists.this, NowPlaying.class);
                startActivity(NowPlayingIntent);
            }
        });
        // Set a click listener on that View
        MainMenu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent MainMenuIntent = new Intent(Playlists.this, MainActivity.class);
                startActivity(MainMenuIntent);
            }
        });
        // Set a click listener on that View
        Album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent AlbumIntent = new Intent(Playlists.this, Album.class);
                startActivity(AlbumIntent);
            }
        });

    }
}