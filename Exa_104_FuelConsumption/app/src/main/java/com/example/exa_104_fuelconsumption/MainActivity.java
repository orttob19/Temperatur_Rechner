package com.example.exa_104_fuelconsumption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvOutput;
    private EditText edFuel, edDistance;
    private Button btCalculate;
    private boolean illegalInput = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput = (TextView) findViewById(R.id.tvOutput);
        edFuel = (EditText) findViewById(R.id.edFuel);
        edDistance = (EditText) findViewById(R.id.edDistance);
        btCalculate = (Button) findViewById(R.id.btCalculate);

        OnClickListener onClickListener = new OnClickListener();
        btCalculate.setOnClickListener(onClickListener);
    }

    private float getFloat(EditText ed){
        float value = 0;
        try {
            String text = String.valueOf(ed.getText());
             value = Float.parseFloat(text);
        }catch (NumberFormatException ex){
            Toast.makeText(getApplicationContext(), "Illegal input", Toast.LENGTH_SHORT).show();
            tvOutput.setText("Illegal input");
            illegalInput = true;
        }
        return value;
    }

    public void onCalcConsumption(){
        float fuel = getFloat(edFuel);
        float distance = getFloat(edDistance);
        if(illegalInput){
            tvOutput.setText("Illegal input");
        }else{
            float consumption = fuel / distance * 100;
            tvOutput.setText("Consumption per 100km: " + consumption + " liter");
        }
        illegalInput = false;
    }

    class OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            onCalcConsumption();
        }
    }
}