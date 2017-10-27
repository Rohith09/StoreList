package com.example.chandrassekhar.storelist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class after_login extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_login);
        init();
    }

    public  void init() {
        b1=(Button)findViewById(R.id.button6);  //getlist
        b2=(Button)findViewById(R.id.button5);  //add
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button6:
                Intent i = new Intent(this,MainActivity3.class);
                startActivity(i);
                finish();
                break;
            case R.id.button5:
                Intent xyz = new Intent(this,MainActivity2.class);
                startActivity(xyz);
                finish();
                break;



        }

    }
}