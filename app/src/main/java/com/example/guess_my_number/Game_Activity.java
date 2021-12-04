package com.example.guess_my_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.TextView;

public class Game_Activity extends AppCompatActivity {

    private int counter = 0;
    private int finalCounter;

    private TextView rifTriesCounter;
    private TextView rifGuessView;
    private TextView rifMessageView;
    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        this.rifTriesCounter = (TextView) this.findViewById(R.id.TriesCounter);
        this.rifGuessView = (TextView) this.findViewById(R.id.GuessView);
        this.rifMessageView = (TextView) this.findViewById(R.id.MessageView);
        Bundle number = getIntent().getExtras();
        if(number != null){
            n = number.getInt("number");
        }

    }

    public void onClickGuess(View arg0){
        //Controllo numero
        if(this.rifGuessView.getText().length()<1){
            this.rifMessageView.setText("Nothing");
        }else {
            if(Integer.parseInt(this.rifGuessView.getText().toString()) == n) {
                if(this.rifMessageView.getText().equals("Guessed")){

                }else{
                counter++;
                this.rifTriesCounter.setText("" + counter);
                finalCounter = counter;
                this.rifMessageView.setText("Guessed");
            }} else if(n > Integer.parseInt(this.rifGuessView.getText().toString())){
                this.rifMessageView.setText("Higher");
                counter++;
                this.rifGuessView.setText("");
                this.rifTriesCounter.setText("" + counter);
            } else {
                this.rifMessageView.setText("Lower");
                counter++;
                this.rifGuessView.setText("");
                this.rifTriesCounter.setText("" + counter);
            }
        }
    }

    public void onClick1(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("1");
    }

    public void onClick2(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("2");
    }

    public void onClick3(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("3");
    }

    public void onClick4(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("4");
    }

    public void onClick5(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("5");
    }

    public void onClick6(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("6");
    }

    public void onClick7(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("7");
    }

    public void onClick8(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("8");
    }

    public void onClick9(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("9");
    }

    public void onClick0(View arg0){
        if(this.rifMessageView.getText().equals("Guessed")){

        }else
        this.rifGuessView.append("0");
    }
}