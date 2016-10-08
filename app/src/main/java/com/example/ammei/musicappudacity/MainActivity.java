package com.example.ammei.musicappudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary);
        TextView artists = (TextView) findViewById(R.id.artists);
        TextView myPlaylists = (TextView) findViewById(R.id.playlists);
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);
        TextView download = (TextView) findViewById(R.id.music_download);

        musicLibrary.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new Intent to call the MusicActivity.
                Intent musicLibrary = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(musicLibrary);
            }
        });

        artists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the ArtistActivity.
                Intent artists = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artists);
            }
        });

        myPlaylists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the PlaylistActivity.
                Intent myPlaylists = new Intent(MainActivity.this,PlaylistActivity.class);
                startActivity(myPlaylists);
            }
        });

        nowPlaying.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the NowPlayingActivity.
                Intent nowPlaying = new Intent(MainActivity.this,NowPlayingActivity.class);
                startActivity(nowPlaying);
            }
        });

        download.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the DownloadActivity.
                Intent download = new Intent(MainActivity.this,DownloadActivity.class);
                startActivity(download);
            }
        });
        }
    }
