package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.activity_now_playing);
        ImageView Home = (ImageView) findViewById(R.id.Home);
        ImageView Playlist = (ImageView) findViewById(R.id.Playlist);
        Home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent HomeIntent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(HomeIntent);
            }
        });
        Playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            public void onClick(View view) {
                Intent PlaylistIntent = new Intent(NowPlaying.this, Playlists.class);
                startActivity(PlaylistIntent);
            }
        });
    }
}
