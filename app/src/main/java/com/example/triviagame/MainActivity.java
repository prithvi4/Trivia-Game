
package com.example.triviagame;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TriviaQuestion mQuestionLibrary = new TriviaQuestion();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        updateQuestion();
        overridePendingTransition(R.anim.fade_out,R.anim.fade_in);

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    overridePendingTransition(R.anim.fade_out,R.anim.fade_in);


                } else {
                    Toast.makeText(MainActivity.this,"wrong", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, ActivityAgain.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
                    finish();
                }
            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, ActivityAgain.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
                    finish();
                }
            }
        });
            mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, ActivityAgain.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
                    finish();
                }
            }
            });
        }
        private void updateQuestion() {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        private void updateScore(int point) {
            mScoreView.setText("" + mScore);
        }
}



