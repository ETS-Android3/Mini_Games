package com.example.pc.hangman;
import android.icu.util.ULocale;

import java.util.Locale;
import java.util.Random;

public class Words {
    String EasyAnimals[] = {"OCTOPUS", "DOLPHIN" ,"TIGER", "FROG" ,"PONHY" ,"SEAHORSE" ,"DOG" ,"LOBSTER" ,"PIG" ,"SHARK" 	};
    String MediumAnimals[] = {"CHIMPAZNZEE"," TASMANIAN DEVIL", "LEOPARD","BUTTERFLY","COUGAR" ,"HEDGEHOG" ,"SQUIRREL" ,"OTTER" ,"CAT" ,"GOOSE"};
    String HardAnimals[] = {"ORANGUTAN","DEER","SHEEP","KOALA","JUGUAR","BUFFALO","TOUCAN","PORCUPINE","CROCODILE","LLAMA","KOMODO" };

    private String EasyBooks[]  ={"E BIBLE","ANIMAL FARM","DRACULA","ROME AND JULIET","MORT","ONEDAY","MOBY DICK","GONE GIRL","ON THE ROAD","RIDERS","WORLD WAR Z","THE INSIDE","RATBURGER","ELOISE","MY BOOKY WOOKY" };
    private String MediumBooks[] = {"THE SNOW CHILD" ,"RUNNING MY LIFE","ENTWINED WITH YOU" ,"BRING UP THE BODIES","THE SNAIL AND THW WHALE" ,"CINDERALLA SECRET","FRANK SKINNER","BLOOD OF DRAGONS","LIFE AND LAUGHING","AMERICA PSYCHO" };
    private String HardBooks[] ={"LOOKING FOR ALASKA","THE JAMES BOND ARCHIVES","A THOUSAND SPLENDID","THE PILLARS OF THE EARTH","THE CACUAL VACANY","HOW TO BE A WOMAN","WONDERS THE UNIVERSE","THE PRINCESS DIARIES","THE PERKS OF BEING A WALLFLOWER","BRIEF HISTORY OF TIME" };

    private String EasyCities[] ={"CARACAS" ,"DUBLIN ","VANCOUVER","PRAGUE" ,"ISLAMABAD" ,"ROME ","PYONGYANG" ,"MARDID","LISBON" ,"ATHENS "};
    private String MediumCities[]={"SEOUL" ,"BEJING" ,"ANTANARIVO" ,"BUDDAPEST","MANILA" ,"BELFAST"};
    private String HardCities[]={"CHATTANOOGA" ,"ALBANY ","COLOMBUS ","COPENHAGEN ","JERUSALEM" ,"BERIUT ","HELSINKI" ,"PHOENIX "};

    private String EasyMovies[] = {"MOON" ,"BRAVEHEART" , "CASINO ROYALE " , "MEAN GIRLS" , "UP" , "HEAT" , "RED" };
    private String MediumMovies[] = {"BLOOD DIAMOND" ,"GOODFELLAS" , "STAR TREK" ,"THE AVENGERS" , "TOMB RAIDER" , "TRANSFORMERS" ,"THE BUSINESS" ,"INTERSTELLAR"};
    private String HardMovies[] = {"THE FAST AND THE FURIOUS" , "THE BOURNE IDENTITY" , "CATCH ME IF YOY CAN" , "SLUMDOG MILLIONAIRE" , "THE USUAL SUSPECTS" , "THE WOLF oF WALL STREET"};

    private String EasyFP[] = {"BEYONCE" ,"BARACK OBAMA" , "MADONNA" , "SHAKIRA" , "BILL GATES" , "TOM HANKS" , "WOLL SMITH" , "DEMI LOVATO" , "NAPOLEON"};
    private String MediumFp[] = {"BRAD PITT" , "DAVID BECKHAM" , "MOHAMED SALAH" , "MARILYN MONROE" , "JOHNNY DEPP" , "JUSTIN BIEBER" , "KATY PERRY" , "CHARLES DAWRIN " , "CELOPATRA"};
    private String HardFp[] ={"ABRAHAM LINCOLN" , "OPERA WINFERY" , "ANGELINA JOLIE" , "FARRAH FAWCETT" , "CRISTIANO RONALDO" , "NAGIUB MAHFOZ" , "PRINCESS DIANA" , "GEORGE CLOONEY" , "MOHAMED ALI" , "WILLIAM SHAKEDPEARE"};

