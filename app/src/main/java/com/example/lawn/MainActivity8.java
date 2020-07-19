package com.example.lawn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Button btn19 = findViewById(R.id.button23);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity17();
            }
        });
        Button btn20 = findViewById(R.id.button24);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity18();
            }
        });
        Button btn21 = findViewById(R.id.button25);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity19();
            }
        });
        Button btn22 = findViewById(R.id.button26);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity20();
            }
        });
        Button btn23 = findViewById(R.id.button27);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity21();
            }
        });
        Button btn24 = findViewById(R.id.button28);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity22();
            }
        });
        Button btn25 = findViewById(R.id.button29);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity23();
            }
        });
        Button btn26 = findViewById(R.id.button30);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity24();
            }
        });

        Button btn200 = findViewById(R.id.button31);
        btn200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

    }
    public void openActivity3(){
        Intent intent200 = new Intent(this, MainActivity3.class);
        startActivity(intent200);
    }
    public void openActivity17() {
        Intent intent3 = new Intent(this, MainActivity17.class);
        startActivity(intent3);



    }
    public void openActivity18() {
        Intent intent4 = new Intent(this, MainActivity18.class);
        startActivity(intent4);



    }
    public void openActivity19() {
        Intent intent5 = new Intent(this, MainActivity19.class);
        startActivity(intent5);



    }
    public void openActivity20() {
        Intent intent6 = new Intent(this, MainActivity20.class);
        startActivity(intent6);



    }
    public void openActivity21() {
        Intent intent7 = new Intent(this, MainActivity21.class);
        startActivity(intent7);



    }
    public void openActivity22() {
        Intent intent8 = new Intent(this, MainActivity22.class);
        startActivity(intent8);




    }
    public void openActivity23() {
        Intent intent9 = new Intent(this, MainActivity23.class);
        startActivity(intent9);



    }
    public void openActivity24() {
        Intent intent10 = new Intent(this, MainActivity24.class);
        startActivity(intent10);
    }
}