package com.example.pc.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelChoose extends AppCompatActivity {
    public static int Level;
    public static Intent i ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_choose);
        Button easy;
        Button hard;
        Button medium ;
        easy = (Button)findViewById(R.id.Btn_Easy);
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Level=0;
                i = new Intent(LevelChoose.this,ChooseCategory.class);
                startActivity(i);
                finish();
            }
        });

        medium = (Button)findViewById(R.id.Btn_Medium);
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Level=1;
                i = new Intent(LevelChoose.this,ChooseCategory.class);
                startActivity(i);
                finish();

            }
        });

        hard = (Button)findViewById(R.id.Btn_Hard);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Level=2;
                i = new Intent(LevelChoose.this,ChooseCategory.class);
                startActivity(i);
                finish();
            }
        });


    }
}
