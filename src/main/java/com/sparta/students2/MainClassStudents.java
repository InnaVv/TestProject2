package com.sparta.students2;

public class MainClassStudents {
    public static void main(String[] args) {

        Facultet facultet = new Facultet("Facultet PSF");

        Group group1 = new Group("Group 001");

        group1.addStudent(new Student("Ivanova",7));
        group1.addStudent(new Student("Petrova",8));
        group1.addStudent(new Student("Sidorova",8));
        facultet.addGroup(group1);

        Group group2 = new Group("Group 002");

        group2.addStudent(new Student("Onegin",5));
        group2.addStudent(new Student("Lenskiy",10));
        group2.addStudent(new Student("Lenin",9));
        group2.addStudent(new Student("Zhukova",3));
        facultet.addGroup(group2);


//        System.out.println("Facultet " + facultet.getGroups());
//        System.out.println("Group1 " + group1.getGroupStudents());
//        System.out.println("Group2" + group2.getGroupStudents());
//        facultet.calculateForFacultet();
        group1.calculateForGroup();
    }
}
