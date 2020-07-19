package com.example.lawn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Button btn12 = findViewById(R.id.button10);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity14();
            }
        });

        Button btn13 = findViewById(R.id.button20);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        Button btn14 = findViewById(R.id.button12);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity15();
            }
        });

        Button btn0 = findViewById(R.id.button19);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity16();
            }
        });


    }
    public void openActivity14() {
        Intent intent12 = new Intent(this, MainActivity14.class);
        startActivity(intent12);


    }
    public void openActivity3() {
        Intent intent13 = new Intent(this, MainActivity3.class);
        startActivity(intent13);


    }
    public void openActivity15() {
        Intent intent14 = new Intent(this, MainActivity15.class);
        startActivity(intent14);

    }
    public void openActivity16() {
        Intent intent0 = new Intent(this, MainActivity16.class);
        startActivity(intent0);
    }
}