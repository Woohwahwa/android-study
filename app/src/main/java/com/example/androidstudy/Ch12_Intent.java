package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ch12_Intent extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch12__intent);

    Button callBtn = (Button) findViewById(R.id.ch12_callBtn);

    callBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        EditText telText = (EditText) findViewById(R.id.ch12_telText);
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + telText.getText()));
        startActivity(intent);
      }
    });
  }
}
