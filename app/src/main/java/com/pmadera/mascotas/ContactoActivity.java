package com.pmadera.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class ContactoActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etCorreoPara;
    private EditText etMensaje;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Toolbar miActionBar=(Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        etNombre=(EditText)findViewById(R.id.etNombre);
        etCorreoPara=(EditText)findViewById((R.id.etCorreoPara));
        etMensaje=(EditText)findViewById(R.id.etMensaje);
        btnEnviar=(Button)findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {


                    Toast.makeText(getApplicationContext(),"NO FUNCIONA LA LIBRERIA, PROBLEMAS DE PERMISOS", Toast.LENGTH_SHORT).show();

                }
                catch (Exception ex){
                    Toast.makeText(getApplicationContext(),ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}