package com.example.chandrassekhar.storelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        but=(Button)findViewById(R.id.button);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        Intent i=new Intent(this,after_login.class);
        startActivity(i);
       // finish(i);
       // finish();


    }
}
