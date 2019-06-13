package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.view.View;
import android.widget.Button;

public class Ch08_Sound extends AppCompatActivity {

  SoundPool mPool;
  int mDing;
  AudioManager mAm;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch08__sound);

    mPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    mDing = mPool.load(this, R.raw.pipe9, 1);
    mAm = (AudioManager)getSystemService(AUDIO_SERVICE);

    findViewById(R.id.ch08_beep1).setOnClickListener(mClickListener);
    findViewById(R.id.ch08_beep2).setOnClickListener(mClickListener);
  }

  Button.OnClickListener mClickListener = new Button.OnClickListener() {
    public void onClick(View v) {

      MediaPlayer player;

      switch(v.getId()) {
        case R.id.ch08_beep1:
          mPool.play(mDing, 1, 1, 0, 0, 1);
          break;
        case R.id.ch08_beep2:
          mAm.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
          break;
      }
    }
  };
}
