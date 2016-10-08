package com.example.ammei.musicappudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.TestMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        TextView goHome = (TextView) findViewById(R.id.go_home);
        TextView artists2 = (TextView) findViewById(R.id.artist_2);
        TextView downloads2 = (TextView) findViewById(R.id.music_download2);
        TextView playlists2 = (TextView) findViewById(R.id.playlists_2);
        TextView nowPlaying2 = (TextView) findViewById(R.id.nowPlaying2);
        Button libraryDescription = (Button)findViewById(R.id.libraryDescription);

        //Create a new Intent to call the MainActivity from the MusicActivity.
        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHome = new Intent(MusicActivity.this,MainActivity.class);
                startActivity(goHome);
            }
        });

        //Create a new Intent to call the ArtistActivity from the MusicActivity.
        artists2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artists2 = new Intent (MusicActivity.this,ArtistActivity.class);
                startActivity(artists2);
            }
        });

        //Create a new Intent to call the Download Activity from the Music Activity.
        downloads2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent downloads = new Intent(MusicActivity.this,DownloadActivity.class);
                startActivity(downloads);
            }
        });

        //Create a new Intent to call the PlaylistActivity from the MusicActivity.
        playlists2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlists2 = new Intent(MusicActivity.this,PlaylistActivity.class);
                startActivity(playlists2);
            }
        });

        //Create a new Intent to call the NowPlayingActivity from the MusicActivity.
        nowPlaying2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlaying2 = new Intent(MusicActivity.this,NowPlayingActivity.class);
                startActivity(nowPlaying2);
            }
        });

            Button musicDescription = (Button)findViewById(R.id.libraryDescription);
            final TextView displayDescription =(TextView)findViewById(R.id.mDescription);

        //Creating a button to display a text for this activity description.
            musicDescription.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    displayDescription.setText("This activity is designed to display the various songs within your music library, along with the songs duration, and an image of the album/artist.");
                }
            });
        }

}
