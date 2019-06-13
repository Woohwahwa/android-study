package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class Ch09_EventListener extends AppCompatActivity implements View.OnTouchListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    View vw = new View(this);
    vw.setOnTouchListener(this);
    setContentView(vw);
  }

  public boolean onTouch(View v, MotionEvent event) {
    if (event.getAction() == MotionEvent.ACTION_DOWN) {
      Toast.makeText(this, "Touch Event Received", Toast.LENGTH_SHORT).show();
      return true;
    }
    return false;
  }
}
