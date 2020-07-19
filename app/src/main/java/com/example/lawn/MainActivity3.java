package com.example.lawn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btn3 = findViewById(R.id.button2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });
        Button btn4 = findViewById(R.id.button3);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });
        Button btn5 = findViewById(R.id.button4);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }
        });
        Button btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity9();
            }
        });
        Button btn7 = findViewById(R.id.button5);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }
        });
        Button btn8 = findViewById(R.id.button7);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }
        });
        Button btn9 = findViewById(R.id.button8);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity12();
            }
        });
        Button btn10 = findViewById(R.id.button9);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity13();
            }
        });
    }
    public void openActivity6() {
        Intent intent3 = new Intent(this, MainActivity6.class);
        startActivity(intent3);



    }
    public void openActivity7() {
        Intent intent4 = new Intent(this, MainActivity7.class);
        startActivity(intent4);



    }
    public void openActivity8() {
        Intent intent5 = new Intent(this, MainActivity8.class);
        startActivity(intent5);



    }
    public void openActivity9() {
        Intent intent6 = new Intent(this, MainActivity9.class);
        startActivity(intent6);



    }
    public void openActivity10() {
        Intent intent7 = new Intent(this, MainActivity10.class);
        startActivity(intent7);



    }
    public void openActivity11() {
        Intent intent8 = new Intent(this, MainActivity11.class);
        startActivity(intent8);




    }
    public void openActivity12() {
        Intent intent9 = new Intent(this, MainActivity12.class);
        startActivity(intent9);



    }
    public void openActivity13() {
        Intent intent10 = new Intent(this, MainActivity13.class);
        startActivity(intent10);
    }
}