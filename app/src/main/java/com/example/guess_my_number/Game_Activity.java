package com.example.guess_my_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Game_Activity extends AppCompatActivity {

    private int counter = 0;
    private TextView rifTriesCounter;
    private TextView rifGuessView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        this.rifTriesCounter = (TextView) this.findViewById(R.id.TriesCounter);
        this.rifGuessView = (TextView) this.findViewById(R.id.GuessView);
    }

    public void onClickGuess(View arg0){
        //Controllo numero
        counter++;
        this.rifTriesCounter.setText(counter);
    }

    public void onClick1(View arg0){
        this.rifGuessView.append("1");
    }

    public void onClick2(View arg0){
        this.rifGuessView.append("2");
    }

    public void onClick3(View arg0){
        this.rifGuessView.append("3");
    }

    public void onClick4(View arg0){
        this.rifGuessView.append("4");
    }

    public void onClick5(View arg0){
        this.rifGuessView.append("5");
    }

    public void onClick6(View arg0){
        this.rifGuessView.append("6");
    }

    public void onClick7(View arg0){
        this.rifGuessView.append("7");
    }

    public void onClick8(View arg0){
        this.rifGuessView.append("8");
    }

    public void onClick9(View arg0){
        this.rifGuessView.append("9");
    }

    public void onClick0(View arg0){
        this.rifGuessView.append("0");
    }
}