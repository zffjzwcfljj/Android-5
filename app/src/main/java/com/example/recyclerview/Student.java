package com.example.recyclerview;

public class Student {

    private String name;
    private String clas;
    private String no;

    public Student(String name,String clas,String no){
        this.name=name;
        this.clas=clas;
        this.no=no;
    }

    public String getName(){
        return name;
    }

    public String getClas(){
        return clas;
    }

    public String getNo(){
        return no;
    }
}

