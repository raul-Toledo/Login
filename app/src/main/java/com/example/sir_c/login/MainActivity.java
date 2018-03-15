package com.example.sir_c.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    ImageButton ibtnValidar, ibtnPasar;
    EditText edtNombre, edtValidar;
    TextView txvResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibtnPasar = (ImageButton)findViewById(R.id.ibtnGato);
        ibtnValidar = (ImageButton)findViewById(R.id.ibtnDatos);
        edtNombre = (EditText)findViewById(R.id.edtNombre);
        edtValidar = (EditText)findViewById(R.id.edtValidar);
        txvResul = (TextView)findViewById(R.id.txvResul);

        ibtnPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPasar = new Intent(getApplicationContext(),
                        DatosActivity.class);
                iPasar.putExtra("strNombre",
                        edtNombre.getText().toString());
                startActivity(iPasar);
            }
        });







        ibtnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iValidar = new Intent(getApplicationContext(),
                        ValidarActivity.class);

                iValidar.putExtra("strPass",
                        edtValidar.getText().toString());

                startActivityForResult(iValidar, 1234);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1234 && resultCode==RESULT_OK) {
            txvResul.setText(data.getExtras().getString("strOk"));
        }
    }
}
