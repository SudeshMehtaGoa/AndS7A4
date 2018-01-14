package com.example.mehta.loginintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txtEmail;
    EditText txtPassword;
    Button btnLogin;

    static final String LOGIN_EMAIL="LOGIN_EMAIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtEmail = (EditText)findViewById(R.id.txtEmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin =(Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String strEmail= txtEmail.getText().toString();
                String strPassword = txtPassword.getText().toString();

                /* Open LoginSuccess Activity by passing User input Email if value matches  else inform user of wrong input*/
                if(strEmail.equalsIgnoreCase("sudesh@gmail.com") && strPassword.equalsIgnoreCase("asdf1234")){
                    Intent i = new Intent(LoginActivity.this,LoginSuccess.class);
                    i.putExtra(LOGIN_EMAIL,strEmail);
                    startActivity(i);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Incorrect UserName/Password", Toast.LENGTH_SHORT).show();
                    txtEmail.setText("");
                    txtPassword.setText("");
                }
            }
        });
    }
}
