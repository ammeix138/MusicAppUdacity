package com.example.ammei.musicappudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        TextView goHome3 = (TextView) findViewById(R.id.go_home3);
        TextView musicLibrary3 = (TextView) findViewById(R.id.musicLibrary3);
        TextView downloads4 = (TextView) findViewById(R.id.music_download4);
        TextView artists3 = (TextView) findViewById(R.id.artist_3);
        TextView nowPlaying5 = (TextView)findViewById(R.id.nowPlaying5);

        //Create a new Intent to call the MainActivity from the PlaylistActivity.
        goHome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHome3 = new Intent(PlaylistActivity.this,MainActivity.class);
                startActivity(goHome3);
            }
        });

        //Create a new Intent to call the MusicActivity from the PlaylistActivity.
        musicLibrary3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicLibrary3 = new Intent (PlaylistActivity.this,MusicActivity.class);
                startActivity(musicLibrary3);
            }
        });

        //Create a new Intent to call the DownloadActivity from the PlaylistActivity.
        downloads4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent downloads4 = new Intent (PlaylistActivity.this,DownloadActivity.class);
                startActivity(downloads4);
            }
        });

        //Create a new Intent to call the ArtistActivity from the PlaylistActivity.
        artists3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artists3 = new Intent(PlaylistActivity.this,ArtistActivity.class);
                startActivity(artists3);
            }
        });

        //Create a new Intent to call the NowPlayingActivity from the PlaylistActivity.
        nowPlaying5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlaying5 = new Intent(PlaylistActivity.this,NowPlayingActivity.class);
                startActivity(nowPlaying5);
            }
        });

        //Create a button to call the description for the PlaylistActivity.
        Button displayDescription = (Button)findViewById(R.id.playlistDescription);
        final TextView playlistDescription =(TextView)findViewById(R.id.pDescription);

        displayDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playlistDescription.setText("This activity is designed to display the various playlist's the user has created while also giving the option to add and create new playlist's.");
            }
        });
    }
}
