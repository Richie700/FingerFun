package com.ebookfrenzy.fingerfun;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class tapRace_subMenu extends Activity {


//    MediaPlayer taprace_sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taprace_submenu);
//        taprace_sound = MediaPlayer.create(this, R.raw.taprace_music);




    }



    public void playGame_TapRace (View view)
    {
        Intent intent = new Intent(tapRace_subMenu.this, tapRace_Game.class);
        startActivity(intent);



    }


    public void gameOptions_tapRace (View view)
    {
        Intent intent = new Intent(tapRace_subMenu.this, MainMenu.class);
        startActivity(intent);
    }

    public void instructions_tapRace (View view)
    {
        Intent intent = new Intent(tapRace_subMenu.this, taprace_Instructions.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
