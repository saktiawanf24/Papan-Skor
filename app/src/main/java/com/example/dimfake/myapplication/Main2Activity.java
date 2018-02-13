package com.example.dimfake.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    int scoreTeamA, scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView player1 = (TextView) findViewById(R.id.textView1);
        TextView player2 = (TextView) findViewById(R.id.textView2);

        /**
         * Kita cek apakah ada Bundle atau tidak
         */
        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            player1.setText(bundle.getString("data1"));
            player2.setText(bundle.getString("data2"));
        }else{
            /**
             * Apabila Bundle tidak ada, ambil dari Intent
             */
            player1.setText(getIntent().getStringExtra("data1"));
            player2.setText(getIntent().getStringExtra("data2"));
        }
    }



    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
      /*
      Menampilkan score Team A di dalam TextView yang di tampilkan
      Menset nilai score yang bertipe data integer

       */


    }

    public void tigaPointA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        //Menambah Point Team A +1
    }

    public void duaPointA(View v) {
        scoreTeamA = scoreTeamA - 1;
        if(scoreTeamA<=0){
            scoreTeamA = 0;
        }
        displayForTeamA(scoreTeamA);
        //Mengurangi Point Team A -1

    }
    public void resetPointa(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        //Reset point Team A ke 0
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
             /*
      Menampilkan score Team B di dalam TextView yang di tampilkan
      Menset nilai score yang bertipe data integer

       */

    }

    public void tigaPointB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        // Menambah Point Team B +1

    }

    public void duaPointB(View v) {
        scoreTeamB = scoreTeamB - 1;
        if(scoreTeamB <= 0){
            scoreTeamB = 0;
        }
        displayForTeamB(scoreTeamB);
        // Mengurangi Point Team B -1
    }


    public void resetPointb(View v) {
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        //Reset point Team B ke 0
    }
}