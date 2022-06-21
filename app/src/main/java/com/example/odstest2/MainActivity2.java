package com.example.odstest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button test1,test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        test1=findViewById(R.id.test_btn1);
        test2=findViewById(R.id.test_btn2);

        test1.setOnClickListener(this);
        test2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {

            case R.id.test_btn1:
                //Function
                break;
            case R.id.test_btn2:
                break;
        }

    }
}