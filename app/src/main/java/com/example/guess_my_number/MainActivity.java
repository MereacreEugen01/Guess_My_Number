package com.example.guess_my_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickGame(View arg0) {
        // definisco l'intenzione
        Intent game = new Intent(MainActivity.this,Game_Activity.class);
        // passo all'attivazione dell'activity Game_Activity.java
        startActivity(game);
    }

    public void onClickScore(View arg0) {
        // definisco l'intenzione
        Intent score = new Intent(MainActivity.this,Score_Activity.class);
        // passo all'attivazione dell'activity Score_Activity.java
        startActivity(score);
    }

}