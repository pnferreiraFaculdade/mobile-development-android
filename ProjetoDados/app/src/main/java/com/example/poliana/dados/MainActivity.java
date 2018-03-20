package com.example.poliana.dados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView edtImagem;
    int[] arrayDados = {R.drawable.dado1, R.drawable.dado2, R.drawable.dado3,
            R.drawable.dado4, R.drawable.dado5, R.drawable.dado6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtImagem = findViewById(R.id.imagem);

    }

    public void sortear(View view){
        int randomImg = arrayDados[new Random().nextInt(arrayDados.length)];
        edtImagem.setImageResource(randomImg);
    }
}
