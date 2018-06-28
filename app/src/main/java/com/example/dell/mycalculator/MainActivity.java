package com.example.dell.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView t1, t2, t3, t4;
    boolean add, sub, mul, div;
    float f1, f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button n9 = findViewById(R.id.num9);
        Button n8 = findViewById(R.id.num8);
        Button n7 = findViewById(R.id.num7);
        Button n6 = findViewById(R.id.num6);
        Button n5 = findViewById(R.id.num5);
        Button n4 = findViewById(R.id.num4);
        Button n3 = findViewById(R.id.num3);
        Button n2 = findViewById(R.id.num2);
        Button n1 = findViewById(R.id.num1);
        Button n0 = findViewById(R.id.num0);
        Button npoint = findViewById(R.id.point);
        Button equalbtn = findViewById(R.id.equalsto);
        Button addbtn = findViewById(R.id.addition);
        Button subbtn=findViewById(R.id.substraction);
        Button mulbtn=findViewById(R.id.multiplication);
        Button divbtn=findViewById(R.id.division);
        Button rebtn=findViewById(R.id.reset);

        n9.setOnClickListener(this);
        n8.setOnClickListener(this);
        n7.setOnClickListener(this);
        n6.setOnClickListener(this);
        n5.setOnClickListener(this);
        n4.setOnClickListener(this);
        n3.setOnClickListener(this);
        n2.setOnClickListener(this);
        n1.setOnClickListener(this);
        n0.setOnClickListener(this);
        npoint.setOnClickListener(this);
        equalbtn.setOnClickListener(this);
        addbtn.setOnClickListener(this);
        subbtn.setOnClickListener(this);
        mulbtn.setOnClickListener(this);
        divbtn.setOnClickListener(this);
        rebtn.setOnClickListener(this);


        t1 = findViewById(R.id.textView1);
        t2 = findViewById(R.id.textView2);
        t3 = t1;
        t4 = findViewById(R.id.textView4);


    }

    @Override
    public void onClick(View view) {

        float a;

        switch (view.getId()) {
            case R.id.num9:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(9 + "");
                } else {
                    a = (a * 10) + 9;
                    t3.setText(a + "");
                }
                break;

            case R.id.num8:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(8 + "");
                } else {
                    a = (a * 10) + 8;
                    t3.setText(a + "");
                }
                break;

            case R.id.num7:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(7 + "");
                } else {
                    a = (a * 10) + 7;
                    t3.setText(a + "");
                }
                break;

            case R.id.num6:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(6 + "");
                } else {
                    a = (a * 10) + 6;
                    t3.setText(a + "");
                }
                break;

            case R.id.num5:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(5 + "");
                } else {
                    a = (a * 10) + 5;
                    t3.setText(a + "");
                }
                break;
            case R.id.num4:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(4 + "");
                } else {
                    a = (a * 10) + 4;
                    t3.setText(a + "");
                }
                break;

            case R.id.num3:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(3 + "");
                } else {
                    a = (a * 10) + 3;
                    t3.setText(a + "");
                }
                break;

            case R.id.num2:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(2 + "");
                } else {
                    a = (a * 10) + 2;
                    t3.setText(a + "");
                }
                break;

            case R.id.num1:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(1 + "");
                } else {
                    a = (a * 10) + 1;
                    t3.setText(a + "");
                }
                break;

            case R.id.num0:
                a = Float.parseFloat(t3.getText().toString());
                if (a < 1) {
                    t3.setText(0 + "");
                } else {
                    a = (a * 10) + 0;
                    t3.setText(a + "");
                }
                break;

            case R.id.point:
                a=Float.parseFloat((t3.getText().toString()));
                if(a<10.0){
                    t3.setText(0+"");
                } else {

                    a=a/10;
                    t3.setText(a+"");
                }

            case R.id.addition:
                add = true;
                f1 = Float.parseFloat(t3.getText().toString());
                t3 = t2;
                break;

            case R.id.substraction:
                sub=true;
                f1 = Float.parseFloat(t3.getText().toString());
                t3 = t2;
                break;

            case R.id.multiplication:
                mul=true;
                f1 = Float.parseFloat(t3.getText().toString());
                t3 = t2;
                break;

            case R.id.division:
                div=true;
                f1 = Float.parseFloat(t3.getText().toString());
                t3 = t2;
                break;

            case R.id.equalsto:
                f2 = Float.parseFloat(t3.getText().toString());
                if (add == true) {
                    float fresult = f1 + f2;
                    add = false;
                    t4.setText(fresult + "");
                }

                if(sub == true){
                    float fresult = f1 - f2;
                    sub = false;
                    t4.setText(fresult + "");
                }

                if(mul==true){
                    float fresult = f1 * f2;
                    mul = false;
                    t4.setText(fresult + "");
                }

                if(div==true){
                    float fresult = f1 / f2;
                    div = false;
                    t4.setText(fresult + "");
                }
                break;

            case R.id.reset:
                t1.setText(0+"");
                t2.setText(0+"");
                t4.setText("");
                t3=t1;
                break;
        }
    }
}
