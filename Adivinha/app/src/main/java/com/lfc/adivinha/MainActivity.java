package com.lfc.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botao_jogar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao_jogar = (Button) findViewById(R.id.button_jogar);
        resultado = (TextView) findViewById(R.id.resultadoid);

        resultado.setText("Texto Alterado");

        botao_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int numero = random.nextInt(10);
                resultado.setText("Numero escolido : " + numero);
            }
        });


    }


}
