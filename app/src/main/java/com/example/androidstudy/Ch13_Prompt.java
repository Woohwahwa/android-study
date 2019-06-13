package com.example.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View;
import android.widget.Toast;

public class Ch13_Prompt extends AppCompatActivity {
  ArrayAdapter<CharSequence> adspin;
  boolean mInitSpinner;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch13__prompt);
    Spinner spin = (Spinner)findViewById(R.id.ch13_myspinner);
    String promptText = getString(R.string.ptext);
    spin.setPrompt(promptText);
    adspin = ArrayAdapter.createFromResource(this, R.array.colors, android.R.layout.simple_spinner_item);
    adspin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spin.setAdapter(adspin);
    spin.setOnItemSelectedListener(new OnItemSelectedListener() {
      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(Ch13_Prompt.this, adspin.getItem(position), Toast.LENGTH_SHORT).show();
      }
      public void onNothingSelected(AdapterView<?> parent){}
    });
  }
}
