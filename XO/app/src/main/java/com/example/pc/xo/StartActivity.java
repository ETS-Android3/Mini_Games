package com.example.pc.xo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    Button player;
    Button computer;
    Button easy;
    Button normal;
    Button hard;
    Button Exit;
    public static int level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        player=(Button) findViewById(R.id.player);
        computer=(Button) findViewById(R.id.com);
        easy=(Button) findViewById(R.id.easy);
        normal=(Button) findViewById(R.id.n);
        hard=(Button) findViewById(R.id.hard);
        Exit=(Button) findViewById(R.id.Btn_exit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                player.setVisibility(View.INVISIBLE);
                computer.setVisibility(View.INVISIBLE);
                Exit.setVisibility(View.INVISIBLE);
                easy.setVisibility(View.VISIBLE);
                normal.setVisibility(View.VISIBLE);
                hard.setVisibility(View.VISIBLE);
            }
        });

        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                level=3;
                Intent i = new Intent(StartActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                level=0;
                Intent i = new Intent(StartActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                level=1;
                Intent i = new Intent(StartActivity.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                level=2;
                Intent i = new Intent(StartActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
