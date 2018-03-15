package com.example.sir_c.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ValidarActivity extends AppCompatActivity {

    String strPass="", strValidar="";
    Boolean bandera= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar);

        //Leemos el resource para la clave
        strPass = getString(R.string.strClave);

        //leemos el dato que paso la actividad
        Bundle extras = getIntent().getExtras();
        strValidar = extras.getString("strPass");

        if(strPass.equals(strValidar)){
            bandera = true;
        }

        Intent iValidar = new Intent();
        if (bandera){
            iValidar.putExtra("strOk","OK");
        }else{
            iValidar.putExtra("strOk","NO");
        }
        setResult(RESULT_OK, iValidar);
        finish();

    }
}
