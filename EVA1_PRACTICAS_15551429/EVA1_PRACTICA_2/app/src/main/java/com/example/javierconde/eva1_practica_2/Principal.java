package com.example.javierconde.eva1_practica_2;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
EditText edAño;
RadioGroup rdgRegion;
RadioButton rdDesa;
RadioButton rdAme;
RadioButton rdAsia;
RadioButton rdAfrica;
RadioGroup rdgGenero;
RadioButton rdHom;
RadioButton rdMuj;
TextView txtExp;
TextView txtDesc;
RelativeLayout Lay;
Button bntP;
int iAño;
int iVida;
int iDes;
int iDif;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edAño = findViewById(R.id.edAño);
        rdgRegion = findViewById(R.id.rdgRegion);
        rdDesa = findViewById(R.id.rdDesa);
        rdAme = findViewById(R.id.rdAme);
        rdAsia = findViewById(R.id.rdAsia);
        rdAfrica = findViewById(R.id.rdAfrica);
        rdgGenero = findViewById(R.id.rdgGenero);
        rdHom = findViewById(R.id.rdHom);
        rdMuj = findViewById(R.id.rdMuj);
        txtExp = findViewById(R.id.txtExp);
        txtDesc = findViewById(R.id.txtDesc);
        Lay = findViewById(R.id.Lay);


        edAño.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String aux = s.toString();
                iAño = Integer.parseInt(edAño.getText().toString());
                iVida = iAño;
                iDes = iVida + iAño;
                txtExp.setText(Integer.toString(iVida));
                txtDesc.setText(Integer.toString(iDes));

            }
        });
        rdgRegion.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (rdDesa.isChecked()) {
                    if (iAño <= 1959) {
                        iVida = 75;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1969 && iAño >= 1960) {
                        iVida = 75;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1979 && iAño >= 1970) {
                        iVida = 80;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1989 && iAño >= 1980) {
                        iVida = 80;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1999 && iAño >= 1990) {
                        iVida = 85;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño >= 2000) {
                        iVida = 90;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    }
                }
                if (rdAme.isChecked()) {
                    if (iAño <= 1959) {
                        iVida = 60;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1969 && iAño >= 1960) {
                        iVida = 65;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1979 && iAño >= 1970) {
                        iVida = 70;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1989 && iAño >= 1980) {
                        iVida = 75;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1999 && iAño >= 1990) {
                        iVida = 75;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño >= 2000) {
                        iVida = 70;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    }
                }
                if (rdAsia.isChecked()) {
                    if (iAño <= 1959) {
                        iVida = 45;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1969 && iAño >= 1960) {
                        iVida = 50;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1979 && iAño >= 1970) {
                        iVida = 65;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1989 && iAño >= 1980) {
                        iVida = 65;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1999 && iAño >= 1990) {
                        iVida = 60;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño >= 2000) {
                        iVida = 65;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    }
                }
                if (rdAfrica.isChecked()) {
                    if (iAño <= 1959) {
                        iVida = 35;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1969 && iAño >= 1960) {
                        iVida = 45;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1979 && iAño >= 1970) {
                        iVida = 55;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1989 && iAño >= 1980) {
                        iVida = 60;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño <= 1999 && iAño >= 1990) {
                        iVida = 55;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    } else if (iAño >= 2000) {
                        iVida = 60;
                        iDes = iVida + iAño;
                        txtExp.setText(Integer.toString(iVida) + " AÑOS");
                        txtDesc.setText(Integer.toString(iDes));
                    }
                }
            }
        });
        rdgGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rdHom.isChecked()){
                    if (iAño <= 1959) {
                        iDif = iDes - 10;
                    } else if (iAño <= 1969 && iAño >= 1960) {
                        iDif = iDes - 9;
                    } else if (iAño <= 1979 && iAño >= 1970) {
                        iDif = iDes - 8;
                    } else if (iAño <= 1989 && iAño >= 1980) {
                        iDif = iDes - 7;
                    } else if (iAño <= 1999 && iAño >= 1990) {
                        iDif = iDes - 6;
                    } else if (iAño >= 2000) {
                        iDif = iDes - 4;
                    }
                    txtExp.setText(Integer.toString(iVida) + " AÑOS");
                    txtDesc.setText(Integer.toString(iDif));
                }else if(rdMuj.isChecked()){
                    if (iAño <= 1959) {
                        iDif = iVida + 10;
                    } else if (iAño <= 1969 && iAño >= 1960) {
                        iDif = iVida + 9;
                    } else if (iAño <= 1979 && iAño >= 1970) {
                        iDif = iVida + 8;
                    } else if (iAño <= 1989 && iAño >= 1980) {
                        iDif = iVida + 7;
                    } else if (iAño <= 1999 && iAño >= 1990) {
                        iDif = iVida + 6;
                    } else if (iAño >= 2000) {
                        iDif = iVida + 4;
                    }
                    txtExp.setText(Integer.toString(iDif) + " AÑOS");
                    txtDesc.setText(Integer.toString(iDes));
                }
            }
        });
    }
}
