package com.example.ammei.musicappudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DownloadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        TextView goHome4 = (TextView) findViewById(R.id.go_home4);
        TextView musicLibrary4 = (TextView) findViewById(R.id.musicLibrary4);
        TextView playlists_4 = (TextView) findViewById(R.id.playlists_4);
        TextView artist4 = (TextView) findViewById(R.id.artist_4);
        TextView nowPlaying6 = (TextView) findViewById(R.id.nowPlaying_6);

        goHome4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the MainActivity from the DownloadActivity.
                Intent goHome4 = new Intent (DownloadActivity.this,MainActivity.class);
                startActivity(goHome4);
            }
        });

        musicLibrary4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the \MusicActivity from the DownloadActivity.
                Intent musicLibrary4 = new Intent (DownloadActivity.this,MusicActivity.class);
                startActivity(musicLibrary4);
            }
        });

        playlists_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the PlaylistActivity from the DownloadActivity.
                Intent playlists_4 = new Intent(DownloadActivity.this,PlaylistActivity.class);
                startActivity(playlists_4);
            }
        });

        artist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the ArtistActivity from the DownloadActivity.
                Intent artist4 = new Intent(DownloadActivity.this,ArtistActivity.class);
                startActivity(artist4);
            }
        });

        nowPlaying6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the NowPlayingActivity from the DownloadActivity.
                Intent nowPlaying6 = new Intent(DownloadActivity.this,NowPlayingActivity.class);
                startActivity(nowPlaying6);
            }
        });


        Button downloadDescription = (Button)findViewById(R.id.downloadDescription);
        final TextView displayDescription =(TextView)findViewById(R.id.downDescription);

        //Creating a button to display a text for this activity description.
        downloadDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayDescription.setText("This activity is designed to display the music the user has previously download while also giving the option to search, purchase, and download new music.");
            }
        });

    }
}
