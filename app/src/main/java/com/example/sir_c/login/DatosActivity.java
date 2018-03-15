package com.example.sir_c.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DatosActivity extends Activity {

    String strDato ="";
    TextView txvDato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        txvDato = (TextView)findViewById(R.id.txvDato);

        //leemos el dato que paso la actividad
        Bundle extras = getIntent().getExtras();
        strDato = extras.getString("strNombre");

        if(strDato.length()>0){
            txvDato.setText(strDato);
        }



    }
}
