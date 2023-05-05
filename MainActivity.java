package com.example.mix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText i;
    CheckBox c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=findViewById(R.id.Info);
        c=findViewById(R.id.checkBox);

        c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(c.isChecked()){
                    String s = i.getText().toString();
                    Intent i = new Intent(MainActivity.this,Display.class);
                    i.putExtra("info",s);
                    startActivity(i);
                }
            }
        });
    }
}