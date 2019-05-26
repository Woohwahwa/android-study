package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.graphics.*;
import android.view.*;

public class Ch08_Canvas_02 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch08__canvas_02);

    TestView02 tv = new TestView02(this);
    setContentView(tv);
  }
}

class TestView02 extends View {
  public TestView02(Context context) {
    super(context);
  }

  public void OnDraw(Canvas canvas) {
    canvas.drawColor(Color.LTGRAY);
    Paint Pnt = new Paint();

    // Red Rect
    Pnt.setColor(Color.RED);
    canvas.drawRect(10, 80, 80, 200, Pnt);

    // Black Point
    Pnt.setColor(Color.BLACK);
    canvas.drawPoint(30, 30, Pnt);

    // Black Line
    canvas.drawLine(40, 150, 150, 150, Pnt);

    // Blue Circle
    Pnt.setColor(0x800000ff);
    canvas.drawCircle(80, 80, 50, Pnt);

    // Green Text
    Pnt.setColor(Color.GREEN);
    canvas.drawText("Canvas Text Finish", 100, 100, Pnt);
  }

};
