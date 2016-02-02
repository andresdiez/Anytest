package com.example.adiez.anytest;

import android.content.Context;

/**
 * Created by adiez on 2016-02-02.
 */
public class ListController implements ControlleModel {

    private static ListAdapter adapter;
    private static Row[] row;

    public ListController(Context context, int resource){
        row=new Row[50];
        adapter=new ListAdapter(context,resource,row);
    }

    @Override
    public void addRow(String data) {

    }
}
