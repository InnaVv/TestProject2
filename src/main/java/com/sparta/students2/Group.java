package com.sparta.students2;

import java.util.ArrayList;
import java.util.List;

public class Group extends ParentClass {

    List<ParentClass> groupStudents;
    List<Double> results = new ArrayList<>();

    public Group(String name) {
        super(name);
        groupStudents = new ArrayList<>();
        this.results = results;
    }

    public void addStudent(ParentClass student) {
        groupStudents.add(student);
    }

    public List<ParentClass> getGroupStudents() {
        return groupStudents;
    }


    public double calculateForGroup() {
        Double total = 0.0;
        Double sredniyBall = 0.0;
        for (int i = 0; i< results.size();i++){
            total +=results.get(i);
            sredniyBall = total / results.size();}
            System.out.println("Test" + sredniyBall);


        return sredniyBall;
    }
}
