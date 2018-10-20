package com.farmhouse.farmhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class profile extends AppCompatActivity {

    Button button_logout;
    public void editprofile(View v)
    {

        Intent i = new Intent(profile.this,editprofile.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        button_logout = (Button) findViewById(R.id.button_logout);





    }
}
