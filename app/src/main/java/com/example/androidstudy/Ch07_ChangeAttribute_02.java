package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Ch07_ChangeAttribute_02 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch07__change_attribute_02);

    findViewById(R.id.ch07_buttonid_10).setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        LinearLayout layout = (LinearLayout)findViewById(R.id.ch07_layoutid_10);
        layout.setOrientation(LinearLayout.HORIZONTAL);
      }
    });

//    ScrollView scrollView = findViewById(R.id.ch07_layoutid_10);
//    scrollView.fullScroll(View.FOCUS_DOWN);
  }
}
