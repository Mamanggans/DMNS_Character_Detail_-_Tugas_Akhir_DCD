package com.example.adicodingsub;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

public class splash_adapter  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.splash_activity);

        super.onCreate(savedInstanceState);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L);
    }
}
