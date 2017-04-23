package com.wordpress.sreeharilive.musicplay;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button play,pause,stop;
    MediaPlayer mdx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(Button)findViewById(R.id.playid);
        pause=(Button)findViewById(R.id.pauseid);
        stop=(Button)findViewById(R.id.stopid);
        mdx=MediaPlayer.create(MainActivity.this,R.raw.virus);

    }
    public void plays(View v)
    {
        mdx.start();
    }
    public void pauses(View v)
    {
        mdx.pause();
    }
    public void stops(View v)
    {
        mdx.stop();
        mdx=MediaPlayer.create(MainActivity.this,R.raw.virus);

    }

}

