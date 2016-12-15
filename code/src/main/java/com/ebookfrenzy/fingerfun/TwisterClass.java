package com.ebookfrenzy.fingerfun;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnTouchListener;
import java.util.Random;

public class TwisterClass extends Activity {

    String winner;
    Button btn8, btn3;
    int i = 0, j = 0;
    SeekBar bar1, bar2;


    int[][] accepted_One = new int[3][4];
    int[][] accepted_Two = new int[3][4];
    int[][] screenState = new int[3][4];

    int turnNumber = 0;
    int numEntries = 0;
    //This is the number of entries in the screenState matrix, which denotes
    // how many fingers are currently on the screen.
    Random randCol = new Random();
    int Random_Col = randCol.nextInt(3);
    Random randRow = new Random();
    int Random_Row = randRow.nextInt(4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twister);

        final Button Twister_btn1 = (Button) findViewById(R.id.tb1);
        final Button Twister_btn2 = (Button) findViewById(R.id.tb2);
        final Button Twister_btn3 = (Button) findViewById(R.id.tb3);
        final Button Twister_btn4 = (Button) findViewById(R.id.tb4);
        final Button Twister_btn5 = (Button) findViewById(R.id.tb5);
        final Button Twister_btn6 = (Button) findViewById(R.id.tb6);
        final Button Twister_btn7 = (Button) findViewById(R.id.tb7);
        final Button Twister_btn8 = (Button) findViewById(R.id.tb8);
        final Button Twister_btn9 = (Button) findViewById(R.id.tb9);
        final Button Twister_btn10 = (Button) findViewById(R.id.tb10);
        final Button Twister_btn11 = (Button) findViewById(R.id.tb11);
        final Button Twister_btn12 = (Button) findViewById(R.id.tb12);

        Twister_btn1.setEnabled(false);
        Twister_btn2.setEnabled(false);
        Twister_btn3.setEnabled(false);
        Twister_btn4.setEnabled(false);
        Twister_btn5.setEnabled(false);
        Twister_btn6.setEnabled(false);
        Twister_btn7.setEnabled(false);
        Twister_btn8.setEnabled(false);
        Twister_btn9.setEnabled(false);
        Twister_btn10.setEnabled(false);
        Twister_btn11.setEnabled(false);
        Twister_btn12.setEnabled(false);


