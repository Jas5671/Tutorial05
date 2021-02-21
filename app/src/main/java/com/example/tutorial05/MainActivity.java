package com.example.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtfname,txtlname,txtuname,txtpsw,txtcountry,txtstatus,txtbranch,txtgender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtfname = findViewById(R.id.txtfname);
        txtlname= findViewById(R.id. txtlname);
        txtuname = findViewById(R.id.txtuname);
        txtpsw = findViewById(R.id.txtpsw);
        txtcountry = findViewById(R.id.txtcountry);
        txtstatus = findViewById(R.id.txtstatus);
        txtbranch = findViewById(R.id.txtbranch);
        txtgender = findViewById(R.id.txtgender);

        Bundle bundle = getIntent().getExtras();
        String firstname = bundle.getString("firstname");
        String lastname = bundle.getString("lastname");
        String username = bundle.getString("username");
        String password = bundle.getString("password");
        String country = bundle.getString("country");
        String status = bundle.getString("status");
        String branch = bundle.getString("branch");
        String gender = bundle.getString("gender");


        txtfname.setText("First Name :"+firstname);
        txtlname.setText("Last Name :"+lastname);
        txtuname.setText("UserName :"+username);
        txtpsw.setText("Password :"+password);
        txtcountry.setText("Country :"+country);
        txtstatus.setText("Status :"+status);
        txtbranch.setText("Branch :"+branch);
        txtgender.setText("gender :"+gender);
    }
}