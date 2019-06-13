package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;
import android.content.Context;
import android.widget.Toast;

public class Ch10_EventListener extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    View vw = new CindyView(this);
    vw.setOnTouchListener(new View.OnTouchListener() {
      public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
          Toast.makeText(Ch10_EventListener.this, "No.1 Listener: Touch Event Received", Toast.LENGTH_SHORT).show();
          return true;
        }
        return false;
      }
    });
    setContentView(vw);
  }
  protected class CindyView extends View {
    public CindyView(Context context) {
      super(context);
    }
    public boolean onTouchEvent(MotionEvent event) {
      if (event.getAction() == MotionEvent.ACTION_DOWN) {
        Toast.makeText(Ch10_EventListener.this, "No.2 View: Touch Event Received", Toast.LENGTH_SHORT).show();
        return true;
      }
      return false;
    }
  }
  public boolean onTouchEvent(MotionEvent event) {
    if (event.getAction() == MotionEvent.ACTION_DOWN) {
      Toast.makeText(Ch10_EventListener.this, "No.3 Activity: Touch Event Received", Toast.LENGTH_SHORT).show();
      return true;
    }
    return false;
  }
}
