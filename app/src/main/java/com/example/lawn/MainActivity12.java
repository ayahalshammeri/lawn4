package com.example.lawn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        Button btn09 = findViewById(R.id.button39);
        btn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity25();
            }
        });
        Button btn010 = findViewById(R.id.button40);
        btn010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity26();
            }
        });
        Button btn011 = findViewById(R.id.button41);
        btn011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity27();
            }
        });
        Button btn012 = findViewById(R.id.button42);
        btn012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity28();
            }
        });
        Button btn013 = findViewById(R.id.button43);
        btn013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity29();
            }
        });
        Button btn014 = findViewById(R.id.button44);
        btn014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity30();
            }
        });
        Button btn015 = findViewById(R.id.button45);
        btn015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity31();
            }
        });
        Button btn016 = findViewById(R.id.button46);
        btn016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity32();
            }
        });

        Button btn020 = findViewById(R.id.button50);
        btn020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }
    public void openActivity25(){
        Intent intent09 = new Intent(this, MainActivity25.class);
        startActivity(intent09);
    }
    public void openActivity26() {
        Intent intent010 = new Intent(this, MainActivity26.class);
        startActivity(intent010);



    }
    public void openActivity27() {
        Intent intent011 = new Intent(this, MainActivity27.class);
        startActivity(intent011);



    }
    public void openActivity28() {
        Intent intent012 = new Intent(this, MainActivity28.class);
        startActivity(intent012);



    }
    public void openActivity29() {
        Intent intent013 = new Intent(this, MainActivity29.class);
        startActivity(intent013);



    }
    public void openActivity30() {
        Intent intent014 = new Intent(this, MainActivity30.class);
        startActivity(intent014);



    }
    public void openActivity31() {
        Intent intent015 = new Intent(this, MainActivity31.class);
        startActivity(intent015);




    }
    public void openActivity32() {
        Intent intent016 = new Intent(this, MainActivity32.class);
        startActivity(intent016);




    }
    public void openActivity3() {
        Intent intent020 = new Intent(this, MainActivity3.class);
        startActivity(intent020);

    }
    }