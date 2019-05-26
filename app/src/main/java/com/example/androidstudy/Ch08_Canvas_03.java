package com.example.androidstudy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ch08_Canvas_03 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch08__canvas_03);

    TestView03 tv = new TestView03(this);
    setContentView(tv);
  }
}

class TestView03 extends View {
  public TestView03(Context context) {
    super(context);
  }

  public void onDraw(Canvas canvas) {
    canvas.drawColor(Color.TRANSPARENT);
    Paint Pnt = new Paint();
    Pnt.setColor(Color.BLACK);
    Pnt.setTextSize(80);

    // basic
    canvas.drawOval(new RectF(10, 10, 200, 120), Pnt);
    canvas.drawText("Basic Text", 210,70,Pnt);

    Pnt.setAntiAlias(true);
    canvas.drawOval(new RectF(10, 130, 200, 240), Pnt);
    canvas.drawText("AntiAlias Text", 210, 190, Pnt);
  }
}
