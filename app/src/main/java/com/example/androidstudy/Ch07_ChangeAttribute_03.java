package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

public class Ch07_ChangeAttribute_03 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch07__change_attribute_03);

    findViewById(R.id.ch07_buttonid_12).setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        ImageView img = (ImageView) findViewById(R.id.ch07_imageid_12);
        img.setColorFilter(Color.BLUE);
      }
    });
  }
}
