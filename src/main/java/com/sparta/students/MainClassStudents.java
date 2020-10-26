package com.sparta.students;

public class MainClassStudents {
    public static void main(String[] args) {

        Facultet facultet = new Facultet("Facultet PSF");

        Group group1 = new Group("Group 001");

        group1.addStudentResults(new Student("Ivanova"));
        group1.addStudentResults(new Student("Petrova"));
        group1.addStudentResults(new Student("Sidorova"));
        facultet.addGroup(group1);

        Group group2 = new Group("Group 002");

        group2.addStudentResults(new Student("Onegin"));
        group2.addStudentResults(new Student("Lenskiy"));
        group2.addStudentResults(new Student("Lenin"));
        group2.addStudentResults(new Student("Zhukova"));
        facultet.addGroup(group2);


        System.out.println("Facultet " + facultet.getGroups());
        System.out.println("Group1 " + group1.getGroupStudents());
//        System.out.println("Group2" + group2.getGroupStudents());
//        facultet.sceduleExam();
    }
}
