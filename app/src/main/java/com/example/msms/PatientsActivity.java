package com.example.msms;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientsActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        Button viewPatientsBtn = (Button)findViewById(R.id.btnViewPatients);
        Button registerNewPaBtn = (Button)findViewById(R.id.btnRegisterNewPatients);

        viewPatientsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewPatientsIntent = new Intent(getApplicationContext(), ViewPatientsActivity.class);
                startActivity(viewPatientsIntent);
            }
        });

        registerNewPaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerNewPaIntent = new Intent(getApplicationContext(), RegisterNewPatientsActivity.class);
                startActivity(registerNewPaIntent);
            }
        });





    }
}
