package org.example;

public class Teacher extends User implements Comparable<Teacher> {
    private Integer teacherId;
    private Integer dateOfBirth;

    public Teacher(Integer teacherId, String firstName, String secondName, String lastName, Integer dateOfBirth) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId + " " +
                super.toString() +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
