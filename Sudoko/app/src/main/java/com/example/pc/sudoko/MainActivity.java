package com.example.pc.sudoko;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity  implements TextWatcher{
    EditText edt[] = new EditText[81];
    TextView txt[] = new TextView[9];
    TextView txtview ;
    public int currentseconds;
    public int currentmintues;
    public int seconds = 00 ;
    public int mintues=00 ;

    sudoko s;
    String []list;
    RelativeLayout prog ;
    public boolean Begin = true ;
    public void play ()
    {
        StartActivity.mediaPlayer= MediaPlayer.create(this,R.raw.song);
        StartActivity.mediaPlayer.start();
    }
    public void stop ()
    {
        StartActivity.mediaPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new String[]{"Back To Main","Play Again"};
        txtview = (TextView) findViewById(R.id.Timer);
        prog=(RelativeLayout) findViewById(R.id.prog);
        txt[0] = (TextView) findViewById(R.id.b1);
        txt[1] = (TextView) findViewById(R.id.b2);
        txt[2] = (TextView) findViewById(R.id.b3);
        txt[3] = (TextView) findViewById(R.id.b4);
        txt[4] = (TextView) findViewById(R.id.b5);
        txt[5] = (TextView) findViewById(R.id.b6);
        txt[6] = (TextView) findViewById(R.id.b7);
        txt[7] = (TextView) findViewById(R.id.b8);
        txt[8] = (TextView) findViewById(R.id.b9);
        edt[0] = (EditText) findViewById(R.id.btn1);
        edt[1] = (EditText) findViewById(R.id.btn2);
        edt[2] = (EditText) findViewById(R.id.btn3);
        edt[3] = (EditText) findViewById(R.id.btn4);
        edt[4] = (EditText) findViewById(R.id.btn5);
        edt[5] = (EditText) findViewById(R.id.btn6);
        edt[6] = (EditText) findViewById(R.id.btn7);
        edt[7] = (EditText) findViewById(R.id.btn8);
        edt[8] = (EditText) findViewById(R.id.btn9);
        edt[9] = (EditText) findViewById(R.id.btn10);
        edt[10] = (EditText) findViewById(R.id.btn11);
        edt[11] = (EditText) findViewById(R.id.btn12);
        edt[12] = (EditText) findViewById(R.id.btn13);
        edt[13] = (EditText) findViewById(R.id.btn14);
        edt[14] = (EditText) findViewById(R.id.btn15);
        edt[15] = (EditText) findViewById(R.id.btn16);
        edt[16] = (EditText) findViewById(R.id.btn17);
        edt[17] = (EditText) findViewById(R.id.btn18);
        edt[18] = (EditText) findViewById(R.id.btn19);
        edt[19] = (EditText) findViewById(R.id.btn20);
        edt[20] = (EditText) findViewById(R.id.btn21);
        edt[21] = (EditText) findViewById(R.id.btn22);
        edt[22] = (EditText) findViewById(R.id.btn23);
        edt[23] = (EditText) findViewById(R.id.btn24);
        edt[24] = (EditText) findViewById(R.id.btn25);
        edt[25] = (EditText) findViewById(R.id.btn26);
        edt[26] = (EditText) findViewById(R.id.btn27);
        edt[27] = (EditText) findViewById(R.id.btn28);
        edt[28] = (EditText) findViewById(R.id.btn29);
        edt[29] = (EditText) findViewById(R.id.btn30);
        edt[30] = (EditText) findViewById(R.id.btn31);
        edt[31] = (EditText) findViewById(R.id.btn32);
        edt[32] = (EditText) findViewById(R.id.btn33);
        edt[33] = (EditText) findViewById(R.id.btn34);
        edt[34] = (EditText) findViewById(R.id.btn35);
        edt[35] = (EditText) findViewById(R.id.btn36);
        edt[36] = (EditText) findViewById(R.id.btn37);
        edt[37] = (EditText) findViewById(R.id.btn38);
        edt[38] = (EditText) findViewById(R.id.btn39);
        edt[39] = (EditText) findViewById(R.id.btn40);
        edt[40] = (EditText) findViewById(R.id.btn41);
        edt[41] = (EditText) findViewById(R.id.btn42);
        edt[42] = (EditText) findViewById(R.id.btn43);
        edt[43] = (EditText) findViewById(R.id.btn44);
        edt[44] = (EditText) findViewById(R.id.btn45);
        edt[45] = (EditText) findViewById(R.id.btn46);
        edt[46] = (EditText) findViewById(R.id.btn47);
        edt[47] = (EditText) findViewById(R.id.btn48);
        edt[48] = (EditText) findViewById(R.id.btn49);
        edt[49] = (EditText) findViewById(R.id.btn50);
        edt[50] = (EditText) findViewById(R.id.btn51);
        edt[51] = (EditText) findViewById(R.id.btn52);
        edt[52] = (EditText) findViewById(R.id.btn53);
        edt[53] = (EditText) findViewById(R.id.btn54);
        edt[54] = (EditText) findViewById(R.id.btn55);
        edt[55] = (EditText) findViewById(R.id.btn56);
        edt[56] = (EditText) findViewById(R.id.btn57);
        edt[57] = (EditText) findViewById(R.id.btn58);
        edt[58] = (EditText) findViewById(R.id.btn59);
        edt[59] = (EditText) findViewById(R.id.btn60);
        edt[60] = (EditText) findViewById(R.id.btn61);
        edt[61] = (EditText) findViewById(R.id.btn62);
        edt[62] = (EditText) findViewById(R.id.btn63);
        edt[63] = (EditText) findViewById(R.id.btn64);
        edt[64] = (EditText) findViewById(R.id.btn65);
        edt[65] = (EditText) findViewById(R.id.btn66);
        edt[66] = (EditText) findViewById(R.id.btn67);
        edt[67] = (EditText) findViewById(R.id.btn68);
        edt[68] = (EditText) findViewById(R.id.btn69);
        edt[69] = (EditText) findViewById(R.id.btn70);
        edt[70] = (EditText) findViewById(R.id.btn71);
        edt[71] = (EditText) findViewById(R.id.btn72);
        edt[72] = (EditText) findViewById(R.id.btn73);
        edt[73] = (EditText) findViewById(R.id.btn74);
        edt[74] = (EditText) findViewById(R.id.btn75);
        edt[75] = (EditText) findViewById(R.id.btn76);
        edt[76] = (EditText) findViewById(R.id.btn77);
        edt[77] = (EditText) findViewById(R.id.btn78);
        edt[78] = (EditText) findViewById(R.id.btn79);
        edt[79] = (EditText) findViewById(R.id.btn80);
        edt[80] = (EditText) findViewById(R.id.btn81);

        edt[0].addTextChangedListener(this);
        edt[1].addTextChangedListener(this);
        edt[2].addTextChangedListener(this);
        edt[3].addTextChangedListener(this);
        edt[4].addTextChangedListener(this);
        edt[5].addTextChangedListener(this);
        edt[6].addTextChangedListener(this);
        edt[7].addTextChangedListener(this);
        edt[8].addTextChangedListener(this);
        edt[9].addTextChangedListener(this);
        edt[10].addTextChangedListener(this);
        edt[11].addTextChangedListener(this);
        edt[12].addTextChangedListener(this);
        edt[13].addTextChangedListener(this);
        edt[14].addTextChangedListener(this);
        edt[15].addTextChangedListener(this);
        edt[16].addTextChangedListener(this);
        edt[17].addTextChangedListener(this);
        edt[18].addTextChangedListener(this);
        edt[19].addTextChangedListener(this);
        edt[20].addTextChangedListener(this);
        edt[21].addTextChangedListener(this);
        edt[22].addTextChangedListener(this);
        edt[23].addTextChangedListener(this);
        edt[24].addTextChangedListener(this);
        edt[25].addTextChangedListener(this);
        edt[26].addTextChangedListener(this);
        edt[27].addTextChangedListener(this);
        edt[28].addTextChangedListener(this);
        edt[29].addTextChangedListener(this);
        edt[30].addTextChangedListener(this);
        edt[31].addTextChangedListener(this);
        edt[32].addTextChangedListener(this);
        edt[33].addTextChangedListener(this);
        edt[34].addTextChangedListener(this);
        edt[35].addTextChangedListener(this);
        edt[36].addTextChangedListener(this);
        edt[37].addTextChangedListener(this);
        edt[38].addTextChangedListener(this);
        edt[39].addTextChangedListener(this);
        edt[40].addTextChangedListener(this);
        edt[41].addTextChangedListener(this);
        edt[42].addTextChangedListener(this);
        edt[43].addTextChangedListener(this);
        edt[44].addTextChangedListener(this);
        edt[45].addTextChangedListener(this);
        edt[46].addTextChangedListener(this);
        edt[47].addTextChangedListener(this);
        edt[48].addTextChangedListener(this);
        edt[49].addTextChangedListener(this);
        edt[50].addTextChangedListener(this);
        edt[51].addTextChangedListener(this);
        edt[52].addTextChangedListener(this);
        edt[53].addTextChangedListener(this);
        edt[54].addTextChangedListener(this);
        edt[55].addTextChangedListener(this);
        edt[56].addTextChangedListener(this);
        edt[57].addTextChangedListener(this);
        edt[58].addTextChangedListener(this);
        edt[59].addTextChangedListener(this);
        edt[60].addTextChangedListener(this);
        edt[61].addTextChangedListener(this);
        edt[62].addTextChangedListener(this);
        edt[63].addTextChangedListener(this);
        edt[64].addTextChangedListener(this);
        edt[65].addTextChangedListener(this);
        edt[66].addTextChangedListener(this);
        edt[67].addTextChangedListener(this);
        edt[68].addTextChangedListener(this);
        edt[69].addTextChangedListener(this);
        edt[70].addTextChangedListener(this);
        edt[71].addTextChangedListener(this);
        edt[72].addTextChangedListener(this);
        edt[73].addTextChangedListener(this);
        edt[74].addTextChangedListener(this);
        edt[75].addTextChangedListener(this);
        edt[76].addTextChangedListener(this);
        edt[77].addTextChangedListener(this);
        edt[78].addTextChangedListener(this);
        edt[79].addTextChangedListener(this);
        edt[80].addTextChangedListener(this);
        s=new sudoko(edt,txt);
        s.Start(sudoko.Level_chosen);
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        TextView tv = (TextView) findViewById(R.id.Timer);
                        tv.setText(String.valueOf(mintues)+":"+String.valueOf(seconds));
                        seconds += 1;

                        if(seconds == 60)
                        {
                            tv.setText(String.valueOf(mintues)+":"+String.valueOf(seconds));
                            seconds=00;
                            mintues=mintues+1;
                        }
                    }
                });

            }
        }, 0, 1000);
  /*  final ImageButton soundBtn = (ImageButton) findViewById(R.id.BtnMusic);
    soundBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (StartActivity.sound == true)
            {
                soundBtn.setImageResource(R.drawable.nosound);
                stop();
                StartActivity.sound = false;
            }
            else
            {  soundBtn.setImageResource(R.drawable.sound);
                play();
                StartActivity.sound = true ;
            }

        }
    });*/

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        s.color();
        s.recolor_All();
        s.allnotequals();
        if (s.win()){

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(" congratiolation ,you won in "+mintues + ":"+ seconds+" mintues" );
            builder.setSingleChoiceItems(list, -1, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i==1){
                       prog.setVisibility(View.VISIBLE);
                        Intent intent = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();

                    }
                    else {
                        Intent intent = new Intent(MainActivity.this,StartActivity.class);
                        startActivity(intent);
                        finish();
                    }

                    dialogInterface.dismiss();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    protected void onStop() {
        super.onStop();
       currentmintues=mintues;
       currentseconds=seconds;
        stop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        seconds=currentseconds;
        mintues=currentmintues;
        if(sudoko.sound){play();}
    }
    @Override
    protected void onResume() {
        super.onResume();


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(MainActivity.this,StartActivity.class);
        startActivity(i);
    }
}