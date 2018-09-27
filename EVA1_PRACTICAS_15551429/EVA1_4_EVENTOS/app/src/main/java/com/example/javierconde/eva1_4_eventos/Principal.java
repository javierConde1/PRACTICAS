package com.example.javierconde.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener{
//creamos un listener (objeto que escucha eventos)
    TextView txtVwMensa; // Este objeto
                        //Se vincula al widget
    Button btnInterfaz;
    Button btnClaseAnonima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Buscamos el widget en el indice R y vinculamos
        txtVwMensa = findViewById(R.id.txtVwMensa);
        btnInterfaz = findViewById(R.id.btnInterfaz);
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);

        //vinculando, se puede usar el objeto
        txtVwMensa.setText("Hola mundo");
        final Context cntAPP = getApplicationContext();
        btnInterfaz.setOnClickListener(this);//asignamos el

        //CREAR EL EVENTO POR CLASE ANONIMA
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cntAPP, " Evento por clase anonima",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void MiClick(View v){
        Toast.makeText(this,"Hola mundo!!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Hola cruel POR INTERFAZ", Toast.LENGTH_LONG).show();
    }
}
