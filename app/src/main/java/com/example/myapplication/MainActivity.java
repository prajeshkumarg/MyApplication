package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button Hello,Micro,Stud,Tech,Comm;
    String b1 = "Hello";
    String b2 = "Microsoft";
    String b3 = "Student";
    String b4 = "Technical";
    String b5 = "Community";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hello= (Button)findViewById(R.id.buttonId);
        Hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),b1,Toast.LENGTH_SHORT).show();
            }
        }
        );
        Micro= (Button)findViewById(R.id.button3);
        Micro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),b2,Toast.LENGTH_SHORT).show();
            }
        });
        Stud= (Button)findViewById(R.id.button4);
        Stud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),b3,Toast.LENGTH_SHORT).show();
            }
        });
        Tech= (Button)findViewById(R.id.button5);
        Tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),b4,Toast.LENGTH_SHORT).show();
            }
        });
        Comm= (Button) findViewById(R.id.button6);
        Comm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),b5,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
