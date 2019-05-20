package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ch06_FrameLayout extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch06__frame_layout);
    findViewById(R.id.ch06__btn).setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        ImageView img = (ImageView)findViewById(R.id.ch06__img1);
        if (img.getVisibility() == View.VISIBLE) {
          img.setVisibility(View.GONE);
        } else {
          img.setVisibility(View.VISIBLE);
        }
      }
    });
  }
}
