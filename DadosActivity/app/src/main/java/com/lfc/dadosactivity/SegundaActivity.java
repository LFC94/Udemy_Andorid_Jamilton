package com.lfc.dadosactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {
    TextView textView_Texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textView_Texto = (TextView) findViewById(R.id.textView_Texto);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){

            String textoPassado = bundle.getString("nome");

            textView_Texto.setText(textoPassado);

        }
    }
}
