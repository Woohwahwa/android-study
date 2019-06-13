package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import android.content.Context;

public class Ch09_CallbackMethod extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    View vw = new CindyView(this);
    setContentView(vw);
  }

  class CindyView extends View {
    public CindyView(Context context) {
      super(context);
    }

    public boolean onTouchEvent(MotionEvent event) {
      super.onTouchEvent(event);
      if (event.getAction() == MotionEvent.ACTION_DOWN) {
        Toast.makeText(Ch09_CallbackMethod.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
        return true;
      }
      return false;
    }
  }
}
