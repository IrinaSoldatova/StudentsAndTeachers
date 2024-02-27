package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService {
    private TeacherList teacherList;

    public TeacherService(TeacherList teacherList) {
        this.teacherList = teacherList;
    }

    public TeacherList getTeacherList() {
        return teacherList;
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> sortedTeacher = new ArrayList<>(teacherList.getTeacherList());
        Collections.sort(sortedTeacher);
        return sortedTeacher;
    }

    public List<Teacher> getSortedTeacherByFIO(){
        List<Teacher> teachers = new ArrayList<>(teacherList.getTeacherList());
        teacherList.getTeacherList().sort(new UserComparator<Teacher>());
        return teachers;
    }
}
