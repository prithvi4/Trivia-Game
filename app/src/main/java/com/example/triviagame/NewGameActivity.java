package com.example.triviagame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Bundle;

public class NewGameActivity extends AppCompatActivity{
    Button playGame;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        playGame = findViewById(R.id.playGame);

        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewGameActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_out,R.anim.fade_in);
                finish();
            }
        });
    }

}

