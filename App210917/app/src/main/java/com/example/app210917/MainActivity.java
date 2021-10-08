package com.example.app210917;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvMessage;
    private EditText edName;
    private Button btFinish;
    private Button btExit;
    private Button btReset;
    private TextView tvHeader;
    private TextView name;

    private Button btInnerClass;
    private Button btOtherInnerClass;


    private void onMyOwnClick(View view){
        tvMessage.setText(view.toString());
    }

    public void onClickFromXml(View view){
        tvMessage.setText("Hello - this is from XML");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the object
        tvMessage = (TextView) findViewById(R.id.tvHeader);
        edName = (EditText) findViewById(R.id.edName);
        btFinish = (Button) findViewById(R.id.btContinue);
        btExit = (Button) findViewById(R.id.btExit);
        btReset = (Button) findViewById(R.id.btReset);
        tvHeader = (TextView) findViewById(R.id.tvHeader);
        name = (TextView) findViewById(R.id.name);
        btInnerClass = (Button) findViewById(R.id.btInnerClass);
        btOtherInnerClass = (Button) findViewById(R.id.btOtherInnerClass);

        btReset.setText(getString(R.string.reset));


        //disable button
        btFinish.setEnabled(false);
        tvMessage.setEnabled(false);
        btFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //tvMessage.setText(view.toString());
                //toggle switch
                tvMessage.setEnabled(!tvMessage.isEnabled());
                tvMessage.setText(getString(R.string.hello_msg, edName.getText()));
            }
        });

        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onMyOwnClick(view);
                //finish();
            }
        });

        /*btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMessage.setText(getString(R.string.str_reset));
                edName.setText(getString(R.string.str_reset));
                tvHeader.setText(getString(R.string.str_reset));
                name.setText(getString(R.string.str_reset));
                btFinish.setEnabled(true);
            }
        });*/

        edName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tvMessage.setText("Textwatcher " + editable);

                btFinish.setEnabled(editable.length() > 0);
            }
        });

        InnerClassListener innerClassListener = new InnerClassListener();
        btInnerClass.setOnClickListener(innerClassListener);

        btOtherInnerClass.setOnClickListener(innerClassListener);
    }
    class InnerClassListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            tvMessage.setText("Greetings from InnerClassListener");
        }
    }
}