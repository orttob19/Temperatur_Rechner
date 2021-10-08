package com.example.app24092021;

import static com.example.app24092021.R.id.btAbstract;
import static com.example.app24092021.R.id.fill;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btAbstract;
    private Button btInnerClass;
    private Button btClose;
    private TextView tvShow;

    private void ownClose(View view){
        finish();
    }

    public void fromXml(View view){
        tvShow.setText("Hello from XML");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAbstract = (Button) findViewById(R.id.btAbstract);
        btInnerClass = (Button) findViewById(R.id.btInnerClass);
        btClose = (Button) findViewById(R.id.btClose);
        tvShow = (TextView) findViewById(R.id.tvShow);

        btClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ownClose(view);
            }
        });

        btAbstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvShow.setText("Hello from Abstract");
            }
        });

        InnerClassListener innerClassListener = new InnerClassListener();
        btInnerClass.setOnClickListener(innerClassListener);
    }

    class InnerClassListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            tvShow.setText("Hello from InnerClass");
        }
    }
}