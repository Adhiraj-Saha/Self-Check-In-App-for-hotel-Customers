package com.example2.selfcheckinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import  android.view.View;

import android.os.Bundle;

public class firstactivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstactivity3);


    }
    public void tcs(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    }
