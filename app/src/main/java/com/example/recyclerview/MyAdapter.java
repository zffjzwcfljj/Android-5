package com.example.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Student> mDataset;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView StudentName;
        TextView StudentClass;
        TextView StudentNo;
        public ViewHolder(View view){
            super(view);
            StudentName = (TextView) view.findViewById(R.id.name1);
            StudentClass = (TextView) view.findViewById(R.id.clas1);
            StudentNo = (TextView) view.findViewById(R.id.no1);
        }
    }

    public MyAdapter(List<Student> studentList){
        mDataset = studentList;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.myview,parent,false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position){
        Student student = mDataset.get(position);
        holder.StudentName.setText(student.getName());
        holder.StudentClass.setText(student.getClas());
        holder.StudentNo.setText(student.getNo());
    }

    @Override
    public int getItemCount(){
        return mDataset.size();
    }


}
