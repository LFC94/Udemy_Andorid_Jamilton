package lfc.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText_Idade;
    TextView textView_Result;
    Button buttonCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_Idade = (EditText) findViewById(R.id.editText_idade);
        textView_Result = (TextView) findViewById(R.id.textView_resultado);
        buttonCalcular = (Button) findViewById(R.id.button_descobri);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idade;
                if( ( idade = ValidaIdade(editText_Idade.getText().toString()))==0 ){
                    textView_Result.setText("Idade não informada corretamente");
                }else{
                    textView_Result.setText(idade + " ano(s) de Cachorro equivale a "+(idade*7)+" anos Humanos");
                }
            }
        });




    }


    public int ValidaIdade(String idade){

        int iIdade = 0;

        try {
            iIdade = Integer.parseInt(idade);
        }catch(Exception e){
            return 0;
        }
        if(iIdade < 1){
            return 0;
        }

        return iIdade;
    }
}
