package com.sparta.students;

import java.util.ArrayList;
import java.util.List;

public class Group extends ParentClass {

    List<ParentClass> groupStudents;
    List<Integer> results = new ArrayList<>();

    public Group(String name) {
        super(name);
        groupStudents = new ArrayList<>();
    }

    public void addStudentResults(ParentClass student) {
        groupStudents.add(student);
    }

    public List<ParentClass> getGroupStudents() {
        return groupStudents;
    }

    public void doExam() {
        for(ParentClass student: groupStudents) {
           student.passExam();
        }
    }
}
