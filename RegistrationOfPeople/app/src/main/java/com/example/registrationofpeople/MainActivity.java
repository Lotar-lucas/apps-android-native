package com.example.registrationofpeople;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import model.Registration;
import model.RegistrationDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = (EditText)findViewById(R.id.name);
        EditText socialName = (EditText)findViewById(R.id.socialName);
        EditText genre = (EditText)findViewById(R.id.genre);
        EditText fatherName = (EditText)findViewById(R.id.fatherName);
        EditText motherName = (EditText)findViewById(R.id.motherName);
        EditText income = (EditText)findViewById(R.id.income);

        Button buttonRegister = (Button)findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registration registration = new Registration(name.getText().toString(),
                        socialName.getText().toString(),
                        genre.getText().toString(),
                        fatherName.getText().toString(),
                        motherName.getText().toString(),
                        income.getText().toString()
                );

                RegistrationDao dao = new RegistrationDao(getBaseContext());
                if (dao.save(registration) ) {
                    Toast.makeText(getBaseContext(), "Registro realizado", Toast.LENGTH_SHORT);
                    finish();
                } else {
                    Toast.makeText(getBaseContext(), "Falha no registro", Toast.LENGTH_SHORT);
                }

            }
        });
    }
}