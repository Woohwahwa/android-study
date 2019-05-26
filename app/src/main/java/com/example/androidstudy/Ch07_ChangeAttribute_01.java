package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ch07_ChangeAttribute_01 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch07__change_attribute_01);

    findViewById(R.id.ch07_buttonid).setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        TextView txt = (TextView) findViewById(R.id.ch07_textid);
        txt.setTextSize(40);
      }
    });
  }
}
