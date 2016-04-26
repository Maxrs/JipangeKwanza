package com.example.machera.jipangekwanza.Packagesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.machera.jipangekwanza.R;

@SuppressWarnings("ALL")
public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);

        final Button btLogin = (Button) findViewById(R.id.btLogin);
        final TextView tvSignin = (TextView) findViewById(R.id.tvSignin);

        tvSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sign = new Intent(Login.this, signinActivity.class);
                Login.this.startActivity(sign);
            }
        });
    }
}