        accepted_One[Random_Col][Random_Row] = (turnNumber % 2) + 1;
        if (Random_Col == 0 && Random_Row == 0) {
            Twister_btn1.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
            }

        } else if (Random_Col == 1 && Random_Row == 0) {
            Twister_btn2.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 2 && Random_Row == 0) {
            Twister_btn3.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 0 && Random_Row == 1) {
            Twister_btn4.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 1 && Random_Row == 1) {
            Twister_btn5.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 2 && Random_Row == 1) {
            Twister_btn6.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 0 && Random_Row == 2) {
            Twister_btn7.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 1 && Random_Row == 2) {
            Twister_btn8.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 2 && Random_Row == 2) {
            Twister_btn9.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 0 && Random_Row == 3) {
            Twister_btn10.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 1 && Random_Row == 3) {
            Twister_btn11.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
            }
        } else if (Random_Col == 2 && Random_Row == 3) {
            Twister_btn12.setEnabled(true);
            if ((turnNumber + 1) % 2 == 1) {
                Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
            }
            if ((turnNumber + 1) % 2 == 0) {
                Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
            }
        }


        Twister_btn1.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn1 = (Button) findViewById(R.id.tb1);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[0][0] = turnNumber % 2 + 1;
                    accepted_Two[0][0] = turnNumber % 2 + 1;
                    screenState[0][0] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.




                    }


                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[0][0] = 0;

                    if (!(screenState[0][0] == accepted_One[0][0] || screenState[0][0] == accepted_Two[0][0])) {
                        Twister_btn1.setBackgroundResource(R.drawable.round_button_youlose);


                        if(accepted_One[0][0] == 2)

                        {Popup_player1();
                        }else if(accepted_One[0][0] == 1){

                            Popup_player2();
                        }


                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")
                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                        // return button
                    }

                }
                return false;
            }
        });

        Twister_btn2.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn2 = (Button) findViewById(R.id.tb2);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[1][0] = turnNumber % 2 + 1;
                    accepted_Two[1][0] = turnNumber % 2 + 1;
                    screenState[1][0] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.




                    }


                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[1][0] = 0;

                    if (!(screenState[1][0] == accepted_One[1][0] || screenState[1][0] == accepted_Two[1][0])) {
                        Twister_btn2.setBackgroundResource(R.drawable.round_button_youlose);
                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")
                        if(accepted_One[1][0] == 2)

                        {Popup_player1();
                        }else if(accepted_One[1][0] == 1){

                            Popup_player2();
                        }

                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
        Twister_btn3.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn3 = (Button) findViewById(R.id.tb3);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[2][0] = turnNumber % 2 + 1;
                    accepted_Two[2][0] = turnNumber % 2 + 1;
                    screenState[2][0] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.




                    }

                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[2][0] = 0;

                    if (!(screenState[2][0] == accepted_One[2][0] || screenState[2][0] == accepted_Two[2][0])) {
                        Twister_btn3.setBackgroundResource(R.drawable.round_button_youlose);
                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")
                        if(accepted_One[2][0] == 2)

                        {Popup_player1();
                        }else if(accepted_One[2][0] == 1){

                            Popup_player2();
                        }

                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
        Twister_btn4.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn4 = (Button) findViewById(R.id.tb4);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[0][1] = turnNumber % 2 + 1;
                    accepted_Two[0][1] = turnNumber % 2 + 1;
                    screenState[0][1] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.




                    }



                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[0][1] = 0;

                    if (!(screenState[0][1] == accepted_One[0][1] || screenState[0][1] == accepted_Two[0][1])) {
                        Twister_btn4.setBackgroundResource(R.drawable.round_button_youlose);
                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")

                        if(accepted_One[0][2] == 2)

                        {Popup_player1();
                        }else if(accepted_One[0][2] == 1){

                            Popup_player2();
                        }

                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
        Twister_btn5.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn5 = (Button) findViewById(R.id.tb5);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[1][1] = turnNumber % 2 + 1;
                    accepted_Two[1][1] = turnNumber % 2 + 1;
                    screenState[1][1] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.




                    }


                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[1][1] = 0;

                    if (!(screenState[1][1] == accepted_One[1][1] || screenState[1][1] == accepted_Two[1][1])) {
                        Twister_btn5.setBackgroundResource(R.drawable.round_button_youlose);
                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")
                        if(accepted_One[1][1] == 2)

                        {Popup_player1();
                        }else if(accepted_One[1][1] == 1){

                            Popup_player2();
                        }

                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
        Twister_btn6.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn6 = (Button) findViewById(R.id.tb6);


            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[2][1] = turnNumber % 2 + 1;
                    accepted_Two[2][1] = turnNumber % 2 + 1;
                    screenState[2][1] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.




                    }


                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[2][1] = 0;

                    if (!(screenState[2][1] == accepted_One[2][1] || screenState[2][1] == accepted_Two[2][1])) {
                        Twister_btn6.setBackgroundResource(R.drawable.round_button_youlose);
                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")

                        if(accepted_One[2][1] == 2)

                        {Popup_player1();
                        }else if(accepted_One[2][1] == 1){

                            Popup_player2();
                        }

                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
        Twister_btn7.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn7 = (Button) findViewById(R.id.tb7);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[0][2] = turnNumber % 2 + 1;
                    accepted_Two[0][2] = turnNumber % 2 + 1;
                    screenState[0][2] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.




                    }






                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[0][2] = 0;

                    if (!(screenState[0][2] == accepted_One[0][2] || screenState[0][2] == accepted_Two[0][2])) {
                        Twister_btn7.setBackgroundResource(R.drawable.round_button_youlose);
                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")

                        if(accepted_One[0][2] == 2)

                        {Popup_player1();
                        }else if(accepted_One[0][2] == 1){

                            Popup_player2();
                        }


                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
        Twister_btn8.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn8 = (Button) findViewById(R.id.tb8);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[1][2] = turnNumber % 2 + 1;
                    accepted_Two[1][2] = turnNumber % 2 + 1;
                    screenState[1][2] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.


                    }


                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[1][2] = 0;

                    if (!(screenState[1][2] == accepted_One[1][2] || screenState[1][2] == accepted_Two[1][2])) {
                        Twister_btn8.setBackgroundResource(R.drawable.round_button_youlose);
                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")

                        if(accepted_One[1][2] == 2)

                        {Popup_player1();
                        }else if(accepted_One[1][2] == 1){

                            Popup_player2();
                        }


                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });

        Twister_btn9.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn9 = (Button) findViewById(R.id.tb9);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    accepted_One[2][2] = turnNumber % 2 + 1;
                    accepted_Two[2][2] = turnNumber % 2 + 1;
                    screenState[2][2] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.

                    }

                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[2][2] = 0;

                    if (!(screenState[2][2] == accepted_One[2][2] || screenState[2][2] == accepted_Two[2][2])) {
                        Twister_btn9.setBackgroundResource(R.drawable.round_button_youlose);
                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")

                        if(accepted_One[2][2] == 2)

                        {Popup_player1();
                        }else if(accepted_One[2][2] == 1){

                            Popup_player2();
                        }

                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
        Twister_btn10.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn10 = (Button) findViewById(R.id.tb10);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[0][3] = turnNumber % 2 + 1;
                    accepted_Two[0][3] = turnNumber % 2 + 1;
                    screenState[0][3] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.

                    }

                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[0][3] = 0;

                    if (!(screenState[0][3] == accepted_One[0][3] || screenState[0][3] == accepted_Two[0][3])) {
                        Twister_btn10.setBackgroundResource(R.drawable.round_button_youlose);
                        //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")

                        if(accepted_One[0][3] == 2)

                        {Popup_player1();
                        }else if(accepted_One[0][3] == 1){

                            Popup_player2();
                        }

                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
        Twister_btn11.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn11 = (Button) findViewById(R.id.tb11);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[1][3] = turnNumber % 2 + 1;
                    accepted_Two[1][3] = turnNumber % 2 + 1;
                    screenState[1][3] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.

                    }


                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[1][3] = 0;

                    if (!(screenState[1][3] == accepted_One[1][3] || screenState[1][3] == accepted_Two[1][3])) {
                        Twister_btn11.setBackgroundResource(R.drawable.round_button_youlose);

                        if(accepted_One[1][3] == 2)
                        {Popup_player1();
                        }else if(accepted_One[1][3] == 1){
                            Popup_player2();
                    }

                    //We need a line HERE calling a toast that says "Player (screenState[0][0]) Slipped!")
                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
        Twister_btn12.setOnTouchListener(new View.OnTouchListener() {


            Button Twister_btn12 = (Button) findViewById(R.id.tb12);


            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    accepted_One[2][3] = turnNumber % 2 + 1;
                    accepted_Two[2][3] = turnNumber % 2 + 1;
                    screenState[2][3] = turnNumber % 2 + 1;
                    numEntries = numEntries + 1;

                    do {
                        Random_Col = randCol.nextInt(3);
                        Random_Row = randRow.nextInt(4);

                    } while (screenState[Random_Col][Random_Row] > 0);

                    turnNumber = turnNumber + 1;

                    accepted_One[Random_Col][Random_Row] = turnNumber % 2 + 1;
                    if (Random_Col == 0 && Random_Row == 0) {
                        Twister_btn1.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn1.setBackgroundResource(R.drawable.round_button_player2);
                        }

                    } else if (Random_Col == 1 && Random_Row == 0) {
                        Twister_btn2.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn2.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 0) {
                        Twister_btn3.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn3.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 1) {
                        Twister_btn4.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn4.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 1) {
                        Twister_btn5.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn5.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 1) {
                        Twister_btn6.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn6.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 2) {
                        Twister_btn7.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn7.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 2) {
                        Twister_btn8.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn8.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 2) {
                        Twister_btn9.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn9.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 0 && Random_Row == 3) {
                        Twister_btn10.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn10.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 1 && Random_Row == 3) {
                        Twister_btn11.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn11.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    } else if (Random_Col == 2 && Random_Row == 3) {
                        Twister_btn12.setEnabled(true);
                        if ((turnNumber + 1) % 2 == 1) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_pressed);
                        }
                        if ((turnNumber + 1) % 2 == 0) {
                            Twister_btn12.setBackgroundResource(R.drawable.round_button_player2);
                        }
                    }

                    if(numEntries >= 10 ){
                        do {
                            Random_Col = randCol.nextInt(3);
                            Random_Row = randRow.nextInt(4);

                        }while (!(screenState[Random_Col][Random_Row] == turnNumber%2 + 1));

                        accepted_One[Random_Col][Random_Row] = 0;
                        numEntries = numEntries-1;

                        if (Random_Col == 0 && Random_Row == 0){
                            Twister_btn1.setEnabled(false);
                            Twister_btn1.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 0){
                            Twister_btn2.setEnabled(false);
                            Twister_btn2.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 0){
                            Twister_btn3.setEnabled(false);
                            Twister_btn3.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 1){
                            Twister_btn4.setEnabled(false);
                            Twister_btn4.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 1){
                            Twister_btn5.setEnabled(false);
                            Twister_btn5.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 1){
                            Twister_btn6.setEnabled(false);
                            Twister_btn6.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 2){
                            Twister_btn7.setEnabled(false);
                            Twister_btn7.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 2){
                            Twister_btn8.setEnabled(false);
                            Twister_btn8.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 2){
                            Twister_btn9.setEnabled(false);
                            Twister_btn9.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 0 && Random_Row == 3){
                            Twister_btn10.setEnabled(false);
                            Twister_btn10.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 1 && Random_Row == 3){
                            Twister_btn11.setEnabled(false);
                            Twister_btn11.setBackgroundResource(R.drawable.round_button);
                        }else if(Random_Col == 2 && Random_Row == 3){
                            Twister_btn12.setEnabled(false);
                            Twister_btn12.setBackgroundResource(R.drawable.round_button);
                        }

                        //we need a line HERE making button for [Random_Col][Random_Row] untouchable and
                        // unpressed. It should trigger ACTION_UP for that button.
                        //It would be nice to include something to let people know to let go of the button.

                    }


                }

                if (event.getAction() == MotionEvent.ACTION_UP) {

                    screenState[2][3] = 0;

                    if (!(screenState[2][3] == accepted_One[2][3] || screenState[2][3] == accepted_Two[2][3])) {
                        Twister_btn12.setBackgroundResource(R.drawable.round_button_youlose);

                        if(accepted_One[2][3] == 2)

                        {Popup_player1();
                        }else if(accepted_One[2][3] == 1){

                        Popup_player2();
                        }

                        //We need a line HERE calling a toast that says "Player (accepted_One[0][0]) Slipped!")
                        Twister_btn1.setEnabled(false);         Twister_btn2.setEnabled(false);         Twister_btn3.setEnabled(false);         Twister_btn4.setEnabled(false);         Twister_btn5.setEnabled(false);         Twister_btn6.setEnabled(false);         Twister_btn7.setEnabled(false);         Twister_btn8.setEnabled(false);         Twister_btn9.setEnabled(false);         Twister_btn10.setEnabled(false);         Twister_btn11.setEnabled(false);         Twister_btn12.setEnabled(false); 
                        //and returns the user to the submenu.
                        // It would be nice to include some change of UI and a short time period where
                        // the user cannot accidently press the
                        // return button
                    }

                }
                return false;
            }
        });
    }


    protected  void Popup_player1(){
        AlertDialog.Builder builder = new AlertDialog.Builder(TwisterClass.this);
        builder.setMessage(winner);
        builder.setTitle("BLUE WINS!");
     
        
        
        
        builder.setNegativeButton("Play Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

                TwisterClass.this.finish();
                Intent intent = new Intent();
                intent.setClass(TwisterClass.this, TwisterClass.class);
                startActivity(intent);


            }

        });
        builder.setPositiveButton("Menu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                TwisterClass.this.finish();
                Intent intent = new Intent();
                intent.setClass(TwisterClass.this, twister_subMenu.class);
                startActivity(intent);
                TwisterClass.this.finish();
            }
        });
        builder.setCancelable(false);
        builder.create().show();
    }


    protected  void Popup_player2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(TwisterClass.this);
        builder.setMessage(winner);
        builder.setTitle("PINK WINS!");
        builder.setNegativeButton("Play Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();


                TwisterClass.this.finish();
                Intent intent = new Intent();
                intent.setClass(TwisterClass.this, TwisterClass.class);
                startActivity(intent);




            }

        });
        builder.setPositiveButton("Menu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                TwisterClass.this.finish();
                Intent intent = new Intent();
                intent.setClass(TwisterClass.this, MainMenu.class);
                startActivity(intent);
                TwisterClass.this.finish();
            }
        });
        builder.setCancelable(false);
        builder.create().show();
    }
}

