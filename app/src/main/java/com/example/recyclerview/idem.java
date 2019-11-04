package com.example.recyclerview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class idem extends ArrayAdapter<Student> {
    private int resourceId;
    public idem(Context context, int textViewResourceId, List<Student> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Student student = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView name = (TextView) view.findViewById(R.id.name1);
        TextView clas = (TextView) view.findViewById(R.id.clas1);
        TextView no = (TextView) view.findViewById(R.id.no1);
        name.setText(student.getName());
        clas.setText(student.getClas());
        no.setText(student.getNo());
        return view;
    }
}


