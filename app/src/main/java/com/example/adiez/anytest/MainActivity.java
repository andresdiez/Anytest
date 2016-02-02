package com.example.adiez.anytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    ListController list;
    private EditText text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ListController(this,R.layout.row_item);
        text=(EditText)findViewById(R.id.editText);

    }

    public void addText(View view){

        list.addRow(text.getText().toString());

    }




}
