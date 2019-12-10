package com.example.balticseahack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class RegActivity extends AppCompatActivity {

    public static final String APP_PREFERENCES = "mydata";
    public static final String APP_PREFERENCES_NAME = "Nickname"; // имя пользователя
    public static final String APP_PREFERENCES_AGE = "Password"; // пароль пользователя

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        SharedPreferences shPr;

        shPr = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);



    }
}
