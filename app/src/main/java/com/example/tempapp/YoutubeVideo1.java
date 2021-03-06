package com.example.tempapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeVideo1 extends YouTubeBaseActivity {
    YouTubePlayerView youtubeView;
    YouTubePlayer.OnInitializedListener listener;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_video1);

        button =  findViewById(R.id.button1);
        youtubeView = findViewById(R.id.youtubeView1);
        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("24zf7viOpCE");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                youtubeView.initialize("AIzaSyCB20nzbM1b-9LX-LIJUOUlbieAD29ZA1U", listener);
            }
        });
    }
}
