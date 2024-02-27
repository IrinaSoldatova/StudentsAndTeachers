package org.example;

import java.util.List;

public class TeacherList {
    protected List<Teacher> teacherList;

    public TeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }
}
