package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Ch08_Toast extends AppCompatActivity {

  Toast mToast = null;
  int count;
  String str;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch08__toast);

    findViewById(R.id.ch08_shortmsg).setOnClickListener(mClickListener);
    findViewById(R.id.ch08_longmsg).setOnClickListener(mClickListener);
    findViewById(R.id.ch08_count).setOnClickListener(mClickListener);
    findViewById(R.id.ch08_customview).setOnClickListener(mClickListener);

  }

  Button.OnClickListener mClickListener = new Button.OnClickListener() {
    public void onClick(View v) {
      switch (v.getId()) {
        case R.id.ch08_shortmsg:
          Toast.makeText(Ch08_Toast.this, "Short Time Message", Toast.LENGTH_SHORT).show();
        case R.id.ch08_longmsg:
          Toast.makeText(Ch08_Toast.this, "Long Time Message", Toast.LENGTH_LONG).show();
          break;
        case R.id.ch08_count:
          str = "Count = " + count++;
          if (mToast != null) {
            mToast.cancel();
          }
          mToast = Toast.makeText(Ch08_Toast.this, str, Toast.LENGTH_SHORT);
          mToast.show();
          break;
        case R.id.ch08_customview:
          LinearLayout linear = (LinearLayout)View.inflate(Ch08_Toast.this, R.layout.layout_ch08__toast, null);
          Toast t2 = new Toast(Ch08_Toast.this);
          t2.setView(linear);
          t2.show();
          break;
      }
    }
  };
}
