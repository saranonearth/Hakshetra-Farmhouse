package com.farmhouse.farmhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {


    public void login(View v)
    {

        Intent i = new Intent(signup.this,login.class);
        startActivity(i);
    }

    private EditText editTextEmail,editTextPassword;
    private Button button_signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        button_signup = (Button) findViewById(R.id.button_signup);

        button_signup.setOnClickListener(new );



    }
}
