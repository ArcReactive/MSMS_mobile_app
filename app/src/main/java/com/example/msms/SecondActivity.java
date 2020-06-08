package com.example.msms;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        final Button patientsBtn = (Button)findViewById(R.id.btnPatients);
        Button logoutBtn = (Button)findViewById(R.id.btnLogout);
        Button medicineBtn = (Button)findViewById(R.id.btnMedicine);
        Button statisticsBtn = (Button)findViewById(R.id.btnStatistics);
        Button stuffBtn = (Button)findViewById(R.id.btnStuff);
        Button helpBtn = (Button)findViewById(R.id.btnHelp);
        final Button aboutBtn = (Button)findViewById(R.id.btnAbout);

        patientsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent patientsIntent = new Intent(getApplicationContext(), PatientsActivity.class);
                startActivity(patientsIntent);
            }
        });

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logoutHomeIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(logoutHomeIntent);
            }
        });

        medicineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent medicineHomeIntent = new Intent(getApplicationContext(), MedicalActivity.class);
                startActivity(medicineHomeIntent);
            }
        });

        statisticsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent statistisHomeIntent = new Intent(getApplicationContext(), StatisticsActivity.class);
                startActivity(statistisHomeIntent);
            }
        });

        stuffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stuffHomeIntent = new Intent(getApplicationContext(), StuffActivity.class);
                startActivity(stuffHomeIntent);
            }
        });

        helpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpHomeIntent = new Intent(getApplicationContext(), HelpActivity.class);
                startActivity(helpHomeIntent);
            }
        });

        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(getApplicationContext(), AboutUsActivity.class);
                startActivity(aboutIntent);
            }
        });
    }


}
