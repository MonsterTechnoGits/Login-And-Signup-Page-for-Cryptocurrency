package com.monstertechno.btcauthpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSignUpPage(View view) {
        startActivity(new Intent(this,SignupPage.class));
    }

    public void openLogInPage(View view) {
        startActivity(new Intent(this,LoginPage.class));
    }
}