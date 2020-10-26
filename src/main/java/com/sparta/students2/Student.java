package com.sparta.students2;

import java.util.ArrayList;
import java.util.List;

public class Student{

    List<String> studentsNames = new ArrayList<>();
    List<Double> examResults = new ArrayList<>();

    public Student(String studentsNames, double examResults) {
        this.studentsNames = studentsNames;
        this.examResults = examResults;
    }

    public List<Integer> getExamResults() {

        return examResults;
    }
}
