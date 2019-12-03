package com.example.triviagame;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import java.util.List;
import java.util.ArrayList;
import android.app.Activity;
import android.widget.TextView;
import android.view.View;
import android.view.Window;
import java.util.Collection;



public class MainActivity extends AppCompatActivity {
    Button buttonOne, buttonTwo, buttonThree;
    TextView qText, text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOne = findViewById(R.id.button1);
        Button buttonTwo = findViewById(R.id.button2);
        Button buttonThree = findViewById(R.id.button3);
        TextView qText = findViewById(R.id.question);

    }

    TriviaQuestion.createList();

    public void updateQ() {
        qText.setText(TriviaQuestion.list.get(TriviaQuestion.counter).getQ());
        buttonOne.setText(TriviaQuestion.getOne());
        buttonTwo.setText(TriviaQuestion.getTwo());
        buttonThree.setText(TriviaQuestion.getThree());
    }

    public void clickOne(View view) {
        if (TriviaQuestion.list.get(TriviaQuestion.counter).getOne().equals(TriviaQuestion.list.get(TriviaQuestion.counter).getA())) {
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            TriviaQuestion.counter++;
        }
    }

    public void clickTwo(View view) {
        if (TriviaQuestion.list.get(TriviaQuestion.counter).getTwo().equals(TriviaQuestion.list.get(TriviaQuestion.counter).getA())) {
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            TriviaQuestion.counter++;
        }
    }

    public void clickThree(View view) {
        if (TriviaQuestion.list.get(TriviaQuestion.counter).getThree().equals(TriviaQuestion.list.get(TriviaQuestion.counter).getA())) {
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            TriviaQuestion.counter++;
        }
    }

    public String gameLost() {
        return "Game Over";
    }

    public String gameWon() {
        return "Game Won!";
    }




}
