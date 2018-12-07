package com.lfc.qualserie;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    SeekBar seekBar;
    ImageView imageView_Exibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        seekBar = (SeekBar)findViewById(R.id.seekBar);
        imageView_Exibicao = (ImageView) findViewById(R.id.imageView_Exibicao);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 0){
                    imageView_Exibicao.setImageResource(R.drawable.pouco);
                }else if (progress == 1){
                    imageView_Exibicao.setImageResource(R.drawable.medio);
                }else if (progress == 2){
                    imageView_Exibicao.setImageResource(R.drawable.muito);
                }else if (progress == 3){
                    imageView_Exibicao.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
