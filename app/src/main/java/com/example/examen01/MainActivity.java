package com.example.examen01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonIrAActivity1 = findViewById(R.id.btnSum);

        botonIrAActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, Sumar.class);

                startActivity(intent);
            }
        });

        Button botonIrAActivity2 = findViewById(R.id.btnSubtract);

        botonIrAActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, resta.class);

                startActivity(intent);
            }
        });

    }
}