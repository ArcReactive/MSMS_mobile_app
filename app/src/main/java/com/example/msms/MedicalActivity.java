package com.example.msms;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicalActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        Button addMedicineBtn = (Button)findViewById(R.id.btnAddMedicine);
        Button viewMedicineBtn = (Button)findViewById(R.id.btnViewMedicine);
        Button dispenseMedicineBtn = (Button)findViewById(R.id.btnDispenseMedicine);

        addMedicineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addMedicineIntent = new Intent(getApplicationContext(), AddMedicineActivity.class);
                startActivity(addMedicineIntent);
            }
        });

        viewMedicineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewMedicineIntent = new Intent(getApplicationContext(), ViewMedicineActivity.class);
                startActivity(viewMedicineIntent);
            }
        });

        dispenseMedicineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dispenseMedicineIntent = new Intent(getApplicationContext(), DispenseMedicineActivity.class);
                startActivity(dispenseMedicineIntent);
            }
        });


    }
}
