package com.sparta.students2;

import java.util.UUID;

public class ParentClass {

    protected String name;
    protected String nomerZachetki;

    public ParentClass(String name) {
        this.name = name;
        this.nomerZachetki = UUID.randomUUID().toString();
    }

    public void calculateSredniyBal(){

    }
}
