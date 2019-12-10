package com.example.balticseahack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    /*public static final String APP_PREFERENCES = "mydata";
    public static final String APP_PREFERENCES_NAME = "Nickname"; // имя пользователя
    public static final String APP_PREFERENCES_AGE = "Password"; // пароль пользователя*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        /*SharedPreferences shPr;

        shPr = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);*/


        final EditText login_view = (EditText)findViewById(R.id.login);
        final EditText password_view = (EditText)findViewById(R.id.password);
        Button log_butt = (Button)findViewById(R.id.log_butt);

        log_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = password_view.getText().toString();
                String log = login_view.getText().toString();
                if(log.equals("Alex") && pass.equals("12341234")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

}
