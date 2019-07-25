package com.example.david.smartcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class equationSolver extends AppCompatActivity {
    private double a_value;

    private double b_value;
    private double c_value;
    EditText editTextA;
    EditText editTextB;
    EditText editTextC;
    TextView x1TextView;
    TextView x2TextView;
    Button button_scientific_in_equationSolver, button_standard_in_equationSolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation_solver);


        button_scientific_in_equationSolver = (Button) findViewById(R.id.button_scientific_in_equationSolver);
        button_standard_in_equationSolver = (Button) findViewById(R.id.button_standard_in_equationSolver);

        x1TextView = findViewById(R.id.x1_value_textView);
        x2TextView = findViewById(R.id.x2_value_textView);

        editTextA = findViewById(R.id.a_ValueEditText);

        button_scientific_in_equationSolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScientificActivity();
            }
        });

        button_standard_in_equationSolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStandardActivity();
            }
        });
        editTextA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() != 0)
                    a_value = Double.parseDouble(editable.toString());
                else {
                    a_value = 0;
                }
                setNewValues();
            }
        });


        editTextB = findViewById(R.id.b_ValueEditText);

        editTextB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() != 0)
                    b_value = Double.parseDouble(editable.toString());
                else {
                    b_value = 0;
                }
                setNewValues();

            }
        });

        editTextC = findViewById(R.id.c_ValueEditText);
        editTextC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() != 0) {
                    c_value = Double.parseDouble(editable.toString());
                }
                else {
                    c_value = 0;
                }
                setNewValues();

            }
        });
    }
    private void openStandardActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openScientificActivity() {
        Intent intent = new Intent(this, scientific.class);
        startActivity(intent);
    }

    private void setNewValues() {
        double determinant = Math.pow(b_value,2) - 4*a_value*c_value;
        String x1 , x2;
        if(determinant > 0){
            double temp1 = -b_value/(2*a_value);
            double temp2 = Math.sqrt(determinant)/(2*a_value);
            x1 = String.valueOf((temp1+temp2));
            x2 = String.valueOf(temp1-temp2);
        }else if (determinant == 0){
            x1 = String.valueOf(-b_value/(2*a_value));
            x2 = x1;

        }
        else{
            x1 =  -b_value/(2*a_value) + "+i" +
                    Math.sqrt(-determinant)/(2*a_value)  ;

            x2 = -b_value/(2*a_value) + "-i" + Math.sqrt(-determinant)/(2*a_value);
        }

        x1TextView.setText(x1);
        x2TextView.setText(x2);

    }




}
