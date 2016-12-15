
package com.ebookfrenzy.fingerfun;



        import android.app.Activity;
        import android.app.AlertDialog;
        import android.app.AlertDialog.Builder;
        import android.app.Dialog;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.os.Handler;
        import android.os.Message;
        import android.support.v7.app.ActionBarActivity;
        import android.view.View;
        import android.view.Window;
        import android.widget.Button;
        import android.widget.ProgressBar;
        import android.widget.SeekBar;
        import android.view.View;
        import android.view.View.OnClickListener;


public class tapRace_Game extends Activity implements View.OnClickListener {


    String winner;
    Button btn8, btn3;

    int i = 0, j = 0;
    SeekBar bar1, bar2;
   // MediaPlayer taprace_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horserace);
        //taprace_sound = MediaPlayer.create(this, R.raw.taprace_music);
        //taprace_sound.start();
        findViews();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        taprace_sound = MediaPlayer.create(this, R.raw.taprace_music);
//        taprace_sound.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
//        taprace_sound = MediaPlayer.create(this, R.raw.taprace_music);
//        taprace_sound.pause();
    }

    private void findViews() {
        bar1 = (SeekBar) findViewById(R.id.bar1);
        bar2 = (SeekBar) findViewById(R.id.bar2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn8 = (Button) findViewById(R.id.btn8);

        bar1.setOnClickListener(this);
        bar2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn8.setOnClickListener(this);

    }

//    public void stopPlaying() {
//        if (taprace_sound != null) {
//            taprace_sound.stop();
//        }
//    }


    Handler updateBarHandler = new Handler() {
        public void handleMessage(Message msg) {
            bar1.setProgress(msg.arg1);
            bar2.setProgress(msg.arg2);
        }
    };


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn3:
                //Set ProgressBarVisible
                i += 2;
                updateBarHandler.obtainMessage(i);
                break;
            case R.id.btn8:
                j += 2;
                updateBarHandler.obtainMessage(j);
        }

        Message msg = updateBarHandler.obtainMessage();
        msg.arg1 = i;
        msg.arg2 = j;
        updateBarHandler.sendMessage(msg);
        if (i == 100) {

            btn3.setEnabled(false);
            btn8.setEnabled(false);
            updateBarHandler.removeMessages(i);
            winner = getString(R.string.player_red_win);
            taprace_red_winner();

//            Popup();
        }
        if (j == 100) {

            btn8.setEnabled(false);
            btn3.setEnabled(false);
            updateBarHandler.removeMessages(j);
            winner = getString(R.string.player_blue_win);
            taprace_blue_winner();

        }
    }

    protected void taprace_red_winner(){
        final Dialog dialog = new Dialog(tapRace_Game.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.taprace_red_wins);
        dialog.show();

        Button playagain_taprace = (Button)dialog.findViewById(R.id.playagain_taprace);
        Button mainmenu_taprace = (Button)dialog.findViewById(R.id.mainmenu_taprace);

        playagain_taprace.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                btn3.setEnabled(true);
                btn8.setEnabled(true);

                bar1.setProgress(0);
                bar2.setProgress(0);
                i = 0;
                j = 0;
                winner = null;
                dialog.dismiss();

            }
        });

        mainmenu_taprace.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //stopPlaying();
                Intent intent = new Intent(tapRace_Game.this, MainMenu.class);
                startActivity(intent);

                bar1.setProgress(0);
                bar2.setProgress(0);
                i = 0;
                j = 0;
                winner = null;
                dialog.dismiss();

            }
        });

        dialog.setCancelable(false);
    }


 protected void taprace_blue_winner(){
        final Dialog dialog = new Dialog(tapRace_Game.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.taprace_blue_wins);


        dialog.show();

        Button playagain_taprace = (Button)dialog.findViewById(R.id.playagain_taprace_blue_wins);
        Button mainmenu_taprace = (Button)dialog.findViewById(R.id.mainmenu_taprace_blue_wins);

        playagain_taprace.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                btn3.setEnabled(true);
                btn8.setEnabled(true);

                bar1.setProgress(0);
                bar2.setProgress(0);
                i = 0;
                j = 0;
                winner = null;
                dialog.dismiss();

            }

       });

        mainmenu_taprace.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //stopPlaying();
                Intent intent = new Intent(tapRace_Game.this, MainMenu.class);
                startActivity(intent);

                bar1.setProgress(0);
                bar2.setProgress(0);
                i = 0;
                j = 0;
                winner = null;
                dialog.dismiss();
            }
        });
     dialog.setCancelable(false);
//     dialog.create().show();

    }
}










