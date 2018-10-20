package com.farmhouse.farmhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    public void addl(View v)
    {

        Intent i = new Intent(home.this,Add.class);
        startActivity(i);
    }



    Button button_add,button_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




    }
}
