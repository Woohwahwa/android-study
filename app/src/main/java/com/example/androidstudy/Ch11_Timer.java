package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Ch11_Timer extends AppCompatActivity {
  int value = 0;
  TextView mText;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch11__timer);
    mText = (TextView)findViewById(R.id.ch11_text);
    mHandler.sendEmptyMessage(0);
  }

  Handler mHandler = new Handler() {
    public void handleMessage(Message msg) {
      value++;
      mText.setText("Timer Value = " + value);
      mHandler.sendEmptyMessageDelayed(0, 1000);
    }
  };
}
