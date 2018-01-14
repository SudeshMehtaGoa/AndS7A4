package com.example.mehta.loginintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginSuccess extends AppCompatActivity {

    TextView lblMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        Intent comIntent = getIntent();
        String strEmail = comIntent.getStringExtra(LoginActivity.LOGIN_EMAIL);
        lblMessage = (TextView) findViewById(R.id.lblMessage);

        lblMessage.setText("Welcome : " + strEmail);

    }
}
