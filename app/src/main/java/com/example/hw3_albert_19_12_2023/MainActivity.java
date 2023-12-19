package com.example.hw3_albert_19_12_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    TextView tv2;
    Button btn;
    int num = 0;
    int temp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        btn = findViewById(R.id.btn);
    }

    public void lol(View view) {
        num++;
        if(num>=1 ||temp>=0)
        {
            tv.setVisibility(View.VISIBLE);
            tv2.setVisibility(View.VISIBLE);
            tv.setText("This is a click number:" +num);
            temp =num;
            if(num>6)
            {
                tv.setText("Enough to click. Go to new start!");
                num = 0;
            }
        }

    }
}