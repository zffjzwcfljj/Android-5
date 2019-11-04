package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import static com.example.recyclerview.R.id.recycler_view;

public class MainActivity extends AppCompatActivity {
    private List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStudents();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(studentList);
        recyclerView.setAdapter(adapter);



    }
    private void initStudents(){
        for (int i=0; i<10; i++){
            Student zff = new Student("ZFF","1704","001");
            studentList.add(zff);

            Student zxy = new Student("ZXY","1705","002");
            studentList.add(zxy);

            Student hzq = new Student("HZQ","1706","003");
            studentList.add(hzq);
        }
    }


}

