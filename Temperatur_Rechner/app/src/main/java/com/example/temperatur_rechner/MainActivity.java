package com.example.temperatur_rechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public float ctoK(float temp){
        temp += 273.15f;
        return temp;
    }

    public float ctoF(float temp){
        float fahrenheit = (temp * 9/5) + 32;
        return fahrenheit;
    }
}