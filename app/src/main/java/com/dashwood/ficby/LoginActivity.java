package com.dashwood.ficby;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.dashwood.ficby.MainActivity.CIRCULAR_BOLD;
import static com.dashwood.ficby.MainActivity.CIRCULAR_BOOK;

public class LoginActivity extends AppCompatActivity {

    //TextView app_logo;
    Button login, forget, sign_up;
    EditText input_mail, input_password;
    Typeface typeface_bold, typeface_regular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        typeface_bold = Typeface.createFromAsset(getAssets(), CIRCULAR_BOLD);
        typeface_regular = Typeface.createFromAsset(getAssets(), CIRCULAR_BOOK);

        /*app_logo = (TextView) findViewById(R.id.app_logo);
        app_logo.setTypeface(typeface_bold);*/

        input_mail = (EditText) findViewById(R.id.email_input);
        input_mail.setTypeface(typeface_regular);
        input_password = (EditText) findViewById(R.id.password_input);
        input_password.setTypeface(typeface_regular);

        login = (Button) findViewById(R.id.btn_login);
        forget = (Button) findViewById(R.id.btn_forget);
        sign_up = (Button) findViewById(R.id.btn_signup);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
            }
        });

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ForgetPasswordActivity.class));
            }
        });


    }
}
