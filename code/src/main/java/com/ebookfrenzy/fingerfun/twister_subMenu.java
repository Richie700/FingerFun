package com.ebookfrenzy.fingerfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Avery on 4/13/15.
 */



public class twister_subMenu extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twister_submenu);
    }

    public void playGame_Twister (View view)
    {
        Intent intent = new Intent(twister_subMenu.this, TwisterClass.class);
        startActivity(intent);
    }


    public void instructions_Twister (View view)
    {
        Intent intent = new Intent(twister_subMenu.this, twister_Instructions.class);
        startActivity(intent);
    }

public void gameoptions_Twister (View view)
    {
        Intent intent = new Intent(twister_subMenu.this, MainMenu.class);
        startActivity(intent);
    }



}
