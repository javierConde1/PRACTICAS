package com.example.javierconde.eva1_5_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup rdGrpOpciones;
    RadioButton rdTacos;
    RadioButton rdChiles;
    RadioButton rdMontados;
    RadioButton rdTamales;
    RadioButton rdTortas;
    String sMensa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdGrpOpciones = findViewById(R.id.rdGrpOpciones);
        rdTacos = findViewById(R.id.rdTacos);
        rdChiles = findViewById(R.id.rdChiles);
        rdMontados = findViewById(R.id.rdMontados);
        rdTamales = findViewById(R.id.rdTamales);
        rdTortas = findViewById(R.id.rdTortas);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (1){
            case R.id.rdTacos:
                sMensa = "Tacos";
            case R.id.rdChiles:
                sMensa = "Chiles rellenos";
            case R.id.rdMontados:
                sMensa = "Montados";
            case R.id.rdTamales:
                sMensa = "Tamales";
            case R.id.rdTortas:
                sMensa = "Tortas";
        }
        Toast.makeText(Principal.this, "" + sMensa, Toast.LENGTH_SHORT).show();
    }


}
