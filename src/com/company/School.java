package com.company;

import java.util.ArrayList;

//Class SCHOOL is used to store all the students.

public class School {
    ArrayList<Student> students;

    public School() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student students) {
        this.students.add(students);
    }
}
