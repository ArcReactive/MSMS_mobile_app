package com.example.msms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegisterNewPatientsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_new_patients);

        final EditText txt1 = (EditText)findViewById(R.id.txtFNameP),
                txt2 = (EditText)findViewById(R.id.txtLNameP),
                txt3 = (EditText)findViewById(R.id.txtIDP),
                txt4 = (EditText)findViewById(R.id.txtNICP),
                txt5 = (EditText)findViewById(R.id.txtAddressP),
                txt6 = (EditText)findViewById(R.id.txtBatchP),
                txt7 = (EditText)findViewById(R.id.txtDOBP),
                txt8 = (EditText)findViewById(R.id.txtENoP),
                txt9 = (EditText)findViewById(R.id.txtMobileP);

        final RadioButton rd1 = (RadioButton)findViewById(R.id.radioButton7),
                rd2 = (RadioButton)findViewById(R.id.radioButton8),
                rd3 = (RadioButton)findViewById(R.id.radioButton9),
                rd4 = (RadioButton)findViewById(R.id.radioButton10),
                rd5 = (RadioButton)findViewById(R.id.radioButton11);

        Button resetBtn = (Button)findViewById(R.id.btnResetP);

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");
                txt7.setText("");
                txt8.setText("");
                txt9.setText("");

                rd1.setChecked(false);
                rd2.setChecked(false);
                rd3.setChecked(false);
                rd4.setChecked(false);
                rd5.setChecked(false);

            }
        });
    }
}
