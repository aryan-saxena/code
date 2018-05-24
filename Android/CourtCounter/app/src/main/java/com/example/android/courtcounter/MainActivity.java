package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score_team_a = 0;
    int score_team_b = 0;
    public void addOneForTeamA(View view)
    {
        score_team_a++;
        displayForTeamA(score_team_a);
    }
    public void displayForTeamA(int score)
    {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(""+score_team_a);

    }
    public void addTwoForTeamA(View view)
    {
        score_team_a=score_team_a+2;
        displayForTeamA(score_team_a);
    }
    public void addThreeForTeamA(View view)
    {
        score_team_a=score_team_a+3;
        displayForTeamA(score_team_a);
    }


    public void addOneForTeamB(View view)
    {
        score_team_b++;
        displayForTeamB(score_team_b);
    }
    public void displayForTeamB(int score)
    {
        TextView teamBScore = (TextView) findViewById(R.id.team_b_score);
        teamBScore.setText(""+score_team_b);

    }
    public void addTwoForTeamB(View view)
    {
        score_team_b=score_team_b+2;
        displayForTeamB(score_team_b);
    }
    public void addThreeForTeamB(View view)
    {
        score_team_b=score_team_b+3;
        displayForTeamB(score_team_b);
    }
    public void reset(View view)
    {
        score_team_a=0;
        score_team_b=0;
        displayForTeamA(score_team_a);
        displayForTeamB(score_team_b);
    }
}
