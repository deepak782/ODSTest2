package com.example.odstest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AActivity extends AppCompatActivity {


    String actname=" Activity A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Toast.makeText(this, "onCreate in "+actname, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart in "+actname, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume in "+actname, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause in "+actname, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop in "+actname, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy in "+actname, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart in "+actname, Toast.LENGTH_SHORT).show();

    }

    /*@Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "Hello back", Toast.LENGTH_SHORT).show();
    }*/

    public void next(View view) {
        startActivity(new Intent(AActivity.this,BActivity.class));
        finish();
    }
}