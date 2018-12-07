package com.lfc.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    ImageView button_jogar;
    String[] opcao = {"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_jogar = (ImageView) findViewById(R.id.imageView_Jogar);

        button_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(2);

                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao",opcao[num]);
                startActivity(intent);

            }
        });
    }
}
