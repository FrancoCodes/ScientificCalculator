package com.nubsauce.calculatortrial23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Define Buttons
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bpi, bequal, bplus, bmin, bmul, bdiv, binv, bsqrt, bsquare, bfact, bln, blog, btan, bcos, bsin, bb1, bb2, bc, bac;

    //Define Two textviews for calculations
    public TextView tvmain, tvsec;
    String pi = "3.14159265";

    //Define numberCounter to determine digit placement
    int numberCounter = 0;
    //Define decimalCounter to determine decimal placement
    int decimalCounter =0;
    //Establish parenthesis counter
    int openParenthesisCounter =0;
    int closeParenthesisCounter = 0;
    //Animations for buttons
    Animation scaleUp, scaleDown;
    //carrot counter
    int carrotCounter = 0;
    //equals button notification as true or false
    boolean equaled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize button animation
        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);

        //Initialize buttons on Calculator
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);
        bequal = findViewById(R.id.bequal);
        bplus = findViewById(R.id.bplus);
        bmin = findViewById(R.id.bmin);
        bmul = findViewById(R.id.bmul);
        bdiv = findViewById(R.id.bdiv);
        binv = findViewById(R.id.binv);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfact = findViewById(R.id.bfact);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);

        //Initialize text Views
        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //Add number one button to calculator
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "1");
            }
        });

        //button animation onTouch button b1
        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b1.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b1.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Add number one button to calculator
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "2");
            }
        });

        //button animation onTouch button b2
        b2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b2.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b2.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Add number three button to calculator
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "3");
            }
        });

        //button animation onTouch button b3
        b3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b3.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b3.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Add number four button to calculator
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "4");
            }
        });

        //button animation onTouch button b4
        b4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b4.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b4.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Add number five button to calculator
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "5");
            }
        });

        //button animation onTouch button b5
        b5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b5.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b5.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Add number six button to calculator
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "6");
            }
        });

        //button animation onTouch button b6
        b6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b6.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b6.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Add number seven button to calculator
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "7");
            }
        });

        //button animation onTouch button b7
        b7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b7.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b7.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Add number eight button to calculator
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "8");
            }
        });

        //button animation onTouch button b8
        b8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b8.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b8.startAnimation(scaleDown);
                }
                return false;
            }
        });


        //Add number nine button to calculator
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "9");
            }
        });

        //button animation onTouch button b9
        b9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b9.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b9.startAnimation(scaleDown);
                }
                return false;
            }
        });


        //Add zero button to calculator
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;
                }
                ++numberCounter;
                tvmain.setText(tvmain.getText() + "0");
            }
        });

        //button animation onTouch button b0
        b0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    b0.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    b0.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Button adds decimal value to calculator. Ensures only one decimal can be added at a time
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    openParenthesisCounter = 0;
                    closeParenthesisCounter =0;
                    numberCounter =0;
                    equaled = false;

                }
                if(decimalCounter == 0) {
                    tvmain.setText(tvmain.getText() + ".");
                }
                ++decimalCounter;
            }
        });

        //button animation onTouch button bdot
        bdot.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bdot.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bdot.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Back button clears all values on primary and secondary Text Views
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openParenthesisCounter = 0;
                closeParenthesisCounter =0;
                numberCounter =0;
                tvmain.setText("");
                tvsec.setText("");
                decimalCounter =0;
            }
        });

        //button animation onTouch button bac
        bac.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bac.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bac.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Button removes previous character
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gets tvmain Text as string and removes last value by replacing string with substring
                //of length -1.
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);
            }
        });

        //button animation onTouch button bc
        bc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bc.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bc.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Button appends addition symbol to calculator
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //do nothing if equal button is defined True. This means the Text View is empty.
                if (equaled) {

                } else {
                    //set decimal Counter to zero to enable decimal button.
                    //If textview is not empty do not append addition symbol for the following
                    //constraints, otherwise append addition symbol
                    decimalCounter = 0;
                    if (numberCounter >= 1) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    if (!lastcharone.equals(".") && !lastcharone.equals("(")) {
                            String tvText = (String) tvmain.getText();
                            String lastChar = tvText.substring(tvText.length() - 1);
                            if (lastChar.equals("+") || lastChar.equals("*") || lastChar.equals("÷") || lastChar.equals("^")) {
                                String newString = removeLastChars(tvText, 1);
                                tvmain.setText(newString + "+");
                            } else if (!lastChar.equals("-")) {
                                tvmain.setText(tvmain.getText() + "+");
                            }
                        }
                    }
                }
            }

        });

        //bplus button animation
        bplus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bplus.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bplus.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Button appends subtraction symbol to calculator
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            //If equal button equals true, then set Text to clear.
            public void onClick(View v) {
                if (equaled) {
                    tvmain.setText("");
                    equaled = false;
                }

                //Append subtraction symbol to TextView tvmain if last character is not equal to decimal
                decimalCounter = 0;
                if (numberCounter >= 1) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    if (!lastcharone.equals(".")) {
                        tvmain.setText(tvmain.getText() + "-");
                    }
                }
                //Append subtraction symbol if textView tvmain is empty
                else{
                    tvmain.setText(tvmain.getText() + "-");
                }
            }
        });

        //subtraction animation
        bmin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bmin.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bmin.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Button appends multiplication symbol to calculator
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do nothing if equal button is defined True. This means the Text View is empty.
                if (equaled) {

                } else {
                    //set decimal Counter to zero to enable decimal button.
                    //If textview is not empty do not append multiplication symbol to TextView tvmain for the following
                    //constraints, otherwise append multiplication symbol
                    decimalCounter = 0;
                    if (numberCounter >= 1) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    if (!lastcharone.equals(".") && !lastcharone.equals("(")) {
                            String tvText = (String) tvmain.getText();
                            String lastChar = tvText.substring(tvText.length() - 1);
                            if (lastChar.equals("+") || lastChar.equals("*") || lastChar.equals("÷") || lastChar.equals("^")) {
                                String newString = removeLastChars(tvText, 1);
                                tvmain.setText(newString + "*");
                            } else if (!lastChar.equals("-")) {
                                tvmain.setText(tvmain.getText() + "*");
                            }
                        }
                    }
                }
            }
        });

        //Multiplication button
        bmul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bmul.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bmul.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Button appends division symbol to calculator
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (equaled) {

                } else {
                    //set decimal Counter to zero to enable decimal button.
                    //If textview is not empty do not append division symbol to TextView tvmain for the following
                    //constraints, otherwise append division symbol
                    decimalCounter = 0;
                    if (numberCounter >= 1) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    if (!lastcharone.equals(".") && !lastcharone.equals("(")) {
                            String tvText = (String) tvmain.getText();
                            String lastChar = tvText.substring(tvText.length() - 1);
                            if (lastChar.equals("+") || lastChar.equals("*") || lastChar.equals("÷") || lastChar.equals("^")) {
                                String newString = removeLastChars(tvText, 1);
                                tvmain.setText(newString + "÷");
                            } else if (!lastChar.equals("-")) {
                                tvmain.setText(tvmain.getText() + "÷");
                            }
                        }
                    }
                }
            }
        });

        //Division Button Animation
        bdiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bdiv.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bdiv.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Button appends square root symbol to calculator
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set equaled to false and clear tvmain text if equaled equals true to ensure square root
                //of valid value
                if(equaled){
                    tvmain.setText("");
                    equaled = false;
                }
                //get tvmain text as value to find square root of, set resulting value as tvmain text
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            }
        });

        //square root button animation
        bsqrt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bsqrt.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bsqrt.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Open parenthesis button
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clear textview if equaled is true, then set it equal to false.
                if(equaled){
                    tvmain.setText("");
                    equaled = false;
                }

                //Apply Open parenthesis if textView is not empty
                if (!tvmain.getText().toString().equals("")) {
                    String tvText = (String) tvmain.getText();
                    String lastChar = tvText.substring(tvText.length() - 1);
                    //Only allow open parenthesis value to append to textview  if
                    //the following characters exist on the last position of the string.
                    //Add counter to openParenthesisCounter
                    if (lastChar.equals("+") || lastChar.equals("*") || lastChar.equals("÷") || lastChar.equals("-") ) {
                        ++openParenthesisCounter;
                        tvmain.setText(tvmain.getText() + "(");
                    }
                }

            }
        });

        //Open Parenthesis Button
        bb1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bb1.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bb1.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Close Parenthesis Button
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override

            //Clear textview if equaled is true, then set it equal to false.
            public void onClick(View v) {
                if (equaled) {
                    tvmain.setText("");
                    equaled = false;
                }
                //Apply close parenthesis if textView is not empty
                if (numberCounter >= 1) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    //Do not allow close parenthesis value to append to textview  if
                    //the following characters exist on the last position of the string.
                    if (lastcharone.equals("(") || lastcharone.equals("-") || lastcharone.equals("+") || lastcharone.equals("*") || lastcharone.equals("÷") || lastcharone.equals(".")) {
                        String tvText = (String) tvmain.getText();
                        String lastChar = tvText.substring(tvText.length() - 1);
                    } else {
                        //If openParenthesisCounter is less than closeParenthesisCounter, Append closeParenthesis and add to the counter.
                        if (openParenthesisCounter > closeParenthesisCounter) {
                            ++closeParenthesisCounter;
                            tvmain.setText(tvmain.getText() + ")");
                        }
                    }
                }
                else{

                }
            }
        });

        //Close Parenthesis button animation
        bb2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bb2.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bb2.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Pi button append to tvmain Textview
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    equaled = false;
                }
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText() + pi);
            }
        });

        //Pi button animation
        bpi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bpi.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bpi.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //sin Button
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Clear textview if equaled is true, then set it equal to false.
                if(equaled){
                    tvmain.setText("");
                    equaled = false;
                }
                //Check if textview is Empty
                if (!tvmain.getText().equals("")) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    //Do not append sin button to TextView if the previous button is a number value
                    if(lastcharone.equals("0") || lastcharone.equals("1") || lastcharone.equals("2") || lastcharone.equals("3") || lastcharone.equals("4")
                            || lastcharone.equals("5") || lastcharone.equals("6") || lastcharone.equals("7") || lastcharone.equals("8") || lastcharone.equals("9")
                            || lastcharone.equals(".")|| lastcharone.equals(")")) {
                    //append sin to textview. Add openParenthesisCounter and numberCounter
                    } else {
                        ++openParenthesisCounter;
                        tvmain.setText(tvmain.getText() + "sin(");
                        ++numberCounter;

                    }

                }
                //Append if textView is empty
                if (tvmain.getText().equals("")) {
                    ++openParenthesisCounter;
                    tvmain.setText(tvmain.getText() + "sin(");
                    ++numberCounter;

                }

            }
        });

        //Sin button animation
        bsin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bsin.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bsin.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Cosine button
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override

            //Clear textview if equaled is true, then set it equal to false.
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    equaled = false;
                }
                //Check if textview is Empty
                if (!tvmain.getText().equals("")) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);

                    //Do not append cosine button to TextView if the previous button is a number value, closed parenthesis or the decimal button.
                    if(lastcharone.equals("0") || lastcharone.equals("1") || lastcharone.equals("2") || lastcharone.equals("3") || lastcharone.equals("4")
                            || lastcharone.equals("5") || lastcharone.equals("6") || lastcharone.equals("7") || lastcharone.equals("8") || lastcharone.equals("9")
                            || lastcharone.equals(".")|| lastcharone.equals(")")) {

                    } else {
                        //append cosine to textview. Add openParenthesisCounter and numberCounter
                        ++openParenthesisCounter;
                        tvmain.setText(tvmain.getText() + "cos(");
                        ++numberCounter;

                    }

                }
                //Append if textView is empty
                if (tvmain.getText().equals("")) {
                    ++openParenthesisCounter;
                    tvmain.setText(tvmain.getText() + "cos(");
                    ++numberCounter;

                }

            }
        });
        //Cosine button animation
        bcos.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bcos.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bcos.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Tangent Button
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            //Clear textview if equaled is true, then set it equal to false.
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    equaled = false;
                }
                //Check if textview is Empty
                if (!tvmain.getText().equals("")) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    //Do not append tangent button to TextView if the previous button is a number value, closed parenthesis or the decimal button.
                    if(lastcharone.equals("0") || lastcharone.equals("1") || lastcharone.equals("2") || lastcharone.equals("3") || lastcharone.equals("4")
                            || lastcharone.equals("5") || lastcharone.equals("6") || lastcharone.equals("7") || lastcharone.equals("8") || lastcharone.equals("9")
                            || lastcharone.equals(".")|| lastcharone.equals(")")){

                    } else {
                        //append tangent to textview. Add openParenthesisCounter and numberCounter
                        ++openParenthesisCounter;
                        tvmain.setText(tvmain.getText() + "tan(");
                        ++numberCounter;

                    }

                }
                //Append if textView is empty
                if (tvmain.getText().equals("")) {
                    ++openParenthesisCounter;
                    tvmain.setText(tvmain.getText() + "tan(");
                    ++numberCounter;

                }

            }
        });

        //tangent button animation
        btan.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    btan.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btan.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //inversion button
        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    equaled = false;
                }
                tvmain.setText(tvmain.getText() + "^" + "(-1)");
            }
        });
        //Inversion button animation
        binv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    binv.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    binv.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Cotangent Button
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clear textview if equaled is true, then set it equal to false.
                if (equaled) {
                    tvmain.setText("");
                    equaled = false;
                }
                //Check if textview is Empty
                if (!tvmain.getText().equals("")) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    //Do not append cotangent button to TextView if the previous button is a number value, closed parenthesis or the decimal button.
                    if (lastcharone.equals("0") || lastcharone.equals("1") || lastcharone.equals("2") || lastcharone.equals("3") || lastcharone.equals("4")
                            || lastcharone.equals("5") || lastcharone.equals("6") || lastcharone.equals("7") || lastcharone.equals("8") || lastcharone.equals("9")
                            || lastcharone.equals(".")  || lastcharone.equals(")"))  {

                    } else {
                        //append cotangent to textview. Add openParenthesisCounter and numberCounter
                        ++openParenthesisCounter;
                        tvmain.setText(tvmain.getText() + "cot(");
                        ++numberCounter;

                    }

                }
                //Append if textView is empty
                if (tvmain.getText().equals("")) {
                        ++openParenthesisCounter;
                        tvmain.setText(tvmain.getText() + "cot(");
                        ++numberCounter;

                    }


            }
        });

        //cotangent button animation
        bfact.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bfact.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bfact.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Caret (circumflex) button (^) that gives a number a power degree
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clear textview if equaled is true, then set it equal to false.
                if(equaled){
                    tvmain.setText("");
                    equaled = false;
                }
                else {
                    decimalCounter = 0;
                    //Check if TextView is not empty
                    if (numberCounter >= 1) {
                        String tvTextone = (String) tvmain.getText();
                        String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                        //Do nothing if last character on tvmain string equals open parenthesis or decimal
                        if (lastcharone.equals("(") || lastcharone.equals(".")) {

                        } else {
                            //Check if last character is not equal to caret
                            if (!lastcharone.equals("^")) {
                                String tvText = (String) tvmain.getText();
                                String lastChar = tvText.substring(tvText.length() - 1);
                                // replace the following symbols if last character equals them
                                if (lastChar.equals("+") || lastChar.equals("*") || lastChar.equals("÷")) {
                                    String newString = removeLastChars(tvText, 1);
                                    tvmain.setText(newString + "^");
                                } else if (!lastChar.equals("-")) {
                                    //Add caret if last character is not subtraction symbol
                                    tvmain.setText(tvmain.getText() + "^");
                                }
                            }
                        }
                    }
                }
            }
        });

        //caret button animation
        bsquare.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bsquare.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bsquare.startAnimation(scaleDown);
                }
                return false;
            }
        });
        //natural log button
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            //Clear textview if equaled is true, then set it equal to false.
            public void onClick(View v) {
                if(equaled){
                    tvmain.setText("");
                    equaled = false;
                }
                //Check if tvmain is not empty
                if (!tvmain.getText().equals("")) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    //Do not append natural log button to TextView if the previous button is a number value, closed parenthesis or the decimal button.
                    if(lastcharone.equals("0") || lastcharone.equals("1") || lastcharone.equals("2") || lastcharone.equals("3") || lastcharone.equals("4")
                            || lastcharone.equals("5") || lastcharone.equals("6") || lastcharone.equals("7") || lastcharone.equals("8") || lastcharone.equals("9")
                            || lastcharone.equals(".")|| lastcharone.equals(")")) {

                    } else {
                        //append cotangent to textview. Add openParenthesisCounter and numberCounter
                        ++openParenthesisCounter;
                        tvmain.setText(tvmain.getText() + "ln(");
                        ++numberCounter;

                    }

                }
                //Append if textView is empty
                if (tvmain.getText().equals("")) {
                    ++openParenthesisCounter;
                    tvmain.setText(tvmain.getText() + "ln(");
                    ++numberCounter;

                }


            }
        });

        //natural log button animation
        bln.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bln.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bln.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //logarithmic button
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            //Clear textview if equaled is true, then set it equal to false.
            public void onClick(View v) {
                 if(equaled){
                     tvmain.setText("");
                     equaled = false;
                 }
                //Check if tvmain is not empty
                if (!tvmain.getText().equals("")) {
                    String tvTextone = (String) tvmain.getText();
                    String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                    //Do not append logarithmic button to TextView if the previous button is a number value, closed parenthesis or the decimal button.
                    if(lastcharone.equals("0") || lastcharone.equals("1") || lastcharone.equals("2") || lastcharone.equals("3") || lastcharone.equals("4")
                            || lastcharone.equals("5") || lastcharone.equals("6") || lastcharone.equals("7") || lastcharone.equals("8") || lastcharone.equals("9")
                            || lastcharone.equals(".")|| lastcharone.equals(")")) {

                    } else {
                        //append cotangent to textview. Add openParenthesisCounter and numberCounter
                        ++openParenthesisCounter;
                        tvmain.setText(tvmain.getText() + "log(");
                        ++numberCounter;

                    }

                }
                //Append if textView is empty
                if (tvmain.getText().equals("")) {
                    ++openParenthesisCounter;
                    tvmain.setText(tvmain.getText() + "log(");
                    ++numberCounter;

                }

            }
        });

        //Logarithmic button animation
        blog.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    blog.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    blog.startAnimation(scaleDown);
                }
                return false;
            }
        });

        //Equals button
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Set equals to true
                equaled = true;
                //if TextView tvmain is empty, do nothing
                if (tvmain.getText().equals("")) {

                } else {
                    //Find last character is tvmain string.
                    String tvTextomit = (String) tvmain.getText();
                    String lastcharomit = tvTextomit.substring(tvTextomit.length() - 1);
                    //If open and close parenthesis count is not the same, or last value equals caret, decimal or minus, set Incorrect Formatting text.
                    if (openParenthesisCounter != closeParenthesisCounter || lastcharomit.equals("^") || lastcharomit.equals(".") || lastcharomit.equals("-")){
                        tvsec.setText("Incorrect formatting");
                        openParenthesisCounter = 0;
                        closeParenthesisCounter = 0;
                        tvmain.setText("");
                    } else {
                        //Set decimal counter to zero
                        decimalCounter = 0;
                        //If number Counter equals 1 or more
                        if (numberCounter >= 1) {
                            String tvTextone = (String) tvmain.getText();
                            String lastcharone = tvTextone.substring(tvTextone.length() - 1);
                                //If openParenthesisCounter equals closeParenthesisCounter
                                if (openParenthesisCounter == closeParenthesisCounter) {
                                    decimalCounter = 0;
                                    //if tvmain text is not empty
                                    if (!tvmain.getText().toString().equals("")) {

                                        String tvText = (String) tvmain.getText();
                                        String lastChar = tvText.substring(tvText.length() - 1);
                                        //If last character equals addition, multiplication or division, remove character
                                        //to form new string
                                        if (lastChar.equals("+") || lastChar.equals("*") || lastChar.equals("÷")) {
                                            String newString = removeLastChars(tvText, 1);
                                            tvmain.setText(newString);
                                        }
                                        //Replace division and multiplication symbol formatting for evaluation
                                        String val = tvmain.getText().toString();
                                        String replacedstr = val.replace('÷', '/').replace('×', '*');
                                        //Set result value as double
                                        double result = eval(replacedstr);
                                        //Set values answer and input to tvmain and tvsec
                                        tvmain.setText(String.valueOf(result));
                                        tvsec.setText(val);
                                        numberCounter = 0;
                                    }

                                }

                        }
                        //set parenthesis counters to zero.
                        openParenthesisCounter = 0;
                        closeParenthesisCounter = 0;
                    }

                }
            }
        });

        //Equals button animation
        bequal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    bequal.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    bequal.startAnimation(scaleDown);
                }
                return false;
            }
        });

    }


    //Evaluation Function
    public double eval(final String str) {
        //Create new Object proper functionality and variables
        return new Object() {
            //initialize position -1 and character number
            int pos = -1, ch;

            //next character is less than string length else character at position equals -1
            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            //Identify removable values by moving to next character
            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            //Extract necessary values
            double parse() {
                nextChar();
                double x = parseExpression();
                //throw exception is pos is less than string length
                if (pos < str.length())
                    throw new RuntimeException("Unexpected: " + (char) ch);
                //return double parse value
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("cot")) x = 1/(Math.tan(Math.toRadians(x)));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
    //Empty the string
    public static String removeLastChars(String str, int chars) {
        return str.substring(0, str.length() - chars);
    }

}