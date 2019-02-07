package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText felt1;
    EditText felt2;
    TextView result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        felt1 = findViewById(R.id.tastA);
        felt2 = findViewById(R.id.tastB);
        result1 = findViewById(R.id.result);
    }

    public void plus(View view) {
        double result = Calculator.plus(Double.parseDouble(felt1.getText().toString()), Double.parseDouble(felt2.getText().toString()));
        result1.setText(String.valueOf(result));
    }

    public void minus(View view) {
        double result = Calculator.minus(Double.parseDouble(felt1.getText().toString()), Double.parseDouble(felt2.getText().toString()));
        result1.setText(String.valueOf(result));
    }

    public void gange(View view) {
        double result = Calculator.gange(Double.parseDouble(felt1.getText().toString()), Double.parseDouble(felt2.getText().toString()));
        result1.setText(String.valueOf(result));
    }

    public void divider(View view) {
        double result = Calculator.divider(Double.parseDouble(felt1.getText().toString()), Double.parseDouble(felt2.getText().toString()));
        result1.setText(String.valueOf(result));
    }

}
