package lfc.com.frasedodia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {
    Button buton_NovaFrase;
    TextView textView_NovaFrase;
    String[] frases = {
            "Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos",
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele",
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum"
    };
    int numeroante = -1, numeroNovaFrase = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_NovaFrase  = (TextView) findViewById(R.id.textView_NovaFrase);
        buton_NovaFrase = (Button) findViewById(R.id.button_NovaFrase);
        buton_NovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                do{
                    numeroNovaFrase = random.nextInt(frases.length);
                }while (numeroNovaFrase == numeroante);
                numeroante = numeroNovaFrase;
                textView_NovaFrase.setText(frases[numeroNovaFrase]);
            }
        });
    }
}
