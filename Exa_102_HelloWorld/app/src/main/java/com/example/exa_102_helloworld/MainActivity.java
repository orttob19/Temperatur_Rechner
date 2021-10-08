package com.example.exa_102_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvHello;
    private EditText etName;
    private Button btContinue;
    private Button btFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = (TextView) findViewById(R.id.tvHello);
        etName = (EditText) findViewById(R.id.etName);
        btContinue = (Button) findViewById(R.id.btContinue);
        btFinish = (Button) findViewById(R.id.btFinish);

        btFinish.setVisibility(View.INVISIBLE);
        btContinue.setEnabled(false);

        etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                btContinue.setEnabled(editable.length() > 0);
            }
        });

        btContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHello.setText("Hello " + etName.getText() + " - nice to meet you");
                btFinish.setVisibility(View.VISIBLE);
                btContinue.setVisibility(View.INVISIBLE);
                etName.setVisibility(View.INVISIBLE);
            }
        });

        OnclickFinish onclickFinish = new OnclickFinish();
        btFinish.setOnClickListener(onclickFinish);

    }

    class OnclickFinish implements View.OnClickListener{
        @Override
            public void onClick(View view){
            finish();
        }
    }
}