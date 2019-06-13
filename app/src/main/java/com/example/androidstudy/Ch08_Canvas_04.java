package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.graphics.*;
import android.view.*;

public class Ch08_Canvas_04 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch08__canvas_04);

    TestView04 tv = new TestView04(this);
    setContentView(tv);
  }
}

class TestView04 extends View {
  public TestView04(Context context) {
    super(context);
  }

  public void onDraw(Canvas canvas) {
    canvas.drawRGB(212, 244, 250);
    Paint Pnt = new Paint();

    // 캡 모양
    Pnt.setColor(Color.RED);
    Pnt.setStrokeWidth(10);
    canvas.drawLine(30, 30, 180, 30, Pnt);
    Pnt.setStrokeCap(Paint.Cap.ROUND);
    Pnt.setStrokeCap(Paint.Cap.SQUARE);
    canvas.drawLine(30, 70, 180, 70, Pnt);

    // 만나는 지점의 모양
    Pnt.setColor(Color.CYAN);
    Pnt.setStrokeWidth(15);
    Pnt.setStyle(Paint.Style.STROKE);
    Pnt.setStrokeJoin(Paint.Join.MITER);
    canvas.drawRect(30, 110, 70, 145, Pnt);
    Pnt.setStrokeJoin(Paint.Join.BEVEL);
    canvas.drawRect(100, 110, 140, 145, Pnt);
    Pnt.setStrokeJoin(Paint.Join.ROUND);
    canvas.drawRect(170, 110, 210, 145, Pnt);

    // 원 스타일
    Pnt.setColor(Color.GREEN);
    Pnt.setStrokeWidth(10);
    Pnt.setAntiAlias(true);

    // 채우기
    Pnt.setStyle(Paint.Style.FILL);
    canvas.drawCircle(40, 200, 30, Pnt);

    // 외곽선 그리기
    Pnt.setStyle(Paint.Style.STROKE);
    canvas.drawCircle(120, 200, 30, Pnt);

    // 외곽선 및 채우기
    Pnt.setStyle(Paint.Style.FILL_AND_STROKE);
    canvas.drawCircle(200, 200, 30, Pnt);

    // 노란색 색채우기, 초록색 외곽선
    Pnt.setColor(Color.YELLOW);
    Pnt.setStyle(Paint.Style.FILL);

    canvas.drawCircle(40, 280, 30, Pnt);
    Pnt.setColor(Color.YELLOW);

    Pnt.setStyle(Paint.Style.FILL_AND_STROKE);
    canvas.drawCircle(200, 200, 30, Pnt);

  }
}
