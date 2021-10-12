package com.example.pc.sudoko;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {


     RelativeLayout prog;
     ProgressBar load ;
     Button Exit;
     Button easy ;
     Button med;
     Button hard;
     ImageView logo;
     LinearLayout level ;
     LinearLayout menu ;
    public static MediaPlayer mediaPlayer;
    public void play ()
    {
        mediaPlayer= MediaPlayer.create(this,R.raw.song);
        mediaPlayer.start();
    }
    public void stop ()
    {
        mediaPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Intent i;

        {
            i = new Intent(StartActivity.this, MainActivity.class);
        }
        play();
         prog = (RelativeLayout) findViewById(R.id.prog);
         load = (ProgressBar)findViewById(R.id.progressBar);
          Exit = (Button)findViewById(R.id.btn_Exit);
         easy = (Button)findViewById(R.id.btn_Easy);
         med = (Button)findViewById(R.id.btn_Medium);
         hard = (Button)findViewById(R.id.btn_Hard);
         logo= (ImageView)findViewById(R.id.Logo);
         level = (LinearLayout) findViewById(R.id.level);
         menu = (LinearLayout) findViewById(R.id.menu);

        final ImageButton soundBtn = (ImageButton) findViewById(R.id.BtnSound);
        soundBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sudoko.sound == true)
                {
                    soundBtn.setImageResource(R.drawable.nosound);
                    stop();
                    sudoko.sound = false;
                }
                else
                {
                    soundBtn.setImageResource(R.drawable.sound);
                    play();
                    sudoko.sound = true ;
                }

            }
        });




        final Button Start = (Button)findViewById(R.id.btn_Start);
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level.setVisibility(View.VISIBLE);
                menu.setVisibility(View.INVISIBLE);
                logo.setVisibility(View.VISIBLE);
                soundBtn.setVisibility(View.INVISIBLE);


                // startActivity(new Intent(StartActivity.this,MainActivity.class));

            }
        });


        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sudoko.Level_chosen=31;
                level.setVisibility(View.INVISIBLE);
                menu.setVisibility(View.INVISIBLE);
                logo.setVisibility(View.VISIBLE);
                soundBtn.setVisibility(View.INVISIBLE);
                prog.setVisibility(View.VISIBLE);
                startActivity(new Intent(StartActivity.this,MainActivity.class));
                finish();
            }
        });

        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sudoko.Level_chosen=19;
                level.setVisibility(View.INVISIBLE);
                menu.setVisibility(View.INVISIBLE);
                logo.setVisibility(View.VISIBLE);
                soundBtn.setVisibility(View.INVISIBLE);
                prog.setVisibility(View.VISIBLE);
                startActivity(new Intent(StartActivity.this,MainActivity.class));
                finish();
            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sudoko.Level_chosen=12;
                level.setVisibility(View.INVISIBLE);
                menu.setVisibility(View.INVISIBLE);
                logo.setVisibility(View.VISIBLE);
                soundBtn.setVisibility(View.INVISIBLE);
                prog.setVisibility(View.VISIBLE);
                startActivity(new Intent(StartActivity.this,MainActivity.class));
                finish();

            }
        });
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);

            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        stop();
    }

  /*  @Override
    /*protected void onResume() {
        super.onResume();

    }*/

    @Override
    protected void onRestart() {
        super.onRestart();
        if(sudoko.sound){play();}
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}


