package org.example;

public class TeacherService {
    private Teacher teacher;

    public TeacherService(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
