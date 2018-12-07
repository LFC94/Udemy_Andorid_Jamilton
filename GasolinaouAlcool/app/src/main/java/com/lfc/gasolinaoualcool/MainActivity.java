package com.lfc.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText_PrecoAlcool, editText_PrecoGasolina;
    Button button_Veriricar;
    TextView textView_Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_PrecoAlcool = (EditText) findViewById(R.id.editText_PrecoAlcool);
        editText_PrecoGasolina = (EditText) findViewById(R.id.editText_PrecoGasolina);
        textView_Resultado = (TextView)findViewById(R.id.textView_Resultado);
        button_Veriricar = (Button) findViewById(R.id.button_Verificar);
        button_Veriricar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sAlcool = editText_PrecoAlcool.getText().toString(), sGasolina = editText_PrecoGasolina.getText().toString();
                double fAlcool = Double.parseDouble(sAlcool), fGasolina = Double.parseDouble(sGasolina);

                double valor = fAlcool / fGasolina;

                if (valor >= 0.7) {
                    textView_Resultado.setText("E melhor Utilizar Gasolina.");
                } else {
                    textView_Resultado.setText("E melhor Utilizar Alcool.");
                }

            }
        });




    }
}
