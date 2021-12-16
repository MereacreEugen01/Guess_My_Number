package com.example.guess_my_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Score_Activity extends AppCompatActivity {

    ArrayList<String> top;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        show("easy");
    }

    public  void show(String mode){
        ((TextView) findViewById(R.id.top1name)).setText("");
        ((TextView) findViewById(R.id.top1tries)).setText("");
        ((TextView) findViewById(R.id.top1time)).setText("");
        ((TextView) findViewById(R.id.top2name)).setText("");
        ((TextView) findViewById(R.id.top2tries)).setText("");
        ((TextView) findViewById(R.id.top2time)).setText("");
        ((TextView) findViewById(R.id.top3name)).setText("");
        ((TextView) findViewById(R.id.top3tries)).setText("");
        ((TextView) findViewById(R.id.top3time)).setText("");
        top = new ArrayList<String>();
        for(String s : MainActivity.allscores)
            if(s.split(",")[0].equals(mode))
                top.add(s);
        if(!top.isEmpty()){
            try {
                ((TextView) findViewById(R.id.top1name)).setText(top.get(0).split(",")[1]);
                ((TextView) findViewById(R.id.top1tries)).setText(top.get(0).split(",")[2]);
                ((TextView) findViewById(R.id.top1time)).setText(top.get(0).split(",")[3]);
                ((TextView) findViewById(R.id.top2name)).setText(top.get(1).split(",")[1]);
                ((TextView) findViewById(R.id.top2tries)).setText(top.get(1).split(",")[2]);
                ((TextView) findViewById(R.id.top2time)).setText(top.get(1).split(",")[3]);
                ((TextView) findViewById(R.id.top3name)).setText(top.get(2).split(",")[1]);
                ((TextView) findViewById(R.id.top3tries)).setText(top.get(2).split(",")[2]);
                ((TextView) findViewById(R.id.top3time)).setText(top.get(2).split(",")[3]);
            }catch(Exception e){}
        }

    }

    public void onClickEasy(View arg0){
        show("easy");
    }

    public void onClickNormal(View arg0){
        show("normal");
    }

    public void onClickHard(View arg0){
        show("hard");
    }
}