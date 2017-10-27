package com.example.chandrassekhar.storelist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    Button but1,but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
    }

    private void init() {
        but1 = (Button)findViewById(R.id.button4);  //low to high.
        but2 = (Button)findViewById(R.id.button3);  //high to low.
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {

            case R.id.button4:
                Intent i= new Intent(this,MainActivity4.class);
                startActivity(i);
                break;

            case R.id.button3:
                Intent i2= new Intent(this,MainActivity5.class);
                startActivity(i2);
                break;

        }

    }
}