package com.example.pcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText edtEnterPercent, edtEnterNumber;
    private Button btnCalculate;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEnterNumber = findViewById(R.id.edtEnterNumber);
        edtEnterPercent = findViewById(R.id.edtEnterPercent);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = Double.parseDouble(edtEnterNumber.getText().toString()) * (Double.parseDouble(edtEnterPercent.getText().toString()) / 100);
                txtResult.setText(String.format("%f", result));

            }
        });

    }


}
