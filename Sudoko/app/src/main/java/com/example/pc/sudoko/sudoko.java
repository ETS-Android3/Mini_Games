package com.example.pc.sudoko;


import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class sudoko {
public static int Level_chosen=0;
    public static boolean sound = true;
    EditText[] edt = new EditText[81];
    TextView[] txt = new TextView[9];
    int number_of_1 = 0;
    int number_of_2 = 0;
    int number_of_3 = 0;
    int number_of_4 = 0;
    int number_of_5 = 0;
    int number_of_6 = 0;
    int number_of_7 = 0;
    int number_of_8 = 0;
    int number_of_9 = 0;
    int[][] arr = new int[13][81];

    public sudoko(EditText[] edt, TextView[] txt) {
        for (int i = 0; i < 81; i++) {
            this.edt[i] = edt[i];
        }
        for (int j = 0; j < 9; j++) {
            this.txt[j] = txt[j];
        }
        arr[0]  = new int[]{7,3,5,6,1,4,8,9,2,8,4,2,9,7,3,5,6,1,9,6,1,2,8,5,3,7,4,2,8,6,3,4,9,1,5,7,4,1,3,8,5,7,9,2,6,5,7,9,1,2,6,4,3,8,1,5,7,4,9,2,6,8,3,6,9,4,7,3,8,2,1,5,3,2,8,5,6,1,7,4,9};
        arr[1]  = new int[]{1,5,2,4,8,9,3,7,6,7,3,9,2,5,6,8,4,1,4,6,8,3,7,1,2,9,5,3,8,7,1,2,4,6,5,9,5,9,1,7,6,3,4,2,8,2,4,6,8,9,5,7,1,3,9,1,4,6,3,7,5,8,2,6,2,5,9,4,8,1,3,7,8,7,3,5,1,2,9,6,4};
        arr[2]  = new int[]{8,2,7,1,5,4,3,9,6,9,6,5,3,2,7,1,4,8,3,4,1,6,8,9,7,5,2,5,9,3,4,6,8,2,7,1,4,7,2,5,1,3,6,8,9,6,1,8,9,7,2,4,3,5,7,8,6,2,3,5,9,1,4,1,5,4,7,9,6,8,2,3,2,3,9,8,4,1,5,6,7};
        arr[3]  = new int[]{4,7,9,5,8,6,1,3,2,1,6,2,4,3,7,8,9,5,5,3,8,9,1,2,4,6,7,2,5,4,7,9,1,3,8,6,9,1,3,8,6,5,7,2,4,6,8,7,2,4,3,5,1,9,3,4,5,6,2,9,1,7,8,8,9,1,3,7,4,6,5,2,7,2,6,1,5,8,9,4,3};
        arr[4]  = new int[]{2,6,1,5,8,9,4,3,7,9,7,4,1,2,3,5,8,6,8,3,5,7,4,6,9,1,2,3,1,9,4,7,2,8,6,5,7,8,6,9,5,1,2,4,3,4,5,2,6,3,8,7,9,1,5,4,3,8,1,7,6,2,9,6,2,7,3,9,4,1,5,8,1,9,8,2,6,5,3,7,4};
        arr[5]  = new int[]{1,7,8,5,4,3,9,6,2,9,4,3,6,2,7,8,1,5,6,5,2,1,9,8,4,3,7,3,8,6,4,5,2,1,7,9,5,1,9,7,8,6,3,2,4,7,2,4,3,1,9,5,8,6,2,3,1,9,7,4,6,5,8,8,9,5,2,6,1,7,4,3,4,6,7,8,3,5,2,9,1};
        arr[6]  = new int[]{9,2,6,8,7,1,5,3,4,4,7,3,2,5,6,1,8,9,8,5,1,3,4,9,6,7,2,3,4,2,9,1,5,7,6,8,5,6,8,4,2,7,3,9,1,1,9,7,6,8,3,4,2,5,6,8,5,1,3,2,9,4,7,7,3,4,5,9,8,2,1,6,2,1,9,7,6,4,8,5,3};
        arr[7]  = new int[]{1,7,8,9,2,6,5,4,3,9,4,3,8,5,1,6,2,7,6,5,2,4,7,3,1,9,8,8,9,5,7,3,4,2,6,1,4,6,7,2,1,9,8,3,5,2,3,1,6,8,5,9,7,4,7,2,4,5,6,8,3,1,9,5,1,9,3,4,2,7,8,6,3,8,6,1,9,7,4,5,2};
        arr[8]  = new int[]{3,1,6,8,2,7,9,4,5,7,5,2,9,4,6,1,3,8,4,8,9,1,3,5,2,7,6,8,7,3,2,9,1,5,6,4,2,9,4,5,6,8,3,1,7,1,6,5,4,7,3,8,2,9,9,3,8,6,1,4,7,5,2,5,4,7,3,8,2,6,9,1,6,2,1,7,5,9,4,8,3};
        arr[8]  = new int[]{3,1,9,7,2,4,8,6,5,4,8,2,3,6,5,7,9,1,7,5,6,9,8,1,2,4,3,9,3,4,2,1,7,5,8,6,8,7,5,4,3,6,9,1,2,2,6,1,5,9,8,4,3,7,5,4,3,1,7,9,6,2,8,6,2,7,8,4,3,1,5,9,1,9,8,6,5,2,3,7,4};
        arr[9]  = new int[]{2,3,8,5,1,7,4,9,6,6,9,1,8,2,4,7,5,3,5,4,7,9,3,6,2,1,8,8,7,3,1,4,5,9,6,2,9,2,4,6,7,3,1,8,5,1,6,5,2,9,8,3,7,4,7,5,2,3,8,1,6,4,9,4,8,9,7,6,2,5,3,1,3,1,6,4,5,9,8,2,7};
        arr[10] = new int[]{2,6,1,8,9,5,7,3,4,9,7,4,2,3,1,6,8,5,8,3,5,4,6,7,2,1,9,3,1,9,7,2,4,5,6,8,7,8,6,5,1,9,3,4,2,4,5,2,3,8,6,1,9,7,1,9,8,6,5,2,4,7,3,6,2,7,9,4,3,8,5,1,5,4,3,1,7,8,9,2,6};
        arr[11] = new int[]{5,3,4,8,7,1,2,6,9,6,7,2,3,4,9,5,1,8,1,8,9,2,5,6,7,3,4,4,2,5,6,8,3,9,7,1,7,6,8,9,1,5,4,2,3,3,9,1,4,2,7,6,8,5,9,4,7,1,3,2,8,5,6,2,1,6,5,9,8,3,4,7,8,5,3,7,6,4,1,9,2};
        arr[12] = new int[]{1,3,5,2,7,6,9,8,4,9,4,6,1,3,8,2,5,7,7,2,8,9,4,5,6,1,3,2,6,9,5,1,4,3,7,8,5,8,1,3,6,7,4,2,9,4,7,3,8,2,9,5,6,1,6,9,4,7,5,1,8,3,2,8,1,2,6,9,3,7,4,5,3,5,7,4,8,2,1,9,6};
    }

    public void no_of_number() {
        number_of_1 = 0;
        number_of_2 = 0;
        number_of_3 = 0;
        number_of_4 = 0;
        number_of_5 = 0;
        number_of_6 = 0;
        number_of_7 = 0;
        number_of_8 = 0;
        number_of_9 = 0;
        for (int i = 0; i < 81; i++) {
            if (edt[i].getText().toString().trim().equals("1"))
                number_of_1++;
            if (edt[i].getText().toString().trim().equals("2"))
                number_of_2++;
            if (edt[i].getText().toString().trim().equals("3"))
                number_of_3++;
            if (edt[i].getText().toString().trim().equals("4"))
                number_of_4++;
            if (edt[i].getText().toString().trim().equals("5"))
                number_of_5++;
            if (edt[i].getText().toString().trim().equals("6"))
                number_of_6++;
            if (edt[i].getText().toString().trim().equals("7"))
                number_of_7++;
            if (edt[i].getText().toString().trim().equals("8"))
                number_of_8++;
            if (edt[i].getText().toString().trim().equals("9"))
                number_of_9++;
        }

    }
public void recolor_All(){
        for (int i=0;i<81;i++){
            edt[i].setBackgroundResource(R.drawable.button);
        }
}
    public boolean check(EditText e1, EditText e2, EditText e3, EditText e4, EditText e5, EditText e6, EditText e7, EditText e8, EditText e9) {
        boolean checked = true;
        EditText[] e = new EditText[9];
        e[0] = e1;
        e[1] = e2;
        e[2] = e3;
        e[3] = e4;
        e[4] = e5;
        e[5] = e6;
        e[6] = e7;
        e[7] = e8;
        e[8] = e9;
        for (int i = 0; i < 9; i++) {
            for (int j = i+1 ; j < 9; j++) {
                if (e[i].getText().toString().equals(e[j].getText().toString())&&!(e[i].getText().toString().equals(""))) {

                        e[i].setBackgroundResource(R.drawable.rededt);
                        e[j].setBackgroundResource(R.drawable.rededt);
                        checked = false;

                }
            }
        }
        return checked;
    }
    public boolean allnotequals() {
    /*
        ////////
         */
        boolean win = true;
        if (!check(edt[0], edt[1], edt[2], edt[3], edt[4], edt[5], edt[6], edt[7], edt[8])) {
            win = false;
        }
        if (!check(edt[9], edt[10], edt[11], edt[12], edt[13], edt[14], edt[15], edt[16], edt[17])) {
            win = false;
        }
        if (!check(edt[18], edt[19], edt[20], edt[21], edt[22], edt[23], edt[24], edt[25], edt[26])) {
            win = false;
        }
        if (!check(edt[27], edt[28], edt[29], edt[30], edt[31], edt[32], edt[33], edt[34], edt[35])) {
            win = false;
        }
        if (!check(edt[36], edt[37], edt[38], edt[39], edt[40], edt[41], edt[42], edt[43], edt[44])) {
            win = false;
        }
        if (!check(edt[45], edt[46], edt[47], edt[48], edt[49], edt[50], edt[51], edt[52], edt[53])) {
            win = false;
        }
        if (!check(edt[54], edt[55], edt[56], edt[57], edt[58], edt[59], edt[60], edt[61], edt[62])) {
            win = false;
        }
        if (!check(edt[63], edt[64], edt[65], edt[66], edt[67], edt[68], edt[69], edt[70], edt[71])) {
            win = false;
        }

        if (!check(edt[72], edt[73], edt[74], edt[75], edt[76], edt[77], edt[78], edt[79], edt[80])) {
            win = false;
        }
        if (!check(edt[0], edt[9], edt[18], edt[27], edt[36], edt[45], edt[54], edt[63], edt[72])) {
            win = false;
        }
        /*
        /
        /
        /
         */
        if (!check(edt[1], edt[10], edt[19], edt[28], edt[37], edt[46], edt[55], edt[64], edt[73])) {
            win = false;
        }

        if (!check(edt[2], edt[11], edt[20], edt[29], edt[38], edt[47], edt[56], edt[65], edt[74])) {
            win = false;
        }

        if (!check(edt[3], edt[12], edt[21], edt[30], edt[39], edt[48], edt[57], edt[66], edt[75])) {
            win = false;
        }
        if (!check(edt[4], edt[13], edt[22], edt[31], edt[40], edt[49], edt[58], edt[67], edt[76])) {
            win = false;
        }
        if (!check(edt[5], edt[14], edt[23], edt[32], edt[41], edt[50], edt[59], edt[68], edt[77])) {
            win = false;
        }

        if (!check(edt[6], edt[15], edt[24], edt[33], edt[42], edt[51], edt[60], edt[69], edt[78])) {
            win = false;
        }
        if (!check(edt[7], edt[16], edt[25], edt[34], edt[43], edt[52], edt[61], edt[70], edt[79])) {
            win = false;
        }
        if (!check(edt[8], edt[17], edt[26], edt[35], edt[44], edt[53], edt[62], edt[71], edt[80])) {
            win = false;
        }

        /*
        ///
        ///
        ///
         */
        if (!check(edt[0], edt[1], edt[2], edt[9], edt[10], edt[11], edt[18], edt[19], edt[20])) {
            win = false;
        }
        if (!check(edt[3], edt[4], edt[5], edt[12], edt[13], edt[14], edt[21], edt[22], edt[23])) {
            win = false;
        }

        if (!check(edt[6], edt[7], edt[8], edt[15], edt[16], edt[17], edt[24], edt[25], edt[26])) {
            win = false;
        }
        if (!check(edt[27], edt[28], edt[29], edt[36], edt[37], edt[38], edt[45], edt[46], edt[47])) {
            win = false;
        }
        if (!check(edt[30], edt[31], edt[32], edt[39], edt[40], edt[41], edt[48], edt[49], edt[50])) {
            win = false;
        }
        if (!check(edt[33], edt[34], edt[35], edt[42], edt[43], edt[44], edt[51], edt[52], edt[53])) {
            win = false;
        }
        if (!check(edt[54], edt[55], edt[56], edt[63], edt[64], edt[65], edt[72], edt[73], edt[74])) {
            win = false;
        }
        if (!check(edt[57], edt[58], edt[59], edt[66], edt[67], edt[68], edt[75], edt[76], edt[77])) {
            win = false;
        }
        if (!check(edt[60], edt[61], edt[62], edt[69], edt[70], edt[71], edt[78], edt[79], edt[80])) {
            win = false;
        }
        return win;
    }

    public boolean win() {
        if (number_of_1 == 9 && number_of_2 == 9 && number_of_3 == 9 && number_of_4 == 9 && number_of_5 == 9 && number_of_6 == 9 && number_of_7 == 9 && number_of_8 == 9 && number_of_9 == 9) {
            if (allnotequals()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void color() {
        no_of_number();

        if (number_of_1 < 9) {
            txt[0].setBackgroundResource(R.drawable.bb);
        } else if (number_of_1 == 9) {
            txt[0].setBackgroundResource(R.drawable.bb9);
        } else {
            txt[0].setBackgroundResource(R.drawable.bbmore);
        }

        if (number_of_2 < 9) {
            txt[1].setBackgroundResource(R.drawable.bb);
        } else if (number_of_2 == 9) {
            txt[1].setBackgroundResource(R.drawable.bb9);
        } else {
            txt[1].setBackgroundResource(R.drawable.bbmore);
        }

        if (number_of_3 < 9) {
            txt[2].setBackgroundResource(R.drawable.bb);
        } else if (number_of_3 == 9) {
            txt[2].setBackgroundResource(R.drawable.bb9);
        } else {
            txt[2].setBackgroundResource(R.drawable.bbmore);
        }

        if (number_of_4 < 9) {
            txt[3].setBackgroundResource(R.drawable.bb);
        } else if (number_of_4 == 9) {
            txt[3].setBackgroundResource(R.drawable.bb9);
        } else {
            txt[3].setBackgroundResource(R.drawable.bbmore);
        }

        if (number_of_5 < 9) {
            txt[4].setBackgroundResource(R.drawable.bb);
        } else if (number_of_5 == 9) {
            txt[4].setBackgroundResource(R.drawable.bb9);
        } else {
            txt[4].setBackgroundResource(R.drawable.bbmore);
        }

        if (number_of_6 < 9) {
            txt[5].setBackgroundResource(R.drawable.bb);
        } else if (number_of_6 == 9) {
            txt[5].setBackgroundResource(R.drawable.bb9);
        } else {
            txt[5].setBackgroundResource(R.drawable.bbmore);
        }

        if (number_of_7 < 9) {
            txt[6].setBackgroundResource(R.drawable.bb);
        } else if (number_of_7 == 9) {
            txt[6].setBackgroundResource(R.drawable.bb9);
        } else {
            txt[6].setBackgroundResource(R.drawable.bbmore);
        }

        if (number_of_8 < 9) {
            txt[7].setBackgroundResource(R.drawable.bb);
        } else if (number_of_8 == 9) {
            txt[7].setBackgroundResource(R.drawable.bb9);
        } else {
            txt[7].setBackgroundResource(R.drawable.bbmore);
        }

        if (number_of_9 < 9) {
            txt[8].setBackgroundResource(R.drawable.bb);
        } else if (number_of_9 == 9) {
            txt[8].setBackgroundResource(R.drawable.bb9);
        } else {
            txt[8].setBackgroundResource(R.drawable.bbmore);
        }
    }

    public void Start(int num) {

        Random Rand = new Random();
        int Noofarray = Rand.nextInt(13);
        int place;
        String s;
        for (int i = 0; i < num; i++) {
while (true) {
    place = Rand.nextInt(81);
    if (edt[place].getText().toString().equals("")){
        s=""+arr[Noofarray][place];
        edt[place].setText(s);
        edt[place].setEnabled(false);

        break;
    }
}
        }
    }
}