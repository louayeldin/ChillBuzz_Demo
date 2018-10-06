package com.example.louayeldin.chillbuzz_demo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    Button signup_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        signup_btn = (Button)findViewById(R.id.signup_btn);
        signup_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(SignupActivity.this, SigninActivity.class);
        Toast.makeText(getApplicationContext(),"Successfully registered", Toast.LENGTH_SHORT).show();
        startActivity(intent);
        finish();
    }
}
