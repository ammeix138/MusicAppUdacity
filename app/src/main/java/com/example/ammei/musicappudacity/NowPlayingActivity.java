package com.example.ammei.musicappudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView goHome5 = (TextView) findViewById(R.id.go_home5) ;
        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary5);
        TextView playlist_5 = (TextView) findViewById(R.id.playlists_5);
        TextView artist5 = (TextView) findViewById(R.id.artist_5);
        TextView download = (TextView)findViewById(R.id.music_download5);

        //Create a new Intent to call the MainActivity from the NowPlayingActivity.
        goHome5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHome5 = new Intent(NowPlayingActivity.this,MainActivity.class);
                startActivity(goHome5);

            }
        });

        //Create a new Intent to call the MusicActivity from the NowPlayingActivity.
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicLibrary = new Intent(NowPlayingActivity.this,MusicActivity.class);
                startActivity(musicLibrary);
            }
        });

        //Create a new Intent to call the PlaylistActivity from the NowPlayingActivity.
        playlist_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlist_5 = new Intent(NowPlayingActivity.this,PlaylistActivity.class);
                startActivity(playlist_5);
            }
        });

        //Create a new Intent to call the ArtistActivity from the NowPlayingActivity.
        artist5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artist5 = new Intent(NowPlayingActivity.this,ArtistActivity.class);
                startActivity(artist5);
            }
        });

        //Create a new Intent to call the Download Activity from the NowPlayingActivity.
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent download = new Intent(NowPlayingActivity.this,DownloadActivity.class);
                startActivity(download);
            }
        });

        //Create a button to call the description for the NowPlayingActivity.
        Button displayDescription = (Button)findViewById(R.id.nowPlayingDescription);
        final TextView nowPlayingDescription =(TextView)findViewById(R.id.playingDescription);

        displayDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nowPlayingDescription.setText("This activity is designed to display the song that is currently being played on your media device. The activity should also display an image of the album, the length of the song, and an option bar displaying a pause, play, stop, forward, and back button for the user to operate.");
            }
        });
    }
}
