package com.example.juanacastro.foodoclock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.juanacastro.foodoclock.view.ProfileActivity;
import com.example.juanacastro.foodoclock.view.RegisterActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }



    public void crateAccount (View view){

        Intent intent= new Intent(this, RegisterActivity.class);
        startActivity(intent);

    }

    public void loginAccount (View view){

        Intent intent= new Intent(this, ProfileActivity.class);
        startActivity(intent);

    }


}
