package com.example.timeselection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.BtnAnalogClock);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnalogClock analog = new AnalogClock(MainActivity.this);
                ((LinearLayout)findViewById(R.id.myLayout)).addView(analog);
            }
        });
        Button b2 = (Button)findViewById(R.id.btnChrometer);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Chronometer cro = new Chronometer(MainActivity.this);
                ((LinearLayout)findViewById(R.id.myLayout)).addView(cro);
            }
        });
    }
}
