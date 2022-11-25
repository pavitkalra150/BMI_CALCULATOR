package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText weight;
    private EditText height;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        calculate = findViewById(R.id.calculate);

    }

    public void calculateBMI(View view){
        String w = weight.getText().toString();
        String h = height.getText().toString();
        double bmi;
        String finalValue1;
        Double weightValue = Double.valueOf(w).doubleValue();
        Double heightValue = Double.valueOf(h).doubleValue();

        bmi = weightValue / (heightValue * heightValue);
        finalValue1 = Double.toString(bmi);

        Toast.makeText(this, "Your BMI IS : " + finalValue1, Toast.LENGTH_SHORT).show();


    }
}