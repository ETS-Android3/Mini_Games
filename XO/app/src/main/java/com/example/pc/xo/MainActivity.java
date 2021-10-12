package com.example.pc.xo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String startGame="O";
    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    Button Button6;
    Button Button7;
    Button Button8;
    Button Button9;
    Button Button10;
    Button back;
    TextView txt;
    play p;
    LinearLayout l;
    int i;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button1=(Button) findViewById(R.id.b1);
         Button2=(Button) findViewById(R.id.b2);
         Button3=(Button) findViewById(R.id.b3);
         Button4=(Button) findViewById(R.id.b4);
         Button5=(Button) findViewById(R.id.b5);
         Button6=(Button) findViewById(R.id.b6);
         Button7=(Button) findViewById(R.id.b7);
         Button8=(Button) findViewById(R.id.b8);
         Button9=(Button) findViewById(R.id.b9);
        Button10=(Button) findViewById(R.id.r);

        l = (LinearLayout) findViewById(R.id.linear);
        back=(Button) findViewById(R.id.b);
        txt= (TextView) findViewById(R.id.win);

        p = new play(Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,txt);

        if (StartActivity.level==0){
            p = new easy(Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,txt);
        }
        else if (StartActivity.level==1){
            p = new normal(Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,txt);
        }
        else if (StartActivity.level==2){
            p = new hard(Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,txt);
        }
        else if (StartActivity.level==3){
            p = new play(Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,txt);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.s="O";
                Intent i = new Intent(MainActivity.this,StartActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button1);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button2);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button2);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button3);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button4);
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button5);
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button6);
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button7);
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button8);
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.addAction(Button9);
            }
        });
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.enable();
            }
        });

    }


}
