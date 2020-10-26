package com.sparta.students;

import java.util.UUID;

public class ParentClass {

    protected String name;
    protected String nomerZachetki;

    public ParentClass(String name) {
        this.name = name;
        this.nomerZachetki = UUID.randomUUID().toString();
    }

    protected void passExam() {
    }
}
