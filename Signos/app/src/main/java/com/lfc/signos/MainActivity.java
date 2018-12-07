package com.lfc.signos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {


    ListView listView_Signos;

    String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"};
    String[] perfil = {"♈Áries (21 de março a 20 de abril)", "♉Touro (21 de abril a 20 de maio)", "♊Gêmeos (21 de maio a 20 de junho)", "♋Câncer (21 de junho a 21 de julho)", "♌Leão (22 de julho a 22 de agosto)", "♍Virgem (23 de agosto a 22 de setembro)", "♎Libra (23 de setembro a 22 de outubro)", "♏Escorpião (23 de outubro a 21 de novembro)", "♐Sagitário (22 de novembro a 21 de dezembro)", "♑Capricórnio (22 de dezembro e 20 de janeiro)", "♒Aquário (21 de janeiro a 19 de fevereiro)", "♓Peixes (20 de fevereiro a 20 de março)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView_Signos = (ListView) findViewById(R.id.listView_Signos);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, signos);

        listView_Signos.setAdapter(arrayAdapter);
        listView_Signos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),perfil[position],Toast.LENGTH_LONG).show();
            }
        });

    }
}
