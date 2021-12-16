package com.example.guess_my_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SharedPreferences s;
    static ArrayList<String> allscores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = getSharedPreferences("score",MODE_PRIVATE);
       allscores = new ArrayList<String>();
       String tmp;
       tmp = s.getString("top1easy","");
       if(!tmp.equals(""))
           allscores.add(tmp);
        tmp = s.getString("top2easy","");
        if(!tmp.equals(""))
            allscores.add(tmp);
        tmp = s.getString("top3easy","");
        if(!tmp.equals(""))
            allscores.add(tmp);
        tmp = s.getString("top1normal","");
        if(!tmp.equals(""))
            allscores.add(tmp);
        tmp = s.getString("top2normal","");
        if(!tmp.equals(""))
            allscores.add(tmp);
        tmp = s.getString("top3normal","");
        if(!tmp.equals(""))
            allscores.add(tmp);
        tmp = s.getString("top1hard","");
        if(!tmp.equals(""))
            allscores.add(tmp);
        tmp = s.getString("top2hard","");
        if(!tmp.equals(""))
            allscores.add(tmp);
        tmp = s.getString("top3hard","");
        if(!tmp.equals(""))
            allscores.add(tmp);
    }
    public void onClickEasy(View arg0) {
        // definisco l'intenzione
        Intent game = new Intent(MainActivity.this,Game_Activity.class);
        // passo all'attivazione dell'activity Game_Activity.java
        java.util.Random generator = new java.util.Random();
        int number = generator.nextInt(101);
        game.putExtra("number", number);
        game.putExtra("mode", "easy");
        startActivity(game);
    }

    public void onClickNormal(View arg0) {
        // definisco l'intenzione
        Intent game = new Intent(MainActivity.this,Game_Activity.class);
        // passo all'attivazione dell'activity Game_Activity.java
        java.util.Random generator = new java.util.Random();
        int number = generator.nextInt(1001);
        game.putExtra("number", number);
        game.putExtra("mode", "normal");
        startActivity(game);
    }

    public void onClickHard(View arg0) {
        // definisco l'intenzione
        Intent game = new Intent(MainActivity.this,Game_Activity.class);
        // passo all'attivazione dell'activity Game_Activity.java
        java.util.Random generator = new java.util.Random();
        int number = generator.nextInt(10001);
        game.putExtra("number", number);
        game.putExtra("mode", "hard");
        startActivity(game);
    }

    public void onClickScore(View arg0) {
        // definisco l'intenzione
        Intent score = new Intent(MainActivity.this,Score_Activity.class);
        // passo all'attivazione dell'activity Score_Activity.java
        startActivity(score);
    }



}