package com.example.pc.xo;

import android.annotation.SuppressLint;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class play {
    Button jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9;
    TextView txt  ;
    String s="X";
    public play (Button jButton1,Button jButton2,Button jButton3,Button jButton4,Button jButton5,Button jButton6,Button jButton7,Button jButton8,Button jButton9,TextView txt) {

        this.jButton1=jButton1;
        this.jButton2=jButton2;
        this.jButton3=jButton3;
        this.jButton4=jButton4;
        this.jButton5=jButton5;
        this.jButton6=jButton6;
        this.jButton7=jButton7;
        this.jButton8=jButton8;
        this.jButton9=jButton9;
        this.txt=txt;

    }
    public int allButtonsTextLength()
    {
        String txt = "";
        int textlength=0;
        if (!jButton1.getText().toString().equals(txt)){
            textlength++;
        }
        if (!jButton2.getText().toString().equals(txt)){
            textlength++;
        }
        if (!jButton3.getText().toString().equals(txt)){
            textlength++;
        }
        if (!jButton4.getText().toString().equals(txt)){
            textlength++;
        }
        if (!jButton5.getText().toString().equals(txt)){
            textlength++;
        }
        if (!jButton6.getText().toString().equals(txt)){
            textlength++;
        }
        if (!jButton7.getText().toString().equals(txt)){
            textlength++;
        }
        if (!jButton8.getText().toString().equals(txt)){
            textlength++;
        }
        if (!jButton9.getText().toString().equals(txt)){
            textlength++;
        }
        return textlength;

    }
    public void winEffect(Button b1,Button b2,Button b3)
    {
        b1.setBackgroundColor(0x00FF0000);
        b2.setBackgroundColor(0x00FF0000);
        b3.setBackgroundColor(0x00FF0000);
        if(b1.getText().equals("O"))
        {
            this.txt.setText("O win");
        }
        else
        {
            this.txt.setText("X win");
        }
    }
    boolean win = false;

    public void getTheWinner()
    {
        if(!jButton1.getText().equals("") && jButton1.getText().equals(jButton2.getText()) && jButton1.getText().equals(jButton3.getText()))
        {winEffect(jButton1,jButton2,jButton3);win = true;}

        if(!jButton4.getText().equals("") && jButton4.getText().equals(jButton5.getText()) && jButton4.getText().equals(jButton6.getText()))
        {winEffect(jButton4,jButton5,jButton6);win = true;}

        if(!jButton7.getText().equals("") && jButton7.getText().equals(jButton8.getText()) && jButton7.getText().equals(jButton9.getText()))
        {winEffect(jButton7,jButton8,jButton9);win = true;}

        if(!jButton1.getText().equals("") && jButton1.getText().equals(jButton4.getText()) && jButton1.getText().equals(jButton7.getText()))
        {winEffect(jButton1,jButton4,jButton7);win = true;}

        if(!jButton2.getText().equals("") && jButton2.getText().equals(jButton5.getText()) && jButton2.getText().equals(jButton8.getText()))
        {winEffect(jButton2,jButton5,jButton8);win = true;}

        if(!jButton3.getText().equals("") && jButton3.getText().equals(jButton6.getText()) && jButton3.getText().equals(jButton9.getText()))
        {winEffect(jButton3,jButton6,jButton9);win = true;}

        if(!jButton1.getText().equals("") && jButton1.getText().equals(jButton5.getText()) && jButton1.getText().equals(jButton9.getText()))
        {winEffect(jButton1,jButton5,jButton9);win = true;}

        if(!jButton3.getText().equals("") && jButton3.getText().equals(jButton5.getText()) && jButton3.getText().equals(jButton7.getText()))
        {winEffect(jButton3,jButton5,jButton7);win = true;}

        else if (allButtonsTextLength() == 9 && win == false)
        {txt.setText("No Winner!");}
    }
    public void addAction(Button b)
    {
        if (b.getText().toString().equals("")){
        changtext();
        if (s.equals("X")&&b.getText().toString().equals("")){
            b.setText(s);
            s="O";
            getTheWinner();
            if (win==true){
                txt.setText("X is winner");
        disable();
            }
        }
        else if (s.equals("O")&&b.getText().toString().equals("")){
            b.setText(s);
            s="X";
            getTheWinner();
            if (win==true){
                txt.setText("O is winner");
                disable();
            }
        }
        }


    }

    public void disable(){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }
    @SuppressLint("ResourceAsColor")
    public void enable(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        recolor();
txt.setText("");
win=false;
    }
public void recolor(){
    jButton1.setBackgroundResource(R.drawable.button);
    jButton2.setBackgroundResource(R.drawable.button);
    jButton3.setBackgroundResource(R.drawable.button);
    jButton4.setBackgroundResource(R.drawable.button);
    jButton5.setBackgroundResource(R.drawable.button);
    jButton6.setBackgroundResource(R.drawable.button);
    jButton7.setBackgroundResource(R.drawable.button);
    jButton8.setBackgroundResource(R.drawable.button);
    jButton9.setBackgroundResource(R.drawable.button);
}
public void changtext(){
    if (s=="X"&&(!txt.getText().equals("X Winner")||!txt.getText().equals("O Winner")||!txt.getText().equals("No Winner!"))){
        txt.setText("O Turn");
    }
    else if (s=="O"&&(!txt.getText().equals("X Winner")||!txt.getText().equals("O Winner")||!txt.getText().equals("No Winner!"))){
        txt.setText("X Turn");
    }

}


}
class easy extends play{
     public easy (Button jButton1,Button jButton2,Button jButton3,Button jButton4,Button jButton5,Button jButton6,Button jButton7,Button jButton8,Button jButton9,TextView txt){
         super(jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9,txt);


     }
    public void addAction(Button b){
if(b.getText().toString().equals("")) {
 b.setText("X");

 getTheWinner();
 if (win==true){
 txt.setText("X is winner");
 disable();
 }
 else{
    easy_play();
    getTheWinner();
    if (win == true){
        txt.setText("computer is winner");
    disable();
    }
 }
}
    }
    public void easy_play(){
        Button[] buttons = new Button[9];
        buttons[0] = jButton1;
        buttons[1] = jButton2;
        buttons[2] = jButton3;
        buttons[3] = jButton4;
        buttons[4] = jButton5;
        buttons[5] = jButton6;
        buttons[6] = jButton7;
        buttons[7] = jButton8;
        buttons[8] = jButton9;
        Random rand = new Random();
        int rand_int1 = rand.nextInt(9);
        while(!"".equals(buttons[rand_int1].getText())&&allButtonsTextLength() != 9)
        {
            rand_int1 = rand.nextInt(9);
        }
        buttons[rand_int1].setText("O");
    }

}
class normal extends play {
    public normal(Button jButton1, Button jButton2, Button jButton3, Button jButton4, Button jButton5, Button jButton6, Button jButton7, Button jButton8, Button jButton9, TextView txt) {
        super(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, txt);
    }

