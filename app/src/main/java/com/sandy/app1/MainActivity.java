package com.sandy.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
// day 01 activity kearning the basics
    public void onBtnclick(View view){

        TextView first = findViewById(R.id.fname);
        TextView last = findViewById(R.id.lname);
        TextView surname = findViewById(R.id.sname);

        EditText fname = findViewById(R.id.FirstName);
        EditText lname = findViewById(R.id.Latname);
        EditText sname = findViewById(R.id.Surname);




        first.setText("FirstName" + fname.getText().toString());
        last.setText("FirstName" + lname.getText().toString());
        surname.setText("FirstName" + sname.getText().toString());


    }
}