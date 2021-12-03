package com.agesadev.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    Button add, minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);

        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = firstNumber.getText().toString();
                String b = secondNumber.getText().toString();
                int sum = 0;
                int first, second;
                first = Integer.parseInt(a);
                second = Integer.parseInt(b);
                sum = first + second;
                Toast.makeText(getApplicationContext(), "The sum is " + sum, Toast.LENGTH_SHORT).show();

            }


        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = firstNumber.getText().toString();
                String b = secondNumber.getText().toString();
                int difference = 0;
                int first, second;
                first = Integer.parseInt(a);
                second = Integer.parseInt(b);
                difference = first - second;
                Toast.makeText(getApplicationContext(), "The difference is " + difference, Toast.LENGTH_SHORT).show();

            }


        });
    }
}