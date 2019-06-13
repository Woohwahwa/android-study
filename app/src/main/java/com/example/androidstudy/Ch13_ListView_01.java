package com.example.androidstudy;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.graphics.Color;

public class Ch13_ListView_01 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ch13__list_view_01);
    ArrayAdapter<CharSequence> Adapter;
    Adapter = ArrayAdapter.createFromResource(this, R.array.mobile, android.R.layout.simple_list_item_multiple_choice);
    ListView list = (ListView)findViewById(R.id.ch13_list);
    list.setAdapter(Adapter);
    list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    list.setDivider(new ColorDrawable(Color.BLUE));
    list.setDividerHeight(5);
  }
}
