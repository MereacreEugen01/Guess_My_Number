package com.example.guess_my_number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Credentials_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credentials);
    }

    public void onClickSave(View arg0){
        String nome = ((TextView)(findViewById(R.id.Name))).getText().toString();
        Bundle b = getIntent().getExtras();
        String score = b.getString("mode") + "," + nome + "," + b.getInt("tries") + "," + b.getDouble("time");
        int pos = getPosition(MainActivity.allscores, score);
        String newScore = score+","+pos;
        MainActivity.allscores.add(newScore);
        SharedPreferences.Editor editor = getSharedPreferences("scores", MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
        for(String s : MainActivity.allscores)
            editor.putString("top"+pos+b.getString("mode"), newScore);
        finish();

    }
    public int  getPosition(ArrayList<String> scores, String score){
        int check = 0;
        ArrayList<String> top = new ArrayList<>();
        for(String s : scores) if(s.split(",")[0].equals(score.split(",")[0])) top.add(s);
        for(check = 0; check < top.size(); check++){
            int tentativi = Integer.parseInt(score.split(",")[2]);
            if(tentativi <= Integer.parseInt(top.get(check).split(",")[2])){
                double time = Double.parseDouble(score.split(",")[3]);
                if(time < Double.parseDouble(top.get(check).split(",")[3]))
                    break;
            }
        }
        return check + 1;
    }
}