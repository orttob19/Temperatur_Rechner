package com.example.a20211008logandtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG  = MainActivity.class.getSimpleName();

    private TextView tvLogInformation;
    private Button btShowToast;
    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLogInformation  = (TextView) findViewById(R.id.tvLogInformation);
        btShowToast = (Button) findViewById(R.id.btShowToast);

        btShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(view);
                counter++;
            }
        });

        tvLogInformation.append("\nTag = " + TAG);
        Log.d(TAG, "This is a log entry");

        Toast.makeText(getApplicationContext(), "This is my Breakfast Toast", Toast.LENGTH_SHORT).show();


    }

    private void showToast (View view){
        Toast.makeText(getApplicationContext(), "This is my Breakfast Toast " + counter, Toast.LENGTH_SHORT).show();
    }
}