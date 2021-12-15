package com.example.guess_my_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.TextView;
import android.os.SystemClock;
import android.widget.Chronometer;


public class Game_Activity extends AppCompatActivity {

    private int counter = 0;
    private int finalCounter;

    private TextView rifTriesCounter;
    private TextView rifGuessView;
   // private TextView rifMessageView;
    private int n;
    private Chronometer gameTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        this.rifTriesCounter = (TextView) this.findViewById(R.id.TriesCounter);
        this.rifGuessView = (TextView) this.findViewById(R.id.GuessView);
        gameTime = (Chronometer) this.findViewById(R.id.chronometer);
        gameTime.start();
        Bundle number = getIntent().getExtras();
        if(number != null){
            n = number.getInt("number");
        }

    }

    public void onClickGuess(View arg0){
        //Controllo numero
        if(this.rifGuessView.getText().length()<1){
            this.rifGuessView.setText("Nothing");
        }
        else if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") |
                rifGuessView.getText().toString().contains("Guessed"))
        { }else {
            if(Integer.parseInt(this.rifGuessView.getText().toString()) == n) {
                gameTime.stop();
               // gameTime.
                if(this.rifGuessView.getText().equals("Guessed")){

                }else{
                counter++;
                this.rifTriesCounter.setText("" + counter);
                finalCounter = counter;
                this.rifGuessView.setText("Guessed");
            }} else if(n > Integer.parseInt(this.rifGuessView.getText().toString())){
                this.rifGuessView.setText("Higher");
                counter++;
                //this.rifGuessView.setText("");
                this.rifTriesCounter.setText("" + counter);
            } else {
                this.rifGuessView.setText("Lower");
                counter++;
               // this.rifGuessView.setText("");
                this.rifTriesCounter.setText("" + counter);
            }
        }
    }

    public void onClick0(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("0");
        }
        else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("0");
        }
    }

    public void onClick1(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("1");
        }
        else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("1");
        }
    }

    public void onClick2(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("2");
        }
        else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("2");
        }
    }

    public void onClick3(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("3");
        }
        else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("3");
        }
    }

    public void onClick4(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("4");
        }
        else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("4");
        }
    }

    public void onClick5(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("5");
        }
        else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("5");
        }
    }

    public void onClick6(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("6");
        }
        else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("6");
        }
    }

    public void onClick7(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("7");
        }else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("7");
        }

    }

    public void onClick8(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("8");
        }
        else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("8");
        }
    }

    public void onClick9(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") )
        {
            rifGuessView.setText("");
            this.rifGuessView.append("9");
        }
        else if(rifGuessView.getText().toString().contains("Guessed")){

        }
        else {
            this.rifGuessView.append("9");
        }
    }

    public void onClickDelete(View arg0){
        if(rifGuessView.getText().toString().contains("Nothing") |
                rifGuessView.getText().toString().contains("Higher") |
                rifGuessView.getText().toString().contains("Lower") |
                rifGuessView.getText().toString().contains("Guessed")){
        }else {
            rifGuessView.setText(rifGuessView.getText().toString().substring(0, rifGuessView.getText().toString().length()-1));
           // System.out.println("good: " + rifGuessView.getText().toString());
            //rifGuessView.setText("");
        }
    }
}