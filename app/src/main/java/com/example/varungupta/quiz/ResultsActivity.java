package com.example.varungupta.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();
        int score = intent.getIntExtra("score",0);
        TextView scoreCard = findViewById(R.id.marks);
        scoreCard.setText(score+"/10");
    }
}