    public void addAction(Button b) {
        if (b.getText().toString().equals("")) {
            b.setText("X");

            getTheWinner();
            if (win == true) {
                txt.setText("X is winner");
                disable();
            } else {
                normal_play();
                getTheWinner();
                if (win == true) {
                    txt.setText("computer is winner");
                    disable();
                }
            }
        }
    }
    public void AI_TURN(Button b)
    {
        b.setText("O");
    }
    public void normal_play()
    {
        //the first time
        if ((jButton1.getText()!=""||jButton2.getText()!=""||jButton3.getText()!=""||jButton4.getText()!=""||jButton6.getText()!=""||jButton7.getText()!=""||jButton8.getText()!=""||jButton9.getText()!="")&&allButtonsTextLength()==1)
        {
            AI_TURN(jButton5);
        }
        else if (jButton5.getText()!=""&&allButtonsTextLength()==1)
        {
            AI_TURN(jButton3);
        }
        //the second time
        else if (jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton3);
        }
        else if (jButton1.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton2);
        }
        else if (jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton4);
        }
        else if (jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton2);
        }
        else if (jButton1.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton1.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton1.getText()=="X"&&jButton5.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton8);
        }
        else if (jButton5.getText()=="X"&&jButton4.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton4);
        }
        else if (jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton5.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton2);
        }
        else if (jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton2.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if ((jButton1.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton3);
        }
        else if (jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton2.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton2.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton3.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton4);
        }
        else if (jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton4.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton4.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton8);
        }
        else if (jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton3);
        }
        else if (jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton8.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton8);
        }
        //the third time
        else if (jButton1.getText()=="X"&&jButton2.getText()=="X"&&(jButton4.getText()=="X"||jButton6.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if (jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&(jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if (jButton1.getText()=="X"&&jButton4.getText()=="X"&&(jButton2.getText()=="X"||jButton6.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton1.getText()=="X"&&jButton4.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton1.getText()=="X"&&jButton6.getText()=="X"&&(jButton4.getText()=="X"||jButton3.getText()=="X"||jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton1.getText()=="X"&&jButton7.getText()=="X"&&(jButton2.getText()=="X"||jButton3.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton1.getText()=="X"&&jButton8.getText()=="X"&&(jButton4.getText()=="X"||jButton6.getText()=="X"||jButton2.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton1.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton1.getText()=="X"&&jButton9.getText()=="X"&&(jButton2.getText()=="X"||jButton3.getText()=="X"||jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton1.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton5.getText()=="X"&&jButton1.getText()=="X"&&(jButton4.getText()=="X"||jButton2.getText()=="X"||jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton5.getText()=="X"&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if (jButton5.getText()=="X"&&jButton4.getText()=="X"&&(jButton1.getText()=="X"||jButton2.getText()=="X"||jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton5.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&(jButton4.getText()=="X"||jButton1.getText()=="X"||jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton6.getText()=="X"&&(jButton1.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton7.getText()=="X"&&(jButton1.getText()=="X"||jButton2.getText()=="X"||jButton8.getText()=="X"||jButton4.getText()=="X")&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton5.getText()=="X"&&jButton8.getText()=="X"&&(jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton3.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton3.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton5.getText()=="X"&&jButton9.getText()=="X"&&(jButton6.getText()=="X"||jButton4.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton3.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton2.getText()=="X"&&jButton3.getText()=="X"&&(jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton2.getText()=="X"&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton2.getText()=="X"&&jButton4.getText()=="X"&&(jButton3.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton2.getText()=="X"&&jButton6.getText()=="X"&&(jButton4.getText()=="X"||jButton1.getText()=="X"||jButton9.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if (jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton2.getText()=="X"&&jButton7.getText()=="X"&&(jButton1.getText()=="X"||jButton3.getText()=="X"||jButton9.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton2.getText()=="X"&&jButton8.getText()=="X"&&(jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton3.getText()=="X")&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton2.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton2.getText()=="X"&&jButton9.getText()=="X"&&(jButton1.getText()=="X"||jButton3.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton2.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton3.getText()=="X"&&jButton4.getText()=="X"&&(jButton2.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton3.getText()=="X"&&jButton6.getText()=="X"&&(jButton2.getText()=="X"||jButton4.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton3.getText()=="X"&&jButton7.getText()=="X"&&(jButton2.getText()=="X"||jButton1.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton3.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton3.getText()=="X"&&jButton8.getText()=="X"&&(jButton2.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton4.getText()=="X")&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton3.getText()=="X"&&jButton9.getText()=="X"&&(jButton2.getText()=="X"||jButton1.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton4.getText()=="X"&&jButton6.getText()=="X"&&(jButton2.getText()=="X"||jButton3.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton4.getText()=="X"&&jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if (jButton4.getText()=="X"&&jButton7.getText()=="X"&&(jButton2.getText()=="X"||jButton3.getText()=="X"||jButton6.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton4.getText()=="X"&&jButton7.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton4.getText()=="X"&&jButton8.getText()=="X"&&(jButton2.getText()=="X"||jButton1.getText()=="X"||jButton6.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton4.getText()=="X"&&jButton9.getText()=="X"&&(jButton2.getText()=="X"||jButton1.getText()=="X"||jButton6.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton6.getText()=="X"&&jButton7.getText()=="X"&&(jButton1.getText()=="X"||jButton3.getText()=="X"||jButton4.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton6.getText()=="X"&&jButton8.getText()=="X"&&(jButton2.getText()=="X"||jButton3.getText()=="X"||jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton6.getText()=="X"&&jButton9.getText()=="X"&&(jButton1.getText()=="X"||jButton2.getText()=="X"||jButton4.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if (jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton7.getText()=="X"&&jButton8.getText()=="X"&&(jButton3.getText()=="X"||jButton2.getText()=="X"||jButton4.getText()=="X"||jButton6.getText()=="X")&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton7.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton7.getText()=="X"&&jButton9.getText()=="X"&&(jButton3.getText()=="X"||jButton1.getText()=="X"||jButton4.getText()=="X"||jButton6.getText()=="X")&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton7.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton9.getText()=="X"&&jButton8.getText()=="X"&&(jButton1.getText()=="X"||jButton2.getText()=="X"||jButton4.getText()=="X"||jButton6.getText()=="X")&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        //ÝÇË ÈÎÚÞÝÇ ÝåÉË
        //
        //
        //


        else if (jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton8.getText()=="X"&&(jButton6.getText()=="X"||jButton4.getText()=="X")&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }

        else if (jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&(jButton9.getText()=="X"||jButton4.getText()=="X")&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if (jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&(jButton9.getText()=="X"||jButton3.getText()=="X")&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton1.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton1.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton1.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton1.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if (jButton5.getText()=="X"&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton5.getText()=="X"&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton5.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&(jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton1.getText()=="X"&&(jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton7.getText()=="X"&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&(jButton9.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="O"&&jButton1.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton1.getText()=="X"&&(jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if (jButton5.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&(jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="O"&&jButton2.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton1.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if (jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton3.getText()=="O"&&jButton1.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton2.getText()=="X"&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&(jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&(jButton7.getText()=="X"||jButton3.getText()=="X")&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&(jButton1.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton4.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton2.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if (jButton2.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton2.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&(jButton3.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton2.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton1.getText()=="X"&&(jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton3.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton3.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton1.getText()=="X"&&(jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&(jButton1.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton6.getText()=="X"&&(jButton2.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="X"&&(jButton3.getText()=="X"||jButton6.getText()=="X")&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&(jButton2.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton2.getText()=="X"&&(jButton4.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton2.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&(jButton4.getText()=="X"||jButton3.getText()=="X")&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if (jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="X"&&(jButton4.getText()=="X"||jButton1.getText()=="X")&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton7.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&(jButton2.getText()=="X"||jButton3.getText()=="X")&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton7.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&(jButton4.getText()=="X"||jButton3.getText()=="X")&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton7.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&(jButton2.getText()=="X"||jButton1.getText()=="X")&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
    }

}
class hard extends play{
    public hard(Button jButton1, Button jButton2, Button jButton3, Button jButton4, Button jButton5, Button jButton6, Button jButton7, Button jButton8, Button jButton9, TextView txt) {
        super(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, txt);
    }

    public void addAction(Button b) {
        if (b.getText().toString().equals("")) {
            b.setText("X");

            getTheWinner();
            if (win == true) {
                txt.setText("X is winner");
                disable();
            } else {
                hard_play();
                getTheWinner();
                if (win == true) {
                    txt.setText("computer is winner");
                    disable();
                }
            }
        }
    }
    public void AI_TURN(Button b)
    {
        b.setText("O");
    }
    public void hard_play()
    {
        //the first time
        if ((jButton1.getText()!=""||jButton2.getText()!=""||jButton3.getText()!=""||jButton4.getText()!=""||jButton6.getText()!=""||jButton7.getText()!=""||jButton8.getText()!=""||jButton9.getText()!="")&&allButtonsTextLength()==1)
        {
            AI_TURN(jButton5);
        }
        else if (jButton5.getText()!=""&&allButtonsTextLength()==1)
        {
            AI_TURN(jButton3);
        }
        //the second time
        else if (jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton3);
        }
        else if (jButton1.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton2);
        }
        else if (jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton4);
        }
        else if (jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton2);
        }
        else if (jButton1.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton1.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton1.getText()=="X"&&jButton5.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton8);
        }
        else if (jButton5.getText()=="X"&&jButton4.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton4);
        }
        else if (jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton5.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton2);
        }
        else if (jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton2.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if ((jButton1.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton3);
        }
        else if (jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton2.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton2.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton3.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton4);
        }
        else if (jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton6);
        }
        else if (jButton4.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton4.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton1);
        }
        else if (jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton8);
        }
        else if (jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton3);
        }
        else if (jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton7);
        }
        else if (jButton8.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&allButtonsTextLength()==3){
            AI_TURN(jButton8);
        }
        //the third time
        else if ((jButton4.getText()=="X"||jButton6.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }

        else if (jButton7.getText()=="X"&&jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if ((jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if ((jButton2.getText()=="X"||jButton6.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton1.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if ((jButton3.getText()=="X"||jButton4.getText()=="X"||jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if ((jButton3.getText()=="X"||jButton2.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if ((jButton2.getText()=="X"||jButton4.getText()=="X"||jButton6.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton1.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if ((jButton3.getText()=="X"||jButton2.getText()=="X"||jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton1.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton4.getText()=="X"&&jButton1.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if ((jButton3.getText()=="X"||jButton2.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if ((jButton2.getText()=="X"||jButton4.getText()=="X"||jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton5.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if ((jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton1.getText()=="X"&&jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton6.getText()=="X"&&jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton9.getText()=="X"&&jButton5.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if ((jButton1.getText()=="X"||jButton2.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="X"&&jButton4.getText()=="X"&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton5.getText()=="X"&&jButton4.getText()=="X"&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if ((jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton2.getText()=="X"&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton8.getText()=="X"&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if ((jButton1.getText()=="X"||jButton2.getText()=="X"||jButton4.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton3.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if ((jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton5.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if ((jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if ((jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if ((jButton3.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if ((jButton1.getText()=="X"||jButton4.getText()=="X"||jButton9.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if (jButton7.getText()=="X"&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if ((jButton1.getText()=="X"||jButton3.getText()=="X"||jButton9.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton4.getText()=="X"&&jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if ((jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton3.getText()=="X")&&jButton2.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if ((jButton1.getText()=="X"||jButton3.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton4.getText()=="X"&&jButton2.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if ((jButton2.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if ((jButton8.getText()=="X"||jButton2.getText()=="X"||jButton7.getText()=="X"||jButton4.getText()=="X")&&jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if ((jButton1.getText()=="X"||jButton2.getText()=="X"||jButton9.getText()=="X"||jButton8.getText()=="X")&&jButton3.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton3.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if ((jButton2.getText()=="X"||jButton4.getText()=="X"||jButton6.getText()=="X"||jButton7.getText()=="X")&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton9.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if ((jButton1.getText()=="X"||jButton2.getText()=="X"||jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if (jButton4.getText()=="X"&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if ((jButton2.getText()=="X"||jButton3.getText()=="X"||jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton4.getText()=="X"&&jButton6.getText()=="X"&&jButton1.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if ((jButton2.getText()=="X"||jButton3.getText()=="X"||jButton6.getText()=="X"||jButton8.getText()=="X")&&jButton4.getText()=="X"&&jButton7.getText()=="X"&&jButton1.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if (jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if ((jButton1.getText()=="X"||jButton2.getText()=="X"||jButton6.getText()=="X"||jButton9.getText()=="X")&&jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton7.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton9);
        }
        else if ((jButton1.getText()=="X"||jButton2.getText()=="X"||jButton6.getText()=="X"||jButton8.getText()=="X")&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        else if ((jButton1.getText()=="X"||jButton3.getText()=="X"||jButton4.getText()=="X"||jButton9.getText()=="X")&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton8.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if ((jButton3.getText()=="X"||jButton2.getText()=="X"||jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton9.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if ((jButton1.getText()=="X"||jButton2.getText()=="X"||jButton4.getText()=="X"||jButton8.getText()=="X")&&jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton7);
        }
        else if (jButton7.getText()=="X"&&jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton8);
        }
        else if ((jButton3.getText()=="X"||jButton2.getText()=="X"||jButton4.getText()=="X"||jButton6.getText()=="X")&&jButton7.getText()=="X"&&jButton8.getText()=="X"&&jButton9.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton7.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if ((jButton1.getText()=="X"||jButton3.getText()=="X"||jButton4.getText()=="X"||jButton6.getText()=="X")&&jButton7.getText()=="X"&&jButton9.getText()=="X"&&jButton8.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton4);
        }
        else if ((jButton1.getText()=="X"||jButton2.getText()=="X"||jButton4.getText()=="X"||jButton6.getText()=="X")&&jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="O"&&jButton5.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==5){
            AI_TURN(jButton6);
        }
        //the four time
        else if ((jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if ((jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if ((jButton6.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if ((jButton4.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if (jButton7.getText()=="X"&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if ((jButton3.getText()=="X"||jButton9.getText()=="X")&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton2.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if ((jButton4.getText()=="X"||jButton6.getText()=="X")&&jButton1.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton1.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if ((jButton2.getText()=="X"||jButton8.getText()=="X")&&jButton1.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton1.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if ((jButton2.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="X"&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton8.getText()=="X"&&jButton5.getText()=="X"&&jButton1.getText()=="X"&&jButton6.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if ((jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="X"&&jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton5.getText()=="X"&&jButton1.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if ((jButton1.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="X"&&jButton4.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton5.getText()=="X"&&jButton4.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if ((jButton9.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if ((jButton1.getText()=="X"||jButton4.getText()=="X")&&jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton5.getText()=="X"&&jButton7.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if ((jButton6.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton4.getText()=="X"&&jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if ((jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton5.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton3.getText()=="O"&&jButton6.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if ((jButton8.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if ((jButton7.getText()=="X"||jButton9.getText()=="X")&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if ((jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton5.getText()=="X"&&jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="O"&&jButton4.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if ((jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton5.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton3.getText()=="O"&&jButton2.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton5.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton3.getText()=="O"&&jButton2.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if ((jButton7.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton4.getText()=="X"&&jButton2.getText()=="X"&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if ((jButton6.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if ((jButton4.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if ((jButton3.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if ((jButton4.getText()=="X"||jButton6.getText()=="X")&&jButton2.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if (jButton7.getText()=="X"&&jButton2.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if ((jButton1.getText()=="X"||jButton8.getText()=="X")&&jButton2.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton2.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if ((jButton2.getText()=="X"||jButton8.getText()=="X")&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if (jButton7.getText()=="X"&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if ((jButton4.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if ((jButton2.getText()=="X"||jButton8.getText()=="X")&&jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if ((jButton6.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton4.getText()=="X"&&jButton3.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if ((jButton1.getText()=="X"||jButton7.getText()=="X")&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton8);
        }
        else if (jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton9.getText()=="X"&&jButton4.getText()=="X"&&jButton5.getText()=="O"&&jButton6.getText()=="O"&&jButton2.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if ((jButton8.getText()=="X"||jButton7.getText()=="X")&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton6.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton3.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton7);
        }
        else if ((jButton3.getText()=="X"||jButton6.getText()=="X")&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton1.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if ((jButton2.getText()=="X"||jButton6.getText()=="X")&&jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton9.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if ((jButton2.getText()=="X"||jButton8.getText()=="X")&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if (jButton1.getText()=="X"&&jButton4.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if ((jButton3.getText()=="X"||jButton4.getText()=="X")&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton9);
        }
        else if (jButton9.getText()=="X"&&jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&jButton1.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if ((jButton2.getText()=="X"||jButton4.getText()=="X")&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if (jButton3.getText()=="X"&&jButton6.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton7.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if ((jButton1.getText()=="X"||jButton4.getText()=="X")&&jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton2);
        }
        else if (jButton2.getText()=="X"&&jButton6.getText()=="X"&&jButton9.getText()=="X"&&jButton7.getText()=="X"&&jButton5.getText()=="O"&&jButton3.getText()=="O"&&jButton8.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }
        else if ((jButton2.getText()=="X"||jButton3.getText()=="X")&&jButton7.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton8.getText()=="X"&&jButton1.getText()=="X"&&jButton5.getText()=="O"&&jButton9.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if ((jButton1.getText()=="X"||jButton3.getText()=="X")&&jButton7.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton6);
        }
        else if (jButton6.getText()=="X"&&jButton7.getText()=="X"&&jButton9.getText()=="X"&&jButton2.getText()=="X"&&jButton5.getText()=="O"&&jButton8.getText()=="O"&&jButton4.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton3);
        }
        else if ((jButton1.getText()=="X"||jButton2.getText()=="X")&&jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton4);
        }
        else if (jButton4.getText()=="X"&&jButton8.getText()=="X"&&jButton9.getText()=="X"&&jButton3.getText()=="X"&&jButton5.getText()=="O"&&jButton7.getText()=="O"&&jButton6.getText()=="O"&&allButtonsTextLength()==7){
            AI_TURN(jButton1);
        }

    }
}
