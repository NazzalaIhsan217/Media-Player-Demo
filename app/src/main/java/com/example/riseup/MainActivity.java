package com.example.riseup;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.btnplay);

        stop = findViewById(R.id.btnstop);

        final MediaPlayer startsong = MediaPlayer.create(this,R.raw.riseup);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startsong.start();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startsong.stop();
            }
        });
    }
}
