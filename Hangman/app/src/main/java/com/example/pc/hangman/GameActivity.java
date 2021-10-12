package com.example.pc.hangman;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    TextView word;
    Button btn[]=new Button[27];
    public static String MyWord;
    String Replce="";
    int  wrongGuesses = 0;
    TextView ScoreView ;
    ImageView gallows ;
    public static int Score = 100 ;
    public static String Case ;
    MediaPlayer song ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        wrongGuesses = 0;
        Score = 100;
        btn[0]=(Button) findViewById(R.id.btn);
        btn[1]=(Button) findViewById(R.id.Btn1);
        btn[2]=(Button) findViewById(R.id.Btn2);
        btn[3]=(Button) findViewById(R.id.Btn3);
        btn[4]=(Button) findViewById(R.id.Btn4);
        btn[5]=(Button) findViewById(R.id.Btn5);
        btn[6]=(Button) findViewById(R.id.Btn6);
        btn[7]=(Button) findViewById(R.id.Btn7);
        btn[8]=(Button) findViewById(R.id.Btn8);
        btn[9]=(Button) findViewById(R.id.Btn9);
        btn[10]=(Button) findViewById(R.id.Btn10);
        btn[11]=(Button) findViewById(R.id.Btn11);
        btn[12]=(Button) findViewById(R.id.Btn12);
        btn[13]=(Button) findViewById(R.id.Btn13);
        btn[14]=(Button) findViewById(R.id.Btn14);
        btn[15]=(Button) findViewById(R.id.Btn15);
        btn[16]=(Button) findViewById(R.id.Btn16);
        btn[17]=(Button) findViewById(R.id.Btn17);
        btn[18]=(Button) findViewById(R.id.Btn18);
        btn[19]=(Button) findViewById(R.id.Btn19);
        btn[20]=(Button) findViewById(R.id.Btn20);
        btn[21]=(Button) findViewById(R.id.Btn21);
        btn[22]=(Button) findViewById(R.id.Btn22);
        btn[23]=(Button) findViewById(R.id.Btn23);
        btn[24]=(Button) findViewById(R.id.Btn24);
        btn[25]=(Button) findViewById(R.id.Btn25);
        btn[26]=(Button) findViewById(R.id.Btn26);
        ScoreView = (TextView)findViewById(R.id.Score_View);
        gallows = (ImageView)findViewById(R.id.Gallows);
        int level = LevelChoose.Level;
        String category = ChooseCategory.Category;
        Words w = new Words(level , category);
        //btn[0].setOnClickListener(this);
        btn[1].setOnClickListener(this);
        btn[2].setOnClickListener(this);
        btn[3].setOnClickListener(this);
        btn[4].setOnClickListener(this);
        btn[5].setOnClickListener(this);
        btn[6].setOnClickListener(this);
        btn[7].setOnClickListener(this);
        btn[8].setOnClickListener(this);
        btn[9].setOnClickListener(this);
        btn[10].setOnClickListener(this);
        btn[11].setOnClickListener(this);
        btn[12].setOnClickListener(this);
        btn[13].setOnClickListener(this);
        btn[14].setOnClickListener(this);
        btn[15].setOnClickListener(this);
        btn[16].setOnClickListener(this);
        btn[17].setOnClickListener(this);
        btn[18].setOnClickListener(this);
        btn[19].setOnClickListener(this);
        btn[20].setOnClickListener(this);
        btn[21].setOnClickListener(this);
        btn[22].setOnClickListener(this);
        btn[23].setOnClickListener(this);
        btn[24].setOnClickListener(this);
        btn[25].setOnClickListener(this);
        btn[26].setOnClickListener(this);

        MyWord = w.GetWord();
        word = (TextView)findViewById(R.id.View_Word);
        Replce=MyWord;
        for(int i =0 ; i<MyWord.length(); i++){
            if (MyWord.charAt(i)!=' ')
                Replce = Replce.replace(Replce.charAt(i), '-');
        }
        word.setText(Replce);
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random Rand = new Random();
                int size = MyWord.length();
                int place;
                while (true){
                    place=Rand.nextInt(size);

                    if (Replce.charAt(place)=='-'){
                        char AfterChange[] = Replce.toCharArray();
                        AfterChange[place] = MyWord.charAt(place);
                        Replce = String.valueOf(AfterChange);
                        word.setText(Replce);
                        Score-=10;
                        ScoreView.setText(""+Score);

                        break;

                    }
                }
                btn[0].setEnabled(false);
                btn[0].setBackgroundColor(Color.DKGRAY);
            }

        });
    }

    @Override
    public void onClick(View view)
    {


        song= MediaPlayer.create(this,R.raw.butttonsound);
        song.start();

        boolean check=false;
        for (int i =0 ; i < MyWord.length(); i++)
        {
            String ButtonText = (String) ((Button)view).getText();

           if ( ButtonText.equals( ""+MyWord.charAt(i) )){

                char AfterChange[] = Replce.toCharArray();
                AfterChange[i]=ButtonText.charAt(0);
                Replce=String.valueOf(AfterChange);

                word.setText(Replce);
                check=true;

                if ( (word.getText()).equals(MyWord))
                {
                    startActivity(new Intent(GameActivity.this , FinalActivity.class));
                    finish();
                    Case = "Win";
                }

            }

        }
        if ( check==false ) {

            if (wrongGuesses < 10)
            {
                wrongGuesses++;
                Score -= 10;
                ScoreView.setText(String.valueOf(Score));
                switch (wrongGuesses) {
                    case (1): {
                        gallows.setImageResource(R.drawable.hang2);
                        break;
                    }
                    case (2): {
                        gallows.setImageResource(R.drawable.hang3);
                        break;
                    }
                    case (3): {
                        gallows.setImageResource(R.drawable.hang4);
                        break;
                    }

                    case (4): {
                        gallows.setImageResource(R.drawable.hang5);
                        break;
                    }

                    case (5): {
                        gallows.setImageResource(R.drawable.hang6);
                        break;
                    }

                    case (6): {
                        gallows.setImageResource(R.drawable.hang7);
                        break;
                    }

                    case (7): {
                        gallows.setImageResource(R.drawable.hang8);
                        break;
                    }

                    case (8): {
                        gallows.setImageResource(R.drawable.hang9);
                        break;
                    }

                    case (9): {
                        gallows.setImageResource(R.drawable.hang10);
                        startActivity(new Intent(GameActivity.this, FinalActivity.class));
                        finish();
                        Case = "Loose";
                        break;
                    }
                }

            }

        }
        view.setEnabled(false);
        view.setBackgroundColor(Color.DKGRAY);
    }

}