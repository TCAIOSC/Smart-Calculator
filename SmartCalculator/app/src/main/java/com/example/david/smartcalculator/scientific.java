package com.example.david.smartcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class scientific extends AppCompatActivity {

    TextView result_scientific;
    float mValueOne , mValueTwo ;
    double a;
    double ans=0;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision,mReminder ,
            mNoPower,istpower2ndno,mSin,mArithmetic,mCos,mTan,mSinH,mCosH,mTanH;
    boolean piecheck=false;
    Button  button_standard, button_equationSolver, clearbutton, dividebutton, multiplybutton, deletebutton, button07, button08, button09, minusbutton,
            button04, button05, button06, buttonAdd, button01, button02, button03, button00, pointbutton,
            button_equal, xcubebutton, squarebutton, xfactorialbutton, logbutton, exponentbutton, lnbutton, sinbutton,
            cosbutton, tanbutton, oneoverxbutton, sinhbutton, coshbutton, tanhbutton,tenexponent,
            piebutton, squarerootbutton, cuberootbutton, modulosbutton, epowerbtn, stpower2nd,
            ansbuttton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific);

        button_standard = findViewById(R.id.button_standard);
        button_equationSolver = (Button) findViewById(R.id.button_equationSolver);
        result_scientific=(TextView) findViewById(R.id.result_scientific);
        clearbutton=(Button) findViewById(R.id.clearrbtn);
        dividebutton=(Button) findViewById(R.id.button_divide);
        multiplybutton=(Button) findViewById(R.id.button_multiply);
        deletebutton=(Button) findViewById(R.id.deletebtn);
        button07=(Button) findViewById(R.id.button07);
        button08=(Button) findViewById(R.id.button08);
        button09=(Button) findViewById(R.id.button09);
        minusbutton=(Button) findViewById(R.id.button_minus);
        button04=(Button) findViewById(R.id.button04);
        button05=(Button) findViewById(R.id.button05);
        button06=(Button) findViewById(R.id.button06);
        buttonAdd=(Button) findViewById(R.id.button_plus);
        button01=(Button) findViewById(R.id.button01);
        button02=(Button) findViewById(R.id.button02);
        button03=(Button) findViewById(R.id.button03);
        button00=(Button) findViewById(R.id.button00);
        pointbutton=(Button) findViewById(R.id.buttonDot);
        button_equal=(Button) findViewById(R.id.button_equal);
        squarebutton=(Button) findViewById(R.id.squarebtn);
        xcubebutton=(Button) findViewById(R.id.xcubebtn);
        oneoverxbutton=(Button) findViewById(R.id.onedividebtn);
        exponentbutton=(Button) findViewById(R.id.expbtn);
        logbutton=(Button) findViewById(R.id.logbtn);
        squarerootbutton=(Button) findViewById(R.id.squarerootbtn);
        xfactorialbutton=(Button) findViewById(R.id.xfactorialbtn);
        sinbutton=(Button) findViewById(R.id.sinbtn);
        cosbutton=(Button) findViewById(R.id.cosbtn);
        tanbutton=(Button)findViewById(R.id.tanbtn);
        sinhbutton=(Button)findViewById(R.id.sinhbtn);
        coshbutton=(Button)findViewById(R.id.coshbtn);
        tanhbutton=(Button)findViewById(R.id.tanhbtn);
        lnbutton=(Button) findViewById(R.id.lnbtn) ;
        ansbuttton=(Button) findViewById(R.id.ansbtn);
        piebutton=(Button) findViewById(R.id.piebtn);
        deletebutton=(Button) findViewById(R.id.deletebtn);
        tenexponent=(Button) findViewById(R.id.tenexponent) ;
        cuberootbutton=(Button)findViewById(R.id.cuberootbtn);
        modulosbutton=(Button)findViewById(R.id.modulousbtn);
        epowerbtn=(Button) findViewById(R.id.epowerbtn);
        stpower2nd=(Button) findViewById(R.id.istpower2nd);

        button_standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        button_equationSolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEquationSolverActivity();
            }
        });
        stpower2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mValueOne = Float.parseFloat(result_scientific.getText() + "");
                istpower2ndno = true;
                result_scientific.setText(null);

            }
        });
        epowerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double n= Double.parseDouble(result_scientific.getText()+ "");
                Double exp = Math.pow(2.718281828, n);
                result_scientific.setText(String.valueOf(exp));

            }
        });

        modulosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(result_scientific.getText() + "");
                mReminder = true;
                result_scientific.setText(null);

            }
        });
        cuberootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a = Math.cbrt(Double.parseDouble(result_scientific.getText() + ""));
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText()+ "" + a);
            }
        });
        tenexponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n= Integer.parseInt(result_scientific.getText()+ "");
                Double exp = Math.pow(10, n);
                result_scientific.setText(String.valueOf(exp));
            }
        });
        deletebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str;
                str = result_scientific.getText()+ "";
                str = str.substring(0, str.length() - 1);
                result_scientific.setText(str);
            }
        });
        piebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(result_scientific.getText() + "" !=null) {
                //     a=Double.parseDouble(result_scientific.getText() + "" ) +Math.PI;
                //     result_scientific.setText("" +a );
                //  }
                //    else {
                result_scientific.setText(Math.PI + "");
                //    }
            }
        });
        lnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a = Double.parseDouble(result_scientific.getText()+ "");
                double answer = (-Math.log(1-a))/a;
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText()+ ""+ answer);

            }
        });
        tanhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a = Math.tanh(Double.parseDouble(result_scientific.getText()+ ""));
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText()+ "" + a);

                result_scientific.setText("tanh");
                mTanH=true;
            }
        });
        coshbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result_scientific.setText("cosh");
                mCosH=true;
            }
        });
        sinhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result_scientific.setText("sinh");
                mSinH=true;

            }
        });
        sinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_scientific.setText("sin");
                mSin=true;
            }
        });
        cosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result_scientific.setText("cos");
                mCos=true;
            }
        });
        tanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result_scientific.setText("tan");
                mTan=true;
            }
        });
        xfactorialbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a = Double.parseDouble(result_scientific.getText() + "" );
                int er = 0;
                double i, s = 1;
                if (a< 0) {
                    er = 20;
                }
                else {

                    for (i = 2; i <= a; i += 1.0)
                        s *= i;
                }
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText() + ""  + s);
            }
        });

        squarerootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Math.sqrt(Double.parseDouble(result_scientific.getText() + "" ));
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText() + ""  + a);

            }
        });

        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a = Math.log(Double.parseDouble(result_scientific.getText() + "" ));
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText() + ""  + a);

            }
        });
        exponentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a = Math.exp(Double.parseDouble(result_scientific.getText() + "" ));
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText() + ""  + a);
            }
        });
        oneoverxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 1 / Double.parseDouble(result_scientific.getText() + "" );
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText() + ""  + a);

            }
        });
        squarebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                a = Math.pow(Double.parseDouble(result_scientific.getText() + "" ), 2);
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText()+ String.valueOf(a));
            }
        });
        xcubebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Math.pow(Double.parseDouble(result_scientific.getText() + "" ), 3);
                result_scientific.setText("");
                result_scientific.setText(result_scientific.getText() + ""  + a);
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_scientific.setText("");
            }
        });
        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_scientific.setText(null);
            }
        });

        //////////////
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"1");

                mArithmetic=true;
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"2");
                mArithmetic=true;
            }
        });

        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"3");
                mArithmetic=true;
            }
        });

        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"4");
                mArithmetic=true;
            }
        });

        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"5");
                mArithmetic=true;
            }
        });

        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"6");
                mArithmetic=true;
            }
        });

        button07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"7");
                mArithmetic=true;
            }
        });

        button08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"8");
                mArithmetic=true;
            }
        });

        button09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"9");
                mArithmetic=true;
            }
        });

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+"0");
                mArithmetic=true;
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(result_scientific.getText() + "");
                mAddition = true;
                result_scientific.setText(null);
            }
        });

        minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(result_scientific.getText() + "");
                mSubtract = true;
                result_scientific.setText(null);
            }
        });

        multiplybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(result_scientific.getText() + "");
                mMultiplication = true;
                result_scientific.setText(null);
            }
        });

        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(result_scientific.getText() + "");
                mDivision = true;
                result_scientific.setText(null);

            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                if(mSin==true){
                    if(mArithmetic==true){
                        String str;
                        str=result_scientific.getText() + "" ;
                        str=str.substring(3);
                        a=Math.sin(Double.parseDouble(str));
                        result_scientific.setText(String.valueOf(a));
                        mArithmetic=false;
                        mSin=false;
                    }

                }
                if(mCos==true){
                    if(mArithmetic==true){
                        String str;
                        str=result_scientific.getText() + "" ;
                        str=str.substring(3);
                        a=Math.cos(Double.parseDouble(str));
                        result_scientific.setText(String.valueOf(a));
                        mArithmetic=false;
                        mCos=false;
                    }
                }
                if(mTan==true){
                    if(mArithmetic==true){
                        String str;
                        str=result_scientific.getText() + "" ;
                        str=str.substring(3);
                        a=Math.sin(Double.parseDouble(str));
                        result_scientific.setText(String.valueOf(a));
                        mArithmetic=false;
                        mTan=false;
                    }
                }
                if(mSinH==true){
                    if(mArithmetic==true){
                        String str;
                        str=result_scientific.getText() + "" ;
                        str=str.substring(4);
                        a=Math.sinh(Double.parseDouble(str));
                        result_scientific.setText(String.valueOf(a));
                        mArithmetic=false;
                        mSinH=false;
                    }

                }
                if(mCosH==true){
                    if(mArithmetic==true){
                        String str;
                        str=result_scientific.getText() + "" ;
                        str=str.substring(4);
                        a=Math.cosh(Double.parseDouble(str));
                        result_scientific.setText(String.valueOf(a));
                        mArithmetic=false;
                        mCosH=false;
                    }

                }
                if(mTanH==true){
                    if(mArithmetic==true){
                        String str;
                        str=result_scientific.getText() + "" ;
                        str=str.substring(4);
                        a=Math.cosh(Double.parseDouble(str));
                        result_scientific.setText(String.valueOf(a));
                        mArithmetic=false;
                        mTanH=false;
                    }
                }
                if (istpower2ndno == true){
                    mValueTwo = Float.parseFloat(result_scientific.getText() + "");
                    int exp = (int) Math.pow(mValueOne, mValueTwo);
                    result_scientific.setText(String.valueOf(exp));
                    istpower2ndno=false;
                }
                if (mAddition == true){
                    mValueTwo = Float.parseFloat(result_scientific.getText() + "");
                    result_scientific.setText(String.valueOf(mValueOne+mValueTwo));
                    mAddition=false;
                }
                if (mReminder == true){
                    mValueTwo = Float.parseFloat(result_scientific.getText() + "");
                    // result_scientific.setText(String.valueOf(mValueOne % mValueTwo ));
                    result_scientific.setText(""); //todo :reminder of float in swift is different
                    mReminder=false;
                }
                if(mNoPower==true) {
                    mValueTwo = Float.parseFloat(result_scientific.getText() + "");
                    int exp = (int) Math.pow(mValueOne, mValueTwo);
                    result_scientific.setText(String.valueOf(exp));
                    mNoPower=false;
                }

                if (mSubtract == true){
                    mValueTwo = Float.parseFloat(result_scientific.getText() + "");
                    result_scientific.setText(String.valueOf(mValueOne - mValueTwo));
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    mValueTwo = Float.parseFloat(result_scientific.getText() + "");
                    result_scientific.setText(String.valueOf(mValueOne * mValueTwo));
                    mMultiplication=false;
                }

                if (mDivision == true){
                    mValueTwo = Float.parseFloat(result_scientific.getText() + "");
                    result_scientific.setText(String.valueOf(mValueOne / mValueTwo));
                    mDivision=false;
                }
                ans=Double.parseDouble(result_scientific.getText() + "" );
            }
        });

        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(null);
                // a = Math.sin(Double.parseDouble(result_scientific.getText()+""));
                //   result_scientific.setText(""+a);
            }
        });

        pointbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_scientific.setText(result_scientific.getText()+".");
            }
        });
        ansbuttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_scientific.setText(String.valueOf(ans));
            }
        });

    }
    private void openEquationSolverActivity() {
        Intent intent = new Intent(this, equationSolver.class);
        startActivity(intent);
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

