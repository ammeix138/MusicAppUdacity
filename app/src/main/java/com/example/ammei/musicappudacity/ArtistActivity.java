package com.example.ammei.musicappudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        TextView goHome2 = (TextView) findViewById(R.id.go_home2);
        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary2);
        TextView downloadMusic = (TextView) findViewById(R.id.music_download3);
        TextView playlists = (TextView) findViewById(R.id.playlists_3);
        TextView nowPlaying3 = (TextView) findViewById(R.id.nowPlaying3);

        goHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the MainActivity from the Music Activity.
                Intent goHome2 = new Intent(ArtistActivity.this,MainActivity.class);
                startActivity(goHome2);
            }
        });

        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the ArtistActivity from the MusicActivity.
                Intent musicLibrary = new Intent(ArtistActivity.this,MusicActivity.class);
                startActivity(musicLibrary);
            }
        });

        downloadMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the DownloadActivity from the ArtistActivity.
                Intent downloadMusic = new Intent(ArtistActivity.this,DownloadActivity.class);
                startActivity(downloadMusic);
            }
        });

        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the PlaylistActivity from the ArtistActivity.
                Intent playlsits = new Intent(ArtistActivity.this,PlaylistActivity.class);
                startActivity(playlsits);
            }
        });

        nowPlaying3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to call the NowPlayingActivity from the ArtistActivity.
                Intent nowPlaying3 = new Intent(ArtistActivity.this,NowPlayingActivity.class);
                startActivity(nowPlaying3);
            }
        });




        Button artistDescription = (Button)findViewById(R.id.artistDescription);
        final TextView displayDescription =(TextView)findViewById(R.id.aDescription);

        //Creating a button to display a text for this activity description.
        artistDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayDescription.setText("This activity is designed to display the various artists within your artist library, and will group songs by the same artist under their name within this activity.");
            }
        });

    }
}
