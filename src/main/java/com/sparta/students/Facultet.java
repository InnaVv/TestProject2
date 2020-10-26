package com.sparta.students;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Facultet extends ParentClass {

    List<Group> groups;
    List<Student> facultetSudents;

    public Facultet(String name) {
        super(name);
        groups = new ArrayList<>();
        facultetSudents = new ArrayList<>();
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }
}
