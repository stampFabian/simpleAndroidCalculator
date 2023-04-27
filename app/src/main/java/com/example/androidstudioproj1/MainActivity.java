package com.example.androidstudioproj1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input;
    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";
    Button btn_numb0, btn_numb1, btn_numb2, btn_numb3, btn_numb4, btn_numb5, btn_numb6, btn_numb7, btn_numb8, btn_numb9, btn_plus, btn_minus, btn_multiply, btn_divide, btn_reset, btn_comma, btn_result, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logic(View view) {
        input = findViewById(R.id.input);
        btn_numb0 = findViewById(R.id.btn_numb0);
        btn_numb1 = findViewById(R.id.btn_numb1);
        btn_numb2 = findViewById(R.id.btn_numb2);
        btn_numb3 = findViewById(R.id.btn_numb3);
        btn_numb4 = findViewById(R.id.btn_numb4);
        btn_numb5 = findViewById(R.id.btn_numb5);
        btn_numb6 = findViewById(R.id.btn_numb6);
        btn_numb7 = findViewById(R.id.btn_numb7);
        btn_numb8 = findViewById(R.id.btn_numb8);
        btn_numb9 = findViewById(R.id.btn_numb9);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_reset = findViewById(R.id.btn_reset);
        btn_comma = findViewById(R.id.btn_comma);
        btn_result = findViewById(R.id.btn_result);
        btn_back = findViewById(R.id.btn_back);

        btn_numb0.setOnClickListener(v -> input.setText(input.getText() + "0"));

        btn_numb1.setOnClickListener(v -> input.setText(input.getText() + "1"));

        btn_numb2.setOnClickListener(v -> input.setText(input.getText() + "2"));

        btn_numb3.setOnClickListener(v -> input.setText(input.getText() + "3"));

        btn_numb4.setOnClickListener(v -> input.setText(input.getText() + "4"));

        btn_numb5.setOnClickListener(v -> input.setText(input.getText() + "5"));

        btn_numb6.setOnClickListener(v -> input.setText(input.getText() + "6"));

        btn_numb7.setOnClickListener(v -> input.setText(input.getText() + "7"));

        btn_numb8.setOnClickListener(v -> input.setText(input.getText() + "8"));

        btn_numb9.setOnClickListener(v -> input.setText(input.getText() + "9"));

        btn_plus.setOnClickListener(v -> {
            num1 = Double.parseDouble(input.getText() + "");
            operator = "+";
            input.setText(null);
        });

        btn_minus.setOnClickListener(v -> {
            num1 = Double.parseDouble(input.getText() + "");
            operator = "-";
            input.setText(null);
        });

        btn_multiply.setOnClickListener(v -> {
            num1 = Double.parseDouble(input.getText() + "");
            operator = "*";
            input.setText(null);
        });

        btn_divide.setOnClickListener(v -> {
            num1 = Double.parseDouble(input.getText() + "");
            operator = "/";
            input.setText(null);
        });

        btn_comma.setOnClickListener(v -> input.setText(input.getText() + "."));

        btn_reset.setOnClickListener(v -> input.setText(""));

        btn_back.setOnClickListener(v -> {
            String str = input.getText().toString();
            if (str.length() > 0) {
                str = str.substring(0, str.length() - 1);
                input.setText(str);
            }
        });

        btn_result.setOnClickListener(v -> {
            num2 = Double.parseDouble(input.getText() + "");
            switch (operator) {
                case "+":
                    input.setText(num1 + num2 + "");
                    break;
                case "-":
                    input.setText(num1 - num2 + "");
                    break;
                case "*":
                    input.setText(num1 * num2 + "");
                    break;
                case "/":
                    input.setText(num1 / num2 + "");
                    break;
            }
        });
    }
}