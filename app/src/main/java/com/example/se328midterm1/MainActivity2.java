package com.example.se328midterm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button act2main= (Button) findViewById(R.id.act21b);

        act2main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2tos1= new Intent(MainActivity2.this,MainActivity.class);
                startActivity(s2tos1);
            }
        });
    }
}