package com.sparta.students2;

import java.util.ArrayList;
import java.util.List;

public class Group {

    String name;
    List<Student> groupStudents;
    List<Integer> results = new ArrayList<>();
    groupStudents = new ArrayList<>();

    public Group(String name) {
        this.name=name;
    }

    public void addStudent(Student student) {

        groupStudents.add(student);
    }

    public void fillArray(){
    }

    public double calculateForGroup() {
        Double total = 0.0;
        Double sredniyBall = 0.0;
        for (int i = 0; i < results.size(); i++) {
            total += results.get(i);
            sredniyBall = total / results.size();
        }
        System.out.println("Test" + sredniyBall);


        return sredniyBall;
    }
}
