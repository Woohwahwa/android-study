package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class Ch11_TypeInput extends AppCompatActivity implements View.OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch11__input);
    Button btnGood = (Button)findViewById(R.id.ch11_good);
    btnGood.setOnClickListener(this);
    Button btnBad=(Button)findViewById(R.id.ch11_bad);
    btnBad.setOnClickListener(this);
  }

  public void onClick(View v) {
    TextView textPoll = (TextView)findViewById(R.id.ch11_question);
    switch (v.getId()) {
      case R.id.ch11_good:
        textPoll.setText("Good! :)");
        break;
      case R.id.ch11_bad:
        textPoll.setText("Bad :(");
        break;
    }
  }
}
