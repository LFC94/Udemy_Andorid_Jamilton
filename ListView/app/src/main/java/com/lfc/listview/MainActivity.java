package com.lfc.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView listView_Itens;
    String[] itens = {"Angras dos Reis", "Caldas Novas", "Campo do Jordão", "Costa dos Sauipe", "Ilheis", "Porto Seguro", "Rio de Janeiro", "Tiradentes", "Ouro Preto", "Mariana", "São Paulo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView_Itens = (ListView) findViewById(R.id.listView_Itens);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, android.R.id.text1,itens);

        listView_Itens.setAdapter(arrayAdapter);
        listView_Itens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), listView_Itens.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
