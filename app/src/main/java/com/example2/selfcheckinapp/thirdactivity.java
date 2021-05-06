package com.example2.selfcheckinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import  android.view.View;

public class thirdactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
    }
    public void carry(View view) {
        Intent intent = new Intent(this, last.class);
        startActivity(intent);
    }



}