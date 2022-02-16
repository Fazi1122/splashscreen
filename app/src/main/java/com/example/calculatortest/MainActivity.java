package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add,subs,multiply,divide;
    EditText et1,et2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        add=findViewById(R.id.add);
        multiply=findViewById(R.id.multiply);
        subs=findViewById(R.id.subs);
        divide=findViewById(R.id.divide);
        tv=findViewById(R.id.tv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, a;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = f + s;
                tv.setText("Result =" + a);

            }


        });
        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, a;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = f - s;
                tv.setText("Result =" + a);

            }


        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, a;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = f * s;
                tv.setText("Result =" + a);

            }


        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, a;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = f / s;
                tv.setText("Result =" + a);

            }


        });

    }
}