package com.example.javierconde.eva1_6_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    TextView txtVwMostrar;
    ListView lstVwDatos;

    final String [] sResta = {"La calesa"
            ,"Montados la junta"
            ,"Charly's"
            , "La cabaña del catarro"
            , "Smoke house"
            , "Tortas piolin"
            ,"La buena vida"
            , "La cafe"
            , "Sr. Camaron"
            ,"Chilis"
            ,"Apple bees"
            , "La mansion"
            , "El escuadron"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwMostrar = findViewById(R.id.txtVwMostrar);
        lstVwDatos = findViewById(R.id.lstVwDatos);
        //Necesitamos asignar un adaptador
        //Es un intermediario para el origen de los datos
        lstVwDatos.setAdapter(
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, sResta)
        );
        lstVwDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtVwMostrar.setText(sResta[position]);
    }
}
