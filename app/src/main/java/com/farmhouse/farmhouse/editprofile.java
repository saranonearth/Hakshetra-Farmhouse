package com.farmhouse.farmhouse;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class editprofile extends AppCompatActivity {


    private static final int CHOOSE_IMAGE =101;
    EditText editTextName, editTextPhone;
    ImageView imageview;
    Button button_save;
    Uri profileimage;

    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthstatelistener;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        imageview = (ImageView) findViewById(R.id.editprofilepicture);
        button_save = (Button) findViewById(R.id.button_save);

        button_save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
            String userid = mAuth.getCurrentUser().getUid();
            DatabaseReference current = FirebaseDatabase.getInstance().getReference().child("Users").child(userid);
            Map newpost = new HashMap();
            newpost.put("Name",name);

            current.setValue(newpost);
                Toast.makeText(editprofile.this, "Success", Toast.LENGTH_SHORT).show();


            }
        });

    }


}

