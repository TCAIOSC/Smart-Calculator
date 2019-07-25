package com.example.david.smartcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Set;


public class MainActivity extends AppCompatActivity {
    double input1 = 0, input2 = 0;
    private TextView result;
    private TextView workSpace;
    boolean Addition, Subtract, Multiplication, Division, decimal, Equal;
    Button buttonScientific, buttonEquationSolver, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDivision, buttonEqual, buttonDel;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonScientific = (Button) findViewById(R.id.buttonScientific);
        buttonEquationSolver = (Button) findViewById(R.id.buttonEquationSolver);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        buttonAdd = (Button) findViewById(R.id.buttonPlus);
        buttonSub = (Button) findViewById(R.id.buttonMinus);
        buttonMul = (Button) findViewById(R.id.buttonMultiply);
        buttonDivision = (Button) findViewById(R.id.buttonDivide);
        buttonDel = (Button) findViewById(R.id.buttonClear);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);

        result = (TextView) findViewById(R.id.result);
        workSpace = (TextView) findViewById(R.id.workSpace);

        buttonScientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScientificActivity();
            }
        });

        buttonEquationSolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEquationSolverActivity();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal){
                    Equal = false;
                    result.setText("");
                    workSpace.setText("");
                }
                result.setText(result.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0) {
                    input1 = Double.parseDouble(result.getText() + "");
                    Addition = true;
                    decimal = false;
                    workSpace.setText(result.getText() + "+");
                    result.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0) {
                    input1 = Double.parseDouble(result.getText() + "");
                    Subtract = true;
                    decimal = false;
                    workSpace.setText(result.getText() + "-");
                    result.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0) {
                    input1 = Double.parseDouble(result.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    workSpace.setText(result.getText() + "*");
                    result.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().length() != 0) {
                    input1 = Double.parseDouble(result.getText() + "");
                    Division = true;
                    decimal = false;
                    workSpace.setText(result.getText() + "/");
                    result.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Equal = true;
                if (Addition || Subtract || Multiplication || Division) {
                    input2 = Double.parseDouble(result.getText() + "");
                    workSpace.setText(result.getText() + "=");
                }

                if (Addition) {

                    result.setText(String.valueOf(input1 + input2));
                    Addition = false;
                }

                if (Subtract) {

                    result.setText(String.valueOf(input1 - input2));
                    Subtract = false;
                }

                if (Multiplication) {
                    result.setText(String.valueOf(input1 * input2));
                    Multiplication = false;
                }

                if (Division) {
                    result.setText(String.valueOf(input1 / input2));
                    Division = false;
                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                workSpace.setText("");
                result.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

    }

    private void openEquationSolverActivity() {
        Intent intent = new Intent(this, equationSolver.class);
        startActivity(intent);
    }

    private void openScientificActivity() {
        Intent intent = new Intent(this, scientific.class);
        startActivity(intent);
    }
}



