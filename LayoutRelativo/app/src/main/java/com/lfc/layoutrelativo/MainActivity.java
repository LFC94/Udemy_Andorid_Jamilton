package com.lfc.layoutrelativo;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button buttonMostrar;
    CheckBox checkBoxCao, checkBoxGato, checkBoxPapagaio;
    TextView textViewMostar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMostar = (TextView) findViewById(R.id.textView_mostar);
        checkBoxCao = (CheckBox) findViewById(R.id.checkBox_cao);
        checkBoxGato = (CheckBox) findViewById(R.id.checkBox_gato);
        checkBoxPapagaio = (CheckBox) findViewById(R.id.checkBox_papagaio);

        buttonMostrar = (Button)findViewById(R.id.button_Mostrar);
        buttonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itens= "";


                if(checkBoxGato.isChecked()){
                    itens += " Item :"+checkBoxGato.getText();
                }

                if(checkBoxCao.isChecked()){
                    itens += " Item :"+checkBoxCao.getText()+"";
                }

                if(checkBoxPapagaio.isChecked()){
                    itens += " Item :"+checkBoxPapagaio.getText();
                }

                textViewMostar.setText(itens);

            }
        });

    }
}
