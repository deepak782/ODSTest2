package com.example.odstest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    Button submitBtn;
    EditText nameEdt,mailEdt,mobileEdt;
    String nameStr,mailStr,mobileStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitBtn=findViewById(R.id.submit_btn);
        nameEdt=findViewById(R.id.name_edt);
        mailEdt=findViewById(R.id.mail_edt);
        mobileEdt=findViewById(R.id.mobile_edt);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Converting Edit Text Value to String
                nameStr=nameEdt.getText().toString();
                mailStr=mailEdt.getText().toString();
                mobileStr=mobileEdt.getText().toString();

                if(TextUtils.isEmpty(nameStr))
                {
                    nameEdt.setError("Enter Name");
                }else  if(TextUtils.isEmpty(mailStr))
                {
                    mailEdt.setError("Enter Mail");
                }
                else if(TextUtils.isEmpty(mobileStr))
                {
                    mobileEdt.setError("Enter Mobile");
                }
                else  if(mobileStr.length()<10)
                {
                    mobileEdt.setError("Enter 10 Digit Mobile Number");
                }
                else
                {
                    Toast.makeText(MainActivity.this, ""+nameStr+"\n"+mailStr+"\n"+mobileStr, Toast.LENGTH_SHORT).show();

                }



            }
        });
    }

    private boolean isValidEmailId(String email){

        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1,}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(email).matches();
    }

    /*
    * if(nameStr.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Name", Toast.LENGTH_SHORT).show();
                }
                else  if(mailStr.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Mail", Toast.LENGTH_SHORT).show();

                }
                else  if(isValidEmailId(mailStr))
                {
                    Toast.makeText(getApplicationContext(), "Valid Email Address.", Toast.LENGTH_SHORT).show();

                }
                else  if(mobileStr.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Mobile", Toast.LENGTH_SHORT).show();

                }
                else  if(mobileStr.length()<10)
                {
                    Toast.makeText(MainActivity.this, "Enter 10 digit Mobile number", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this, ""+nameStr+"\n"+mailStr+"\n"+mobileStr, Toast.LENGTH_SHORT).show();

                }*/
}