package com.example.nizam.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName,etEmail,etId,etPass,etPhone;
    Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_Name);
        etEmail = findViewById(R.id.et_Email);
        etId =findViewById(R.id.et_Id);
        etPass =findViewById(R.id.et_Pass);
        etPhone= findViewById(R.id.et_Phone);

        btnsubmit = findViewById(R.id.btn_Submit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,etName.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
}
