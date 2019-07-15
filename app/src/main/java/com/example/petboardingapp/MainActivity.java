package com.example.petboardingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    EditText etName, etDay, etDate;
    Spinner spnType;
    CheckBox cbVaccine;
    Button btn;

    private FirebaseFirestore firestore;
    private CollectionReference collection;
    private DocumentReference document;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.editTextName);
        etDay = findViewById(R.id.editTextDays);
        etDate = findViewById(R.id.editTextDate);
        spnType = findViewById(R.id.spinner);
        cbVaccine = findViewById(R.id.checkBox);
        btn = findViewById(R.id.buttonSend);




    }
}
