package com.lfc.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends Activity {

    ImageView imageView_Moeda, imageView_Voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);
        Bundle bundle = getIntent().getExtras();


        imageView_Moeda = (ImageView) findViewById(R.id.imageView_moeda);
        if (bundle != null){
            String opcao = bundle.getString("opcao");

            if (opcao.equalsIgnoreCase("cara")) {
                imageView_Moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                imageView_Moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }




        imageView_Voltar = (ImageView) findViewById(R.id.imageView_voltar);
        imageView_Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class));
            }
        });





    }
}
