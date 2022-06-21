package com.example.odstest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Screen2Activity extends AppCompatActivity {

    TextView textView;
    String txtStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        textView=findViewById(R.id.display_txt);

        txtStr=getIntent().getStringExtra("hello");

        textView.setText(""+txtStr);

    }
}