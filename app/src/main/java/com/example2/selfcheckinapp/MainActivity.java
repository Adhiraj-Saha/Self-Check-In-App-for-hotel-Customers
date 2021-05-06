package com.example2.selfcheckinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;




import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {
    DatabaseReference reff;
    Member member;
    public static final String MSG = "multiscreenapp.order";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeorder(View view) {
        member=new Member();
        reff= FirebaseDatabase.getInstance().getReference("user3").child("Member");


        EditText editText1 = findViewById(R.id.editText2);
        EditText editText2 = findViewById(R.id.editText3);
        EditText editText3 = findViewById(R.id.editText4);
        EditText editText4 = findViewById(R.id.editText5);
        EditText editText5 = findViewById(R.id.editText6);
        EditText editText6 = findViewById(R.id.editTextTextPersonName);
        EditText editText7 = findViewById(R.id.editTextTextPersonName2);


        String vary = editText1.getText().toString();
        String vary1 = editText2.getText().toString();
        String vary2 = editText3.getText().toString();
        String vary3 = editText4.getText().toString();
        String vary4 = editText5.getText().toString();
        String vary5 = editText6.getText().toString();
        String vary6 = editText7.getText().toString();

        int c = 0;

        if (vary.isEmpty()) {
            editText1.setError("This is a required field");
            c = 1;
        }
        else
        {
            editText1.setError(null);
        }


        if (vary1.isEmpty()) {
            editText2.setError("This is a required field");
            c = 1;

        }
        else
        {
            editText2.setError(null);
        }
        if (vary2.isEmpty()) {
            editText3.setError("This is a required field");
            c = 1;

        }
        else
        {
            editText3.setError(null);
        }

        if (vary3.isEmpty()) {
            editText4.setError("This is a required field");
            c = 1;

        }
        else
        {
            editText4.setError(null);
        }

        if (vary4.isEmpty()) {
            editText5.setError("This is a required field");
            c = 1;

        }
        else
        {
            editText5.setError(null);
        }

        if (vary5.isEmpty()) {
            editText6.setError("This is a required field");
            c = 1;

        }
        else
        {
            editText6.setError(null);
        }
        if (vary6.isEmpty()) {
            editText7.setError("This is a required field");
            c = 1;

        }
        else
        {
            editText7.setError(null);
        }
        if((vary2.length())!=10)
        {
            editText3.setError("Phone no.must be 10 digits");
            c=1;
        }
        else
        {
            editText3.setError(null);

        }



        if(c!=1){
            member.setName( vary);
            member.setDateofarrival( vary1);
            member.setPhonenumber(vary2);
            member.setEmail(vary3);
            member.setAadharno(vary4);
            member.setTotalmembers(vary5);
            member.setAge(vary6);
            reff.push().setValue(member);














            Intent intent = new Intent(this, orderActivity.class);
            String message = "Welcome" + ' ' + vary + "!!!" + "Your details have been successfully stored. Room No.102 is being alloted to you.";
            intent.putExtra(MSG, message);
            startActivity(intent);
        }
    }
}

