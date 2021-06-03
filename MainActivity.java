package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.UFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textview1, textview2;
    private Double first, second, result;
    private String operation, ans;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClear, btnBackSpace, btnPlus, btnMinus, btnMultiply, btnDivide, btnPercent, btnDot, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVariables();

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview1.setText(null);
                textview2.setText(null);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn1.getText().toString();
                textview2.setText(text);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn0.getText().toString();
                textview2.setText(text);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn2.getText().toString();
                textview2.setText(text);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn3.getText().toString();
                textview2.setText(text);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn4.getText().toString();
                textview2.setText(text);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn5.getText().toString();
                textview2.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn6.getText().toString();
                textview2.setText(text);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn7.getText().toString();
                textview2.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn8.getText().toString();
                textview2.setText(text);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btn9.getText().toString();
                textview2.setText(text);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text = textview2.getText().toString()+btnDot.getText().toString();
                textview2.setText(text);
            }
        });

        btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Backspace =null;
                if(textview2.getText().length()>0){
                    StringBuilder stringBuilder = new StringBuilder(textview2.getText());
                    stringBuilder.deleteCharAt(textview2.getText().length()-1);
                    Backspace=stringBuilder.toString();
                    textview2.setText(Backspace);
                }
            }
        });

        //code for operators

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation="%";
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation="-";
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation="+";
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation="*";
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText("");
                operation="/";
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second=Double.parseDouble((String)textview2.getText());
                if(operation == "+")
                {
                    result=first+second;
                }
                else if(operation == "-")
                {
                    result=first-second;
                }
                else if(operation == "*")
                {
                    result=first*second;
                }
                else if(operation == "/")
                {
                    result=first/second;
                }
                else
                {
                    result=first%second;
                }
                ans=String.format("%.2f",result);
                textview2.setText(ans);
                textview1.setText(null);
            }
        });
    }

    public void initVariables(){
        textview1=findViewById(R.id.textviwe1);
        textview2=findViewById(R.id.textview2);
        btn0=findViewById(R.id.b0);
        btn1=findViewById(R.id.b1);
        btn2=findViewById(R.id.b2);
        btn3=findViewById(R.id.b3);
        btn4=findViewById(R.id.b4);
        btn5=findViewById(R.id.b5);
        btn6=findViewById(R.id.b6);
        btn7=findViewById(R.id.b7);
        btn8=findViewById(R.id.b8);
        btn9=findViewById(R.id.b9);
        btnClear=findViewById(R.id.btnClear);
        btnBackSpace=findViewById(R.id.btnBackSpace);
        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        btnDot=findViewById(R.id.btnDot);
        btnPercent=findViewById(R.id.btnPercentage);
        btnEqual=findViewById(R.id.btnEqual);
    }
}