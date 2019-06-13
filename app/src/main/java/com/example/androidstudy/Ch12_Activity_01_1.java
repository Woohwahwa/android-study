package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Ch12_Activity_01_1 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch12__01_1);
  }

  public void mOnClick(View v) {
    finish();
  }
}
