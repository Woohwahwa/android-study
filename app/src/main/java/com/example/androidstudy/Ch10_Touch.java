package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.graphics.*;
import android.view.*;
import java.util.ArrayList;

public class Ch10_Touch extends AppCompatActivity {
  private CindyView vw;
  public class Vertex {
    Vertex(float ax, float ay, boolean ad) {
      x = ax;
      y = ay;
      Draw = ad;
    }
    float x;
    float y;
    boolean Draw;
  }
  ArrayList<Vertex> arVertex;
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    vw = new CindyView(this);
    setContentView(vw);
    arVertex = new ArrayList<Vertex>();
  }
  protected class CindyView extends View {
    Paint Pnt;
    public CindyView(Context context) {
      super(context);
      Pnt = new Paint();
      Pnt.setColor(Color.BLUE);
      Pnt.setStrokeWidth(3);
      Pnt.setAntiAlias(true);
    }
    public void onDraw(Canvas canvas) {
      int i;
      canvas.drawColor(Color.LTGRAY);
      for (i = 0; i < arVertex.size(); i++) {
        if (arVertex.get(i).Draw) {
          canvas.drawLine(arVertex.get(i-1).x, arVertex.get(i-1).y, arVertex.get(i).x, arVertex.get(i).y, Pnt);
        }
      }
    }
    public boolean onTouchEvent(MotionEvent event) {
      if (event.getAction() == MotionEvent.ACTION_DOWN) {
        arVertex.add(new Vertex(event.getX(), event.getY(), false));
        return true;
      }
      if (event.getAction() == MotionEvent.ACTION_MOVE) {
        arVertex.add(new Vertex(event.getX(), event.getY(), true));
        invalidate();
        return true;
      }
      return false;
    }
  }
}
