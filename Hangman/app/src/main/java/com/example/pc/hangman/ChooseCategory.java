package com.example.pc.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class ChooseCategory extends AppCompatActivity {
    public static String Category ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_category);
        final Spinner s;
        final Button st = (Button)findViewById(R.id.btn_start);
        Button back;

        s  = (Spinner)findViewById(R.id.Categories);
        //s.clearFocus();


        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Category = s.getSelectedItem().toString();
                startActivity(new Intent(ChooseCategory.this,GameActivity.class));
                finish();


            }
        });

        back=(Button)findViewById(R.id.btn_Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseCategory.this,LevelChoose.class));
                finish();


            }
        });
    }
}
