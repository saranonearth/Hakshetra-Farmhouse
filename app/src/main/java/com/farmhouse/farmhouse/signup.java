package com.farmhouse.farmhouse;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signup extends AppCompatActivity {


    public void login(View v)
    {

        Intent i = new Intent(signup.this,login.class);
        startActivity(i);
    }

    private EditText editTextEmail,editTextPassword;
    private Button button_signup;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mAuth = FirebaseAuth.getInstance();

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        button_signup = (Button) findViewById(R.id.button_signup);

        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email=editTextEmail.getText().toString();
                String password= editTextPassword.getText().toString();

                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            startActivity(new Intent(signup.this, home.class));
                            finish();
                        }
                        if(!task.isSuccessful()){
                            Toast.makeText(signup.this, "Signup Error", Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }
        });




    }

}
