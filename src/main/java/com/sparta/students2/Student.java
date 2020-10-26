package com.sparta.students2;

import java.util.ArrayList;
import java.util.List;

public class Student extends ParentClass {

    List<Student> students = new ArrayList<>();
    List<Integer> examResults = new ArrayList<>();

    public Student(String name, int ExamResult) {
        super(name);
        this.students = students;
        this.examResults = examResults;
    }
    public void calculateSredniyBal (){

    }
}
