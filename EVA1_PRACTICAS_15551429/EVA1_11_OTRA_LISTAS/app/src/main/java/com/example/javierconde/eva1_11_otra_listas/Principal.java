package com.example.javierconde.eva1_11_otra_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
ListView lstTitu;
TextView txtMuestra;
    final String[] sObras = {
        "el quijote",
        "hamblet",
        "pepe y teo",
        "J.B. Crowling",
        "La divina comedia",
        "La Misma estrella",
        "Pedro paramo",
        "La muerte de un rui señor",
        "donde estan las rubias"
};
    final String[] sSinopsis = {
            "Don Quijote de la Mancha es una novela escrita por el español Miguel de Cervantes Saavedra. Publicada su primera parte con el título de El ingenioso hidalgo don Quijote de la Mancha a comienzos de 1605, es la obra más destacada de la literatura española y una de las principales de la literatura universal",
            "El Infierno es la primera de las tres cánticas de La Divina Comedia del poeta florentino Dante Alighieri. Los sucesivos cantos son el Purgatorio y el Paraíso. Está formada por 33 cantos, más uno de introducción, cada canto está subdividido en tercetos cuya rima está intercalad",
            "Don Quijote de la Mancha es una novela escrita por el español Miguel de Cervantes Saavedra. Publicada su primera parte con el título de El ingenioso hidalgo don Quijote de la Mancha a comienzos de 1605, es la obra más destacada de la literatura española y una de las principales de la literatura universal",
            "Harry Potter y la piedra filosofal, llamado también Harry Potter 1 o abreviado HP1, es el primer libro de la serie literaria Harry Potter, escrito por la autora británica J. K. Rowling en 1997, que supuso además el debut de Rowling como escritora profesional.",
            "El Infierno es la primera de las tres cánticas de La Divina Comedia del poeta florentino Dante Alighieri. Los sucesivos cantos son el Purgatorio y el Paraíso. Está formada por 33 cantos, más uno de introducción, cada canto está subdividido en tercetos cuya rima está intercalad",
            "Harry Potter y la piedra filosofal, llamado también Harry Potter 1 o abreviado HP1, es el primer libro de la serie literaria Harry Potter, escrito por la autora británica J. K. Rowling en 1997, que supuso además el debut de Rowling como escritora profesional.",
            "Don Quijote de la Mancha es una novela escrita por el español Miguel de Cervantes Saavedra. Publicada su primera parte con el título de El ingenioso hidalgo don Quijote de la Mancha a comienzos de 1605, es la obra más destacada de la literatura española y una de las principales de la literatura universal",
            "El Infierno es la primera de las tres cánticas de La Divina Comedia del poeta florentino Dante Alighieri. Los sucesivos cantos son el Purgatorio y el Paraíso. Está formada por 33 cantos, más uno de introducción, cada canto está subdividido en tercetos cuya rima está intercalad",
            "Harry Potter y la piedra filosofal, llamado también Harry Potter 1 o abreviado HP1, es el primer libro de la serie literaria Harry Potter, escrito por la autora británica J. K. Rowling en 1997, que supuso además el debut de Rowling como escritora profesional."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstTitu = findViewById(R.id.lstTitu);
        txtMuestra = findViewById(R.id.txtMuestra);
        lstTitu.setAdapter(
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_list_item_1,
                        sObras
                )
        );
        lstTitu.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
        txtMuestra.setText(sSinopsis[i]);
    }
}
