package com.sparta.students2;

import java.util.ArrayList;
import java.util.List;

public class Facultet {

    List<Group> groups;
    List<Student> facultetSudents;

    public Facultet(String name) {
        groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }


    public void calculateForFacultet(){
        for (Group g: groups){
            g.calculateForGroup();
        }
    }


}
