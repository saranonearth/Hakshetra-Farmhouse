package com.farmhouse.farmhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Add extends AppCompatActivity {

    public void addf(View view){
        Intent i = new Intent(Add.this, home.class);
                startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
}
