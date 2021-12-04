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
    public void onClickEasy(View arg0) {
        // definisco l'intenzione
        Intent game = new Intent(MainActivity.this,Game_Activity.class);
        // passo all'attivazione dell'activity Game_Activity.java
        java.util.Random generator = new java.util.Random();
        int number = generator.nextInt(101);
        game.putExtra("number", number);
        startActivity(game);
    }

    public void onClickNormal(View arg0) {
        // definisco l'intenzione
        Intent game = new Intent(MainActivity.this,Game_Activity.class);
        // passo all'attivazione dell'activity Game_Activity.java
        java.util.Random generator = new java.util.Random();
        int number = generator.nextInt(1001);
        game.putExtra("number", number);
        startActivity(game);
    }

    public void onClickHard(View arg0) {
        // definisco l'intenzione
        Intent game = new Intent(MainActivity.this,Game_Activity.class);
        // passo all'attivazione dell'activity Game_Activity.java
        java.util.Random generator = new java.util.Random();
        int number = generator.nextInt(10001);
        game.putExtra("number", number);
        startActivity(game);
    }

    public void onClickScore(View arg0) {
        // definisco l'intenzione
        Intent score = new Intent(MainActivity.this,Score_Activity.class);
        // passo all'attivazione dell'activity Score_Activity.java
        startActivity(score);
    }

}