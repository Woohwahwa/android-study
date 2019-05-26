package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.*;
import android.content.*;
import android.graphics.*;
import android.view.*;

public class Ch08_Canvas_01 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch08__canvas_01);

    TestView tv = new TestView(this);
    setContentView(tv);
  }
}

class TestView extends View {
  public TestView(Context context) {
    super(context);
  }

  public void onDraw(Canvas canvas) {
    canvas.drawColor(Color.CYAN);
    Paint Pnt = new Paint();
    Pnt.setColor(Color.RED);
    canvas.drawRect(120, 100, 320, 500, Pnt);
  }
}