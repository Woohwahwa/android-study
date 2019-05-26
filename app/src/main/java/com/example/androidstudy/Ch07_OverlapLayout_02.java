package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class Ch07_OverlapLayout_02 extends AppCompatActivity {

  View Page1, Page2, Page3;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch07__overlap_layout_02);

    Page1 = findViewById(R.id.ch07_page1);
    Page2 = findViewById(R.id.ch07_page2);
    Page3 = findViewById(R.id.ch07_page3);
    findViewById(R.id.ch07_btn1).setOnClickListener(mClickListener);
    findViewById(R.id.ch07_btn2).setOnClickListener(mClickListener);
    findViewById(R.id.ch07_btn3).setOnClickListener(mClickListener);
  }

  Button.OnClickListener mClickListener = new Button.OnClickListener() {
    public void onClick(View v) {
      Page1.setVisibility(View.INVISIBLE);
      Page2.setVisibility(View.INVISIBLE);
      Page3.setVisibility(View.INVISIBLE);

      switch (v.getId()) {
        case R.id.ch07_btn1:
          Page1.setVisibility(View.VISIBLE);
          break;
        case R.id.ch07_btn2:
          Page2.setVisibility(View.VISIBLE);
          break;
        case R.id.ch07_btn3:
          Page3.setVisibility(View.VISIBLE);
          break;
      }
    }
  };
}
