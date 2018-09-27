package com.example.javierconde.eva1_13_practica_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class  Principal extends AppCompatActivity implements AdapterView.OnItemClickListener{
RadioGroup rdrProd;
RadioButton rdAmericano;
RadioButton rdCapu;
RadioButton rdExpreso;
EditText edTxCantidad;
CheckBox chbCrema;
CheckBox chbAzucar;
TextView txvDescrip;
Button btnTotal;
TextView txvTotal;
int iTotal;
int iCant;
int iExtra;
String sTipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdrProd = findViewById(R.id.rdrProd);
        rdAmericano = findViewById(R.id.rdAmericano);
        rdCapu = findViewById(R.id.rdCapu);
        rdExpreso = findViewById(R.id.rdExpreso);
        edTxCantidad =findViewById(R.id.edTxCantidad);
        chbCrema = findViewById(R.id.chbCrema);
        chbAzucar = findViewById(R.id.chbAzucar);
        txvDescrip = findViewById(R.id.txvDescrip);
        btnTotal = findViewById(R.id.btnTotal);
        txvTotal = findViewById(R.id.txvTotal);

        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCant = Integer.parseInt(edTxCantidad.getText().toString());

                if(rdAmericano.isChecked()){
                iTotal = 20;
                sTipo = "Americano";
            }else if(rdCapu.isChecked()){
                    iTotal = 48;
                    sTipo = "Capuccino";
                }else if(rdExpreso.isChecked()){
                    iTotal = 30;
                    sTipo = "Expreso";
                }
                iTotal = iTotal * iCant;
                if(chbCrema.isChecked()){
                    iTotal++;
                    sTipo = sTipo + ", Crema";
                }
                if(chbAzucar.isChecked()){
                    iTotal ++;
                    sTipo = sTipo + ", Azucar";
                }
                txvDescrip.setText(sTipo);
                Toast.makeText(Principal.this, ""+iTotal, Toast.LENGTH_SHORT).show();

            }
        });
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
