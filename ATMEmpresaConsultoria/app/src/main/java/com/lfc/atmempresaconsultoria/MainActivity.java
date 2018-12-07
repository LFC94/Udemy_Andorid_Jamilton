package com.lfc.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView imageView_Empresa, imageView_Cliente, imageView_Servico, imageView_Contato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_Empresa = (ImageView) findViewById(R.id.image_Empresa);
        imageView_Empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        imageView_Cliente = (ImageView) findViewById(R.id.image_Cliente);
        imageView_Cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        imageView_Contato = (ImageView) findViewById(R.id.image_Contato);
        imageView_Contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });

        imageView_Servico = (ImageView) findViewById(R.id.image_Servico);
        imageView_Servico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }
        });
    }
}
