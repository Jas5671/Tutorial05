package com.example.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class Registration extends AppCompatActivity {
    Button btnRegister;
    EditText edtName;
    EditText edtlname;
    EditText edtemail;
    EditText edtpswd;
    Switch swhBranch;
    Spinner spnCountries;
    CheckBox chckStatus;
    RadioGroup rdgrp;
    RadioButton rdgender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        edtName = findViewById(R.id.edtName);
        edtlname = findViewById(R.id.edtlname);
        edtemail = findViewById(R.id.edtemail);
        edtpswd = findViewById(R.id.edtpswd);
        swhBranch = findViewById(R.id.swhBranch);
        spnCountries = findViewById(R.id.spnCountries);
        chckStatus= findViewById(R.id.chckStatus);
        rdgrp= findViewById(R.id.rdgrp);
        btnRegister = findViewById(R.id.btnRegister);
btnRegister.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int id = rdgrp.getCheckedRadioButtonId();
        rdgender = findViewById(id);
        String firstname = edtName.getText().toString();
        String lastname = edtlname.getText().toString();
        String username = edtemail.getText().toString();
        String password = edtpswd.getText().toString();
        String country = spnCountries.getSelectedItem().toString();
        String status = "";
        String branch = "";
        String gender = rdgender.getText().toString();
        if (swhBranch.isChecked()) {
            branch = swhBranch.getTextOn().toString();
        } else {
            branch = swhBranch.getTextOff().toString();
        }
        if (chckStatus.isChecked()) {
            status = "Active";
        } else {
            status = "Inactive";
        }

        Intent i = new Intent(Registration.this, MainActivity.class);
        i.putExtra("firstname", firstname);
        i.putExtra("lastname", lastname);
        i.putExtra("username", username);
        i.putExtra("password", password);
        i.putExtra("country", country);
        i.putExtra("status", status);
        i.putExtra("branch", branch);
        i.putExtra("gender", gender);
        startActivity(i);
    }
});

    }
}