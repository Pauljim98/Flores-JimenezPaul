package com.example.examen01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.math.BigInteger;

public class resta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);


        final EditText editTextNumber1 = findViewById(R.id.editTextNumber1);
        final EditText editTextNumber2 = findViewById(R.id.editTextNumber2);
        final Button btnSum = findViewById(R.id.btnSubtract);
        final TextView textViewResult = findViewById(R.id.textViewResult);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = editTextNumber1.getText().toString();
                String num2Str = editTextNumber2.getText().toString();

                if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                    BigInteger num1 = new BigInteger(num1Str);
                    BigInteger num2 = new BigInteger(num2Str);

                    StringBuilder steps = new StringBuilder();


                    BigInteger maxNum = num1.max(num2);
                    int lineLength = maxNum.toString().length() * 2;


                    steps.append("Suma:\n").append(num1).append("\n").append("-").append(num2).append("\n");
                    for (int i = 0; i < lineLength; i++) {
                        steps.append("-");
                    }
                    steps.append("\n");


                    BigInteger result = num1.add(num2);


                    steps.append(result);
                    textViewResult.setText(steps.toString());
                } else {
                    textViewResult.setText("Ingresa ambos números");
                }
            }
        });


        Button botonVolverAActivity1 = findViewById(R.id.btnReturnt);

        botonVolverAActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(resta.this, MainActivity.class);

                startActivity(intent);

                finish();
            }
        });

    }
}