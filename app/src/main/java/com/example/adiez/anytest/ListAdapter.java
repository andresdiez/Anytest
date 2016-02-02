package com.example.adiez.anytest;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by adiez on 2016-02-01.
 */
public class ListAdapter extends ArrayAdapter<Row>{

    Context context;
    int resource;
    Row row[];

    public ListAdapter(Context context, int resource, Row[] row) {
        super(context, resource, row);
        this.context=context;
        this.resource=resource;
        this.row=row;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater=((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(resource,parent,false);

        TextView rText=(TextView)convertView.findViewById(R.id.textView);
        rText.setText(row[position].text);

        return convertView;
    }


}
