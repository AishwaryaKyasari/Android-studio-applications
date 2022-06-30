package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1,input2;
    TextView answer;
    Button add,sub,mul,div;
    float v1,v2,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        answer = findViewById(R.id.answer);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        v1 = Float.parseFloat(input1.getText().toString());
        v2 = Float.parseFloat(input2.getText().toString());

        /*add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = v1 + v2;
                answer.setText(String.valueOf(ans));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(v1 >v2){
                    ans= v1 - v2;
                }
                else{
                    ans=v2-v1;
                }
                answer.setText(String.valueOf(ans));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans= v1 * v2;
                answer.setText(String.valueOf(ans));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans= v1 / v2;
                answer.setText(String.valueOf(ans));
            }
        });

         */
    }
}