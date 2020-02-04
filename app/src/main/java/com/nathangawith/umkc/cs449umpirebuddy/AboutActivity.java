package com.nathangawith.umkc.cs449umpirebuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    // back button click event
    public void btnBackClick(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
