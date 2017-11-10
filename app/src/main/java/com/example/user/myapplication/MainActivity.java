package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnDem(View view) {
        Intent i = new Intent(MainActivity.this, ToanDem.class);
        startActivity(i);
    }

    public void btnCong(View view) {
        Intent i = new Intent(MainActivity.this, ToanCong.class);
        startActivity(i);
    }

    public void btnTru(View view) {
        Intent i = new Intent(MainActivity.this, ToanTru.class);
        startActivity(i);
    }

    public void btnNhan(View view) {
        Intent i = new Intent(MainActivity.this, ToanNhan.class);
        startActivity(i);
    }
    public void btnChia(View view) {
        Intent i = new Intent(MainActivity.this, ToanChia.class);
        startActivity(i);
    }
}
