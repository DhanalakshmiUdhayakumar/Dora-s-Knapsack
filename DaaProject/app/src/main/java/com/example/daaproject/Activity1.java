package com.example.daaproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Activity1 extends AppCompatActivity {

    TextView txt;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        txt = findViewById(R.id.text2);
        button1 = findViewById(R.id.btn1);

        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int val = random.nextInt(500);
                txt.setText(Integer.toString(val));
            }
        });
    }


}
