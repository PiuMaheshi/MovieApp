package com.example.movieapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.movieapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    private String username;
    private String password;

    @BindView(R.id.txtUsername)
    EditText txtUsername;

    @BindView(R.id.txtPassword)
    EditText txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    void login(){
        username = txtUsername.getText().toString();
        password = txtPassword.getText().toString();

        if(username.equals("admin") && password.equals("admin")){
            Intent i = new Intent(LoginActivity.this,HomeActivity.class);
            startActivity(i);
            finish();
        } else{
            Toast.makeText(getApplicationContext(),"Invalid Username or Password !!",Toast.LENGTH_SHORT).show();
        }
    }
}
