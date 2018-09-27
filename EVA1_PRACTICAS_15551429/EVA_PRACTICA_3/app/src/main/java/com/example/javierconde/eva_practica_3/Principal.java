package com.example.javierconde.eva_practica_3;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;

public class Principal extends AppCompatActivity {
    EditText txtNombre;
    EditText txtApellido;
    EditText txtEdad;
    EditText txtOrganizacion;
    EditText txtCorreo;
    RadioGroup rdgGenero;
    RadioButton rdbHombre;
    RadioButton rdbMujer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtNombre= findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtEdad = findViewById(R.id.txtEdad);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtOrganizacion = findViewById(R.id.txtOrganizacion);
        rdgGenero = findViewById(R.id.rdgGenero);
        rdbHombre = findViewById(R.id.rdbHombre);
        rdbMujer = findViewById(R.id.rdbMujer);



    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @TargetApi(Build.VERSION_CODES.N)
    public void Click(View view) {
        if(!txtNombre.getText().toString().equals("") && !txtApellido.getText().toString().equals("") && !txtCorreo.getText().toString().equals("") && !txtEdad.getText().toString().equals("")&& !txtOrganizacion.getText().toString().equals("") &&  (rdbHombre.isChecked() || rdbMujer.isChecked())){
            String sVal = ClaseArrayList.ClaseArrayList.AgregarEnLista(txtCorreo.getText().toString());
            if(sVal.equals("Error")){

                Toast.makeText(this, "Correo existente", Toast.LENGTH_SHORT).show();
            }else {
                txtNombre.setText("");
                txtOrganizacion.setText("");
                txtEdad.setText("");
                txtCorreo.setText("");
                txtApellido.setText("");
                rdgGenero.clearCheck();
                Toast.makeText(this, "Total = " + sVal, Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Campos incompletos ", Toast.LENGTH_SHORT).show();
        }
    }
}

class ClaseArrayList {
    static ClaseArrayList ClaseArrayList = new ClaseArrayList();
    ArrayList<String> ArrayList = new ArrayList<String>();
    int iCont = -1;

    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(api = Build.VERSION_CODES.N)
    public String AgregarEnLista(String correo) {

        if (Buscar(correo) == false) {
            ArrayList.add(correo);
            iCont++;
            String sInfo = String.valueOf(ArrayList.size());

            return sInfo;
        }else {
            return "Error";
        }


    }
    public boolean Buscar(String correo) {
        String sVal;
        for (int i = 0; i <= iCont; i++) {
            sVal = ArrayList.get(i);
            if (sVal.equals(correo)) {
                return true;
            }
        }
        return false;
    }

}
