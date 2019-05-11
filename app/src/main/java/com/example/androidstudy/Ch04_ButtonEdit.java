package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class Ch04_ButtonEdit extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch04__button_edit);

    Button btn = (Button)findViewById(R.id.btn);
    btn.setOnClickListener(new Button.OnClickListener() {
      public void onClick(View v) {
        EditText edit = (EditText)findViewById(R.id.edit);
        String str = edit.getText().toString();
        Toast.makeText(Ch04_ButtonEdit.this, str, Toast.LENGTH_SHORT).show();
      }
    });
  }

  // 아래는 어떻게 쓰는지 잘 모르겠음
  /*@Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }*/
}
