package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Student {
    private String name;
    private Integer id;
    private static Integer sNumber = 0;
//    private static ArrayList<Student> studentlist = StudentListThing();

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
        sNumber++;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("studentID='" + id + "'")
                .toString();
    }


//    public static ArrayList<Student> StudentListThing() {
//        ArrayList<Student> studentlist = new ArrayList<>();
//
//        studentlist.add(new Student("laurens", 121));
//
//        return studentlist;
//    }

}