    private String EasyOW[] = {"BOY GIRL " , "HOT COLD" , "BIG SMALL" , "LONG SHORT " , "ODD EVEN " , "RICH POOR" , "TIE UNTIE" , "OLD NEW " , "DOWN UP" , "FIRST LAST "};
    private String MediumOW[]={"BLUNT SHARP ","REPEL ATTRACT " , "LOOSE TIGHT " , "ANGREY CALM" , "SINGEL DOUBLE" , "HEAVEN HELL" , "ABOVE BELLOW" , "THICK THIN" , "WHOLE PARTIAL" , "DARK LIGHT "};
    private  String HardOW[] = {"BEGINNIG ENDINING" , "NEXT PERVIOUS" , "OUTSIDE INSIDE" , "SINGULAR PLURAL" , "TRANSPARENT OPAQUE" , "DIFFERENT SAME " , "FOOLISH CLEVER " , "DEPART ARRIVE " , "NATURAL ARTIFICIAL" , "SMOOTH ROUGH"};

    String HardFoods[] ={"SKIMMED MILK " , "PINEAPPLE" , "TANGEINE" , "CUMIN" , "PEPPERONI" , "POPCORN" , "HAZELNUT" , "CORNFLOUR" , "BAKED BEANS"};
    String EasyFoods[]={"BAKING SODA" ,"CINNAMON" , "MUSTARD" , "PASTA" , "BROWN BREAD" , "GOOSEBERRY" , "ICE CREAM" , "CABBAGE" , "SPONGE" , "SALAD" , "LAMB"};
    String MediumFoods []={"WHITE BREAD" , "FIG " , "SMOOTHIE" , "ROCK SALT" , "MINCED BEEF" , "COTTAGE CHEESE" , "VINAIGRETTE" , "FRUIT JUICE" , "FRIES"};


    int Level ;
    String MyWord;
    String Category ;
    Random randomWord = new Random() ;
    int index ;

    public Words (int i , String s)
    {
        this.Category=s;
        this.Level=i;

    }

    public String GetWord ()
    {

        if (Category.equals("Foods")) {
            if (Level == 0) {
                index = randomWord.nextInt(EasyFoods.length);
                MyWord = EasyFoods[index];

            } else if (Level == 1) {
                index = randomWord.nextInt(MediumFoods.length);
                MyWord = MediumFoods[index];
            } else if (Level == 2) {
                index = randomWord.nextInt(HardFoods.length);
                MyWord = HardFoods[index];
            }
        }
        else if (Category.equals("Movies")) {
            if (Level == 0) {
                index = randomWord.nextInt(EasyMovies.length);
                MyWord = EasyMovies[index];

            } else if (Level == 1) {
                index = randomWord.nextInt(MediumMovies.length);
                MyWord = MediumMovies[index];
            } else if (Level == 2) {
                index = randomWord.nextInt(HardMovies.length);
                MyWord = HardMovies[index];
            }
        }
        else if (Category.equals("Cities")) {
            if (Level == 0) {
                index = randomWord.nextInt(EasyCities.length);
                MyWord = EasyCities[index];

            } else if (Level == 1) {
                index = randomWord.nextInt(MediumCities.length);
                MyWord = MediumCities[index];
            } else if (Level == 2) {
                index = randomWord.nextInt(HardCities.length);
                MyWord = HardCities[index];
            }
        }
        else if (Category.equals("Opposite Words")) {
            if (Level == 0) {
                index = randomWord.nextInt(EasyOW.length);
                MyWord = EasyOW[index];

            } else if (Level == 1) {
                index = randomWord.nextInt(MediumOW.length);
                MyWord = MediumOW[index];
            } else if (Level == 2) {
                index = randomWord.nextInt(HardOW.length);
                MyWord = HardOW[index];
            }
        }

        else if(Category.equals("Books"))
        {
            if (Level == 0) {
                index = randomWord.nextInt(EasyBooks.length);
                MyWord = EasyBooks[index];

            } else if (Level == 1) {
                index = randomWord.nextInt(MediumBooks.length);
                MyWord = MediumBooks[index];
            } else if (Level == 2) {
                index = randomWord.nextInt(HardBooks.length);
                MyWord = HardBooks[index];
            }
        }

        else if (Category.equals("Famous Peopel"))
        {
            if (Level == 0)
            {
                index=randomWord.nextInt(EasyFP.length);
                MyWord = EasyFP[index];

            }
            else if (Level == 1)
            {
                index=randomWord.nextInt(MediumFp.length);
                MyWord = MediumFp[index];
            }
            else if (Level == 2)
            {
                index=randomWord.nextInt(HardFp.length);
                MyWord = HardFp[index];
            }

        }


        if (Category.equals("Animals"))
        {
            if (Level == 0) {
                index = randomWord.nextInt(EasyAnimals.length);
                MyWord = EasyAnimals[index];

            } else if (Level == 1) {
                index = randomWord.nextInt(MediumAnimals.length);
                MyWord = MediumAnimals[index];
            } else if (Level == 2) {
                index = randomWord.nextInt(HardAnimals.length);
                MyWord = HardAnimals[index];
            }
        }

        return MyWord;
    }

}