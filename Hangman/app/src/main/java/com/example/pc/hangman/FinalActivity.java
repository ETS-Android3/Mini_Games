package com.example.pc.hangman;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FinalActivity extends AppCompatActivity {
    public String Check = GameActivity.Case;
    MediaPlayer song ;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        pl.droidsonroids.gif.GifImageButton caseview = (pl.droidsonroids.gif.GifImageButton)findViewById(R.id.Image_Case);
        TextView message = (TextView)findViewById(R.id.Txt_Message);
        TextView ScoreTxt = (TextView)findViewById(R.id.txt_Score);
        TextView WordTxt = (TextView)findViewById(R.id.txt_Word);

        Button next = (Button)findViewById(R.id.btn_NextPuzzel);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinalActivity.this,LevelChoose.class));
                finish();
                song.stop();
            }
        });
        Button Exit = (Button)findViewById(R.id.btn_Exit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               System.exit(0);
            }
        });

        switch(Check)
        {
            case("Win"):
            {
                caseview.setImageResource(R.drawable.celebrate);
                message.setText("Congratulations ! You Have Won");
                WordTxt.setText ("The Word Is :  "+GameActivity.MyWord);
                ScoreTxt.setText("Your Score Is :  "+ GameActivity.Score);
                song= MediaPlayer.create(this,R.raw.firework);
                song.start();
                break;
            }
            case ("Loose"):
            {
                caseview.setImageResource(R.drawable.wrong);
                song= MediaPlayer.create(this,R.raw.hanging);
                song.start();
                message.setText("You Are Dead! Good luck Next Time ");
                WordTxt.setText ("The Word Is :  "+GameActivity.MyWord);
                ScoreTxt.setText("Your Score Is :  "+ "0");
                break;
            }

        }
    }
}
