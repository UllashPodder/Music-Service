package com.example.musicservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.musicservice.Services.MyMusicService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button startButton, stopButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = findViewById(R.id.button_start);
        startButton.setOnClickListener(this);
        stopButton = findViewById(R.id.button_stop);
        stopButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==startButton){
            startService(new Intent(this, MyMusicService.class));
        }
        else if (view==stopButton){
            stopService(new Intent(this, MyMusicService.class));
        }
    }
}