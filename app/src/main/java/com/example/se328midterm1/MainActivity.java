package com.example.se328midterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer catmp3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button act12 = (Button) findViewById(R.id.act12);
        final Button act13= (Button) findViewById(R.id.act13);

        act12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });

        act13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity3.class));
            }
        });

        final ImageView pic= (ImageView) findViewById(R.id.ivCat);

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catmp3= MediaPlayer.create(MainActivity.this,R.raw.mothercat);
                catmp3.start();
            }
        });
    }
}