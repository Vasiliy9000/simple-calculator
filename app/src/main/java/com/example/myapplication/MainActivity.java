package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // find and save buttons
    Button ButtonPlus;
    Button ButtonMinus;
    Button ButtonMultiply;
    Button ButtonDivide;
    EditText el1;
    EditText el2;
    TextView resText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find view elements
        ButtonPlus = findViewById(R.id.ButtonPlus);
        ButtonMinus = findViewById(R.id.ButtonMinus);
        ButtonMultiply = findViewById(R.id.ButtonMultiply);
        ButtonDivide = findViewById(R.id.ButtonDivide);

        el1 = findViewById(R.id.FirstNumber);
        el2 = findViewById(R.id.SecondNumber);
        resText = findViewById(R.id.EqualsView);

        ButtonPlus.setOnClickListener(view -> {
            double num1 = Integer.parseInt(el1.getText().toString());
            double num2 = Integer.parseInt(el2.getText().toString());
            resText.setText(String.valueOf(num1 + num2));
        });
        ButtonMinus.setOnClickListener(view -> {
            double num1 = Integer.parseInt(el1.getText().toString());
            double num2 = Integer.parseInt(el2.getText().toString());
            resText.setText(String.valueOf(num1 - num2));
        });
        ButtonMultiply.setOnClickListener(view -> {
            double num1 = Integer.parseInt(el1.getText().toString());
            double num2 = Integer.parseInt(el2.getText().toString());
            resText.setText(String.valueOf(num1 * num2));
        });
        ButtonDivide.setOnClickListener(view -> {
            double num1 = Integer.parseInt(el1.getText().toString());
            double num2 = Integer.parseInt(el2.getText().toString());
            resText.setText(String.valueOf(num1 / num2));
        });
    }
}