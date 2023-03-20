package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumber;
    private EditText secondNumber;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        display = findViewById(R.id.display);

    }

    public void add(View view) {
        int intFirstNum = Integer.parseInt(firstNumber.getText().toString());
        int intSecondNum = Integer.parseInt(secondNumber.getText().toString());

        int sum = intFirstNum + intSecondNum;

        display.setText(Integer.toString(sum));
    }

    public void subtract(View view) {
        int intFirstNum = Integer.parseInt(firstNumber.getText().toString());
        int intSecondNum = Integer.parseInt(secondNumber.getText().toString());

        int difference = intFirstNum - intSecondNum;

        display.setText(Integer.toString(difference));
    }

    public void multiply(View view) {
        int intFirstNum = Integer.parseInt(firstNumber.getText().toString());
        int intSecondNum = Integer.parseInt(secondNumber.getText().toString());

        int product = intFirstNum * intSecondNum;

        display.setText(Integer.toString(product));
    }

    public void division(View view) {
        float intFirstNum = Float.parseFloat(firstNumber.getText().toString());
        float intSecondNum = Float.parseFloat(secondNumber.getText().toString());

        float divided = intFirstNum / intSecondNum;

        display.setText(Float.toString(divided));
    }
}