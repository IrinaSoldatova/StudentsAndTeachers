package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.addStudent(new Student(4, "A", "A", "A"));
        studentGroup.addStudent(new Student(2, "S", "S", "S"));
        studentGroup.addStudent(new Student(3, "D", "D", "D"));
        studentGroup.addStudent(new Student(1, "F", "F", "F"));

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(studentGroup.studentList);
        System.out.println();

        TeacherList teacherList = new TeacherList(new ArrayList<>());
        teacherList.addTeacher(new Teacher("Q", "Q", "Q", 1984));
        teacherList.addTeacher(new Teacher("W", "W", "W", 1975));
        teacherList.addTeacher(new Teacher("E", "E", "E", 1990));

        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(teacherList.teacherList);



    }
}