package com.example.msms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class AddMedicineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);

        final EditText txt1 = (EditText)findViewById(R.id.txtIDM),
                txt2 = (EditText)findViewById(R.id.txtNameM),
                txt3 = (EditText)findViewById(R.id.txtQtyM),
                txt4 = (EditText)findViewById(R.id.txtExpiryM),
                txt5 = (EditText)findViewById(R.id.txtAddDateM),
                txt6 = (EditText)findViewById(R.id.txtNotesM);

        final RadioButton rd1 = (RadioButton)findViewById(R.id.radioButton4),
                rd2 = (RadioButton)findViewById(R.id.radioButton5);

        Button resetBtn = (Button)findViewById(R.id.btnResetM);

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");

                rd1.setChecked(false);
                rd2.setChecked(false);
            }
        });
    }
}
