package com.example.louayeldin.chillbuzz_demo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity implements View.OnClickListener{

    TextView signup;
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        signup = (TextView)findViewById(R.id.click_here);
        signin = (Button)findViewById(R.id.signin_btn);

        signup.setOnClickListener(this);
        signin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.click_here:
                Intent intent = new Intent(SigninActivity.this,SignupActivity.class );
                startActivity(intent);
                break;

            case R.id.signin_btn:
                Intent intent1 = new Intent(SigninActivity.this,ChooseLocation.class);
                Toast.makeText(getApplicationContext(),"Signed in", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
                break;
        }
    }
}
