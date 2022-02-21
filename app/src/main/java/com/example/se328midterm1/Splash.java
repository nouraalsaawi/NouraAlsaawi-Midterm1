package com.example.se328midterm1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final TextView count= (TextView) findViewById(R.id.counter);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Splash.this, MainActivity.class));
            }
        };
        Timer opening=new Timer();
        opening.schedule(task, 9000);

        new CountDownTimer(9000, 1000) {

            public void onTick(long millisUntilFinished) {
                count.setText("seconds remaining: " + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                count.setText("done!");
            }

        }.start();
    }
}