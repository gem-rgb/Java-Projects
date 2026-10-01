package com.king.jazakikapu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * SignIn
 *
 * Part of Jaza-Kikapu.
 * Provides core application logic, lifecycle management, and UI component coordination.
 */
public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void signin(View view) {
        startActivity(new Intent(getApplicationContext(),Registration.class));
    }
}
