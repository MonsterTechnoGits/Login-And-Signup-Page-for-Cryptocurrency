package com.monstertechno.btcauthpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
    }

    public void Finish(View view) {
        finish();
    }

    public void openLogInPage(View view) {
        startActivity(new Intent(this,LoginPage.class));
    }
}