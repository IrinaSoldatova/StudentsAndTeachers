package org.example;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if(hasNext()){
            return studentList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            studentList.remove(counter);
    }
}
