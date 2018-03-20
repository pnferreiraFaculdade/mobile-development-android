package com.example.poliana.dados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView edtImagem;
    ImageView edtImagemJog;
    int[] arrayDados = {R.drawable.dado1, R.drawable.dado2, R.drawable.dado3,
            R.drawable.dado4, R.drawable.dado5, R.drawable.dado6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtImagem = findViewById(R.id.imagem);
        edtImagemJog = findViewById(R.id.imagemJog);

    }

    public void sortear(View view){

        int randomImg = new Random().nextInt(arrayDados.length);
        int randomImgJog = new Random().nextInt(arrayDados.length);
        edtImagem.setImageResource(arrayDados[randomImg]);
        edtImagemJog.setImageResource(arrayDados[randomImgJog]);
        String msg;
        if(randomImg > randomImgJog) msg = "O computador ganhou";
        else if (randomImgJog > randomImg) msg = "O jogador ganhou";
        else msg = "Empate!!";

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
