package com.example.examples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class historyAdapter extends ArrayAdapter<historyItem> {
    private Context mContext;
    int mResource;
    public historyAdapter(Context context, int resource, ArrayList<historyItem> objects){
        super(context,resource,objects);
        mContext=context;
        mResource=resource;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        String text=getItem(position).historyText;
        LayoutInflater inflater=LayoutInflater.from(mContext);
        convertView=inflater.inflate(mResource,parent,false);
        TextView tvText=(TextView)convertView.findViewById(R.id.textView);
        tvText.setText(text);
        return convertView;
    }
}
