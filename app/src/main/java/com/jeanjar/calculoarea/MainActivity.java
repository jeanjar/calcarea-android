package com.jeanjar.calculoarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button buttonCalcular;
    private EditText textBase;
    private EditText textAltura;
    private EditText textArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonCalcular = (Button) findViewById(R.id.buttonCalcular);
        this.textBase = (EditText) findViewById(R.id.editTextBase);
        this.textAltura = (EditText) findViewById(R.id.editTextAltura);
        this.textArea = (EditText) findViewById(R.id.editTextArea);


        buttonCalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                double area = (Double.parseDouble(textBase.getText().toString()) * Double.parseDouble(textAltura.getText().toString())) / 2;
                textArea.setText(String.format(Locale.ROOT, "%.2f", area));
            }
        });
    }
}
