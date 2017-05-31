package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        // Find the View that shows the listed category
        ImageView NowPlaying = (ImageView) findViewById(R.id.NowPlaying);
        ImageView MainMenu = (ImageView) findViewById(R.id.MainMenu);
        // Set a click listener on that View
        NowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the  View is clicked on.
            @Override
            public void onClick(View view) {
                Intent NowPlayingIntent = new Intent(Playlists.this, NowPlaying.class);
                startActivity(NowPlayingIntent);
            }
        });
        // Set a click listener on that View
        MainMenu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent MainMenuIntent = new Intent(Playlists.this, MainActivity.class);
                startActivity(MainMenuIntent);
            }
        });
    }
}