package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.content.Context;
import android.widget.Toast;

public class Ch09_EventListenerView extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    CindyView vw = new CindyView(this);
    vw.setOnTouchListener(vw);
    setContentView(vw);
  }

  class CindyView extends View implements View.OnTouchListener {
    public CindyView(Context context) {
      super(context);
    }
    public boolean onTouch(View v, MotionEvent event) {
      if (event.getAction() == MotionEvent.ACTION_DOWN) {
        Toast.makeText(Ch09_EventListenerView.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
        return true;
      }
      return false;
    }
  }
}
