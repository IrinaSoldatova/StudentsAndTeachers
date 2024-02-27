package org.example;

public class Teacher extends User implements Comparable<Teacher> {
    private Integer dateOfBirth;

    public Teacher(String firstName, String secondName, String lastName, Integer dateOfBirth) {
        super(firstName, secondName, lastName);
        this.dateOfBirth = dateOfBirth;
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
                super.toString() + " " +
                "dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if(dateOfBirth > o.getDateOfBirth())
            return 1;
        if(dateOfBirth < o.getDateOfBirth())
            return -1;
        return 0;
    }
}
