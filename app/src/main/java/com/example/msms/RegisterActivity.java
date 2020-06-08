package com.example.msms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText txt1 = (EditText)findViewById(R.id.txtEmpid),
                txt2 = (EditText)findViewById(R.id.txtEmpName),
                txt3 = (EditText)findViewById(R.id.txtUserName),
                txt4 = (EditText)findViewById(R.id.txtPassword),
                txt5 = (EditText)findViewById(R.id.txtPassword2);

        final RadioButton rd1 = (RadioButton)findViewById(R.id.radioButton),
                rd2 = (RadioButton)findViewById(R.id.radioButton2),
                re3 = (RadioButton)findViewById(R.id.radioButton3);

        Button signupBtn = (Button)findViewById(R.id.btnSignup),
                resetBtn = (Button)findViewById(R.id.btnResetR);

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(signupIntent);
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");

                rd1.setChecked(false);
                rd2.setChecked(false);
            }
        });

    }
}
