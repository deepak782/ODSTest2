package com.example.odstest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Screen1Activity extends AppCompatActivity {

    EditText name;
    String nameStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        name=findViewById(R.id.name);
    }

    public void screen2(View view) {

        nameStr=name.getText().toString();

       // startActivity(new Intent(Screen1Activity.this,Screen2Activity.class));

        Intent intent=new Intent(Screen1Activity.this,Screen2Activity.class);
        intent.putExtra("hello",nameStr);
        startActivity(intent);
    }
}