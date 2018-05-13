package com.example.varungupta.quiz;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int total_marks;
    int [] questions = {0,0,0,0,0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total_marks = 0;
        //questions 
    }
    public void onCheck(View view)
    {
        RadioButton rb = (RadioButton)view;
        switch(rb.getId())
         {
             case R.id.question1_option4:
                 questions[0] = 1;
                 break;
             case R.id.question2_option2:
                 questions[1] = 1;
                 break;
             case R.id.question3_option4:
                 questions[2] = 1;
                 break;
             case R.id.question4_option3:
                 questions[3] = 1;
                 break;
             case R.id.question5_option1:
                 questions[4] = 1;
                 break;
             case R.id.question6_option1:
                 questions[5] = 1;
                 break;
             case R.id.question7_option2:
                 questions[6] = 1;
                 break;
             case R.id.question8_option1:
                 questions[7] = 1;
                 break;
             case R.id.question9_option4:
                 questions[8] = 1;
                 break;
             case R.id.question10_option3:
                 questions[9] = 1;
                 break;
         }
    }
    void getResults(View view)
    {
        for (int i: questions) {
            total_marks += i;
        }
        //Toast.makeText(getApplicationContext(),"You scored "+total_marks+". Thanks!",Toast.LENGTH_LONG).show();
        //System.exit(0);
        Intent intent = new Intent(this,ResultsActivity.class);
        intent.putExtra("score", total_marks);
        startActivity(intent);
    }
}
