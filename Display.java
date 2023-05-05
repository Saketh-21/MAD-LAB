package com.example.mix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        t = findViewById(R.id.textView);

        Intent i = getIntent();
        String s = i.getStringExtra("info");
        t.setText(s);
    }
}