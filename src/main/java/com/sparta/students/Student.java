package com.sparta.students;

import java.util.ArrayList;
import java.util.List;

public class Student extends ParentClass {

    List<Student> students;
    String nomerZachetki;

    public Student(String name) {
        super(name);
        students = new ArrayList<>();
        this.nomerZachetki = nomerZachetki;
    }
}
