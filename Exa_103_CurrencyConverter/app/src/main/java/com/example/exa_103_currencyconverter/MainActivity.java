package com.example.exa_103_currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView tvTop, tvCurrency1, tvCurrency2, tvOutput;
    private ImageButton btSwap;
    private EditText edInput;
    private boolean eurInUsd = true;
    private float currency1Val = 1.0f, currency2Val = 0.0f;
    private Switch sNewCourse;
    private EditText enNewCourse;
    private boolean newCourse = false;
    private float course = 1.16f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTop = (TextView)findViewById(R.id.tvTop);
        tvCurrency1 = (TextView)findViewById(R.id.tvCurrency1);
        tvCurrency2 = (TextView)findViewById(R.id.tvCurrency2);
        tvOutput = (TextView)findViewById(R.id.tvOutput);
        btSwap = (ImageButton) findViewById(R.id.btSwap);
        edInput = (EditText) findViewById(R.id.edInput);
        sNewCourse = (Switch) findViewById(R.id.sNewCourse);
        enNewCourse = (EditText) findViewById(R.id.enNewCourse);

        convertAndUpdate();
        enNewCourse.setEnabled(false);
        enNewCourse.setHint("1.16");

        edInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                float input = 1.0f;
                if (editable.length() > 0) {
                    try {
                        input = getFloat(edInput);
                    }catch (NumberFormatException ex) {
                        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.Error_1), Toast.LENGTH_SHORT);
                        toast.show();
                        input = 0.0f;
                    }
                }
                currency1Val = input;
                convertAndUpdate();
            }
        });

        btSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(eurInUsd){
                    tvCurrency1.setText(getString(R.string.USD));
                    tvCurrency2.setText(getString(R.string.EUR));

                }else{
                    tvCurrency1.setText(getString(R.string.EUR));
                    tvCurrency2.setText(getString(R.string.USD));
                }
                eurInUsd = !eurInUsd;

                convertAndUpdate();
            }
        });


        sNewCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newCourse) {
                    enNewCourse.setEnabled(false);
                    newCourse = false;
                }else{
                    enNewCourse.setEnabled(true);
                    newCourse = true;
                }
            }
        });

        enNewCourse.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                convertAndUpdate();
            }
        });
    }

    public float getFloat(EditText edInput){
        String text = String.valueOf(edInput.getText());
        float value = Float.parseFloat(text);
        return value;
    }

    public void convertAndUpdate(){
        rightCurrency();
        if(eurInUsd) {
            currency2Val = currency1Val * course;
            String text = "";
            text = String.format("€ %.2f are $ %.2f", currency1Val, currency2Val);
            tvOutput.setText(text);
        }else{
            currency2Val = currency1Val * course;
            String text = "";
            text = String.format("$ %.2f are € %.2f", currency1Val, currency2Val);
            tvOutput.setText(text);
        }
        setHint();
    }

    public void setHint(){
        if(eurInUsd){
            edInput.setHint(getString(R.string.EUR_1));
        }else{
            edInput.setHint(getString(R.string.USD_1));
        }
    }

    public void rightCurrency(){
        if(eurInUsd){
            enNewCourse.setHint("1.16");
            course = 1.16f;
        }else{
            enNewCourse.setHint("0.86");
            course = 0.86f;

        }
        if(enNewCourse.length() != 0){
            course = getFloat(enNewCourse);
        }
    }
}