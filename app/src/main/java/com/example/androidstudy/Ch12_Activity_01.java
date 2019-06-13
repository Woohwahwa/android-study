package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.content.*;
import android.view.*;
import android.widget.*;

public class Ch12_Activity_01 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch12__01);
  }

  public void mOnClick(View v) {
    Intent intent = new Intent(this, Ch12_Activity_01_1.class);
    startActivity(intent);
  }
}
