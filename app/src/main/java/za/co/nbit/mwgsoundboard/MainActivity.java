package za.co.nbit.mwgsoundboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mplayer;
    int buttonClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void mediaTrack(String track)
    {
        String trackName = track;
        //mplayer = MediaPlayer.create(this, R.raw.1);
    }

    public void playSound (View view)
    {
        /*if (mplayer.isPlaying()) {
            mplayer.stop();
        }*/
        buttonClick = view.getId();

        Log.i("button", Integer.toString(getButtonClick()));

        if (getButtonClick() == 0)
        {
            mplayer = MediaPlayer.create(this, R.raw.horn_dire);
            mplayer.start();
        }
        else if (getButtonClick() == 1)
        {
            mplayer = MediaPlayer.create(this, R.raw.horn_radiant);
            mplayer.start();
        }
        else if (getButtonClick() == 2)
        {
            mplayer = MediaPlayer.create(this, R.raw.item_satanic);
            mplayer.start();
        }
        else if (getButtonClick() == 3)
        {
            mplayer = MediaPlayer.create(this, R.raw.mek_cast);
            mplayer.start();
        }
        else if (getButtonClick() == 4)
        {
            mplayer = MediaPlayer.create(this, R.raw.press_cast);
            mplayer.start();
        }
        else if (getButtonClick() == 5)
        {
            mplayer = MediaPlayer.create(this, R.raw.purification);
            mplayer.start();
        }
        else if (getButtonClick() == 6)
        {
            mplayer = MediaPlayer.create(this, R.raw.requiem_of_souls);
            mplayer.start();
        }
        else if (getButtonClick() == 7)
        {
            mplayer = MediaPlayer.create(this, R.raw.song_of_the_siren);
            mplayer.start();
        }
    }

    public int getButtonClick()
    {
        if(buttonClick == R.id.button)
        {
            return 0;
        }
        else if (buttonClick == R.id.button1)
        {
            return 1;
        }
        else if (buttonClick == R.id.button2)
        {
            return 2;
        }
        else if (buttonClick == R.id.button3)
        {
            return 3;
        }
        else if (buttonClick == R.id.button4)
        {
            return 4;
        }
        else if (buttonClick == R.id.button5)
        {
            return 5;
        }
        else if (buttonClick == R.id.button6)
        {
            return 6;
        }
        else
        {
            return 7;
        }
    }
}
