package com.example.lawn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Button btn3 = findViewById(R.id.button60);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity33();
            }
        });
        Button btn99 = findViewById(R.id.button68);
        btn99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

    public void openActivity33() {
        Intent intent3 = new Intent(this, MainActivity17.class);
        startActivity(intent3);
    }


    public void openActivity3() {
        Intent intent3 = new Intent(this, MainActivity3.class);
        startActivity(intent3);
    }
}
