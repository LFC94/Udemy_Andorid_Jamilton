package com.lfc.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonTocar;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonTocar = (Button) findViewById(R.id.button_Tocar);

        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.musica);

        buttonTocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    PausarMusica();
                }else{
                    TocarMusica();
                }
            }
        });
    }

    private void TocarMusica(){
        if (mediaPlayer != null){
            mediaPlayer.start();
            buttonTocar.setText("Pausar");
        }
    }

    private void PausarMusica(){
        if (mediaPlayer != null){
            mediaPlayer.pause();
            buttonTocar.setText("Tocar");
        }
    }

    @Override
    protected void onDestroy() {

        if (mediaPlayer!=null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();


    }
}
