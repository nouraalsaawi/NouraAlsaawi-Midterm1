package com.example.se328midterm1;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Picture1 extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture1);

        mp = new MediaPlayer();
        mp = MediaPlayer.create(this, R.raw.mothercat);
        mp.start();
    }
}
