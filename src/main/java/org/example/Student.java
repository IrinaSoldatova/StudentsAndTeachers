package org.example;

public class Student extends User implements Comparable<Student>{
    private Integer studentId;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId + " " +
                super.toString() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        return this.studentId.compareTo(o.studentId);
        if(studentId > o.getStudentId())
            return 1;
        if(studentId < o.getStudentId())
            return -1;
        return 0;
    }
}
