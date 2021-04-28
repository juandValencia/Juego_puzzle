package com.example.juego_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button play, salir,credito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.botonMainJugar);
        salir = findViewById(R.id.botonMainSalir);
        credito=findViewById(R.id.botonCreditos);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("iniciando juego...");
                iniciarJuego();
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent salida=new Intent( Intent.ACTION_MAIN); //Llamando a la activity principal
                finish();
            }
        });

        credito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarCreditos();
            }
        });

    }

    private void iniciarJuego(){
        Intent i = new Intent(this, juego.class);
        startActivity(i);
    }
    private void iniciarCreditos(){
        Intent i = new Intent(this, Creditos.class);
        startActivity(i);
    }
}