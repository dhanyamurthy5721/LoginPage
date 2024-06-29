package com.example.dhanyatest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText emailEditText,passwordEditText;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailEditText=findViewById(R.id.emailEditText);
        passwordEditText=findViewById(R.id.passwordEditText);
        loginBtn=findViewById(R.id.loginBtn);
        String registeredEmail=getIntent().getStringExtra("email");
        String registeredPassword=getIntent().getStringExtra("password");
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=emailEditText.getText().toString();
                String password=passwordEditText.getText().toString();
                if(registeredEmail.equals(email)&&registeredPassword.equals(password)){
                    Intent intent=new Intent(LoginActivity.this,LoginSucessActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
