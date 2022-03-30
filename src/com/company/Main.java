package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//        System.out.println("Hi " + name + "!");

//        Content mathContent1 = new Content("1 + 1 = ?", "2");
//        Content mathContent2 = new Content("3 * 7 = ?", "21");
//        Content mathContent3 = new Content("3 * 7 = A:21/B:2/C:5/D?:6", "A");
//
//        ArrayList<Content> testje = new ArrayList<>();
//        testje.add(mathContent1);
//        testje.add(mathContent2);
//        testje.add(mathContent3);
//
//        Exam mathExam = new Exam(testje);
//        System.out.println(testje.get(1));
//
//        mathExam.takeTest(testje);

        School mySchool = new School();

        System.out.println("1 List of exams");
        System.out.println("2 List of students");
        System.out.println("3 Take an exam");
        System.out.println("4 List of exams");
        System.out.println("5 Add a student");
        int menuthing = scanner.nextInt();

        if(menuthing == 1) {
            System.out.println("it works");
        }
        if(menuthing == 2) {
            Student studentRegister = new Student("Bob Geller", 123);
            mySchool.addStudent(studentRegister);
            Student studentRegister2 = new Student("Dan Miller", 124);
            mySchool.addStudent(studentRegister2);

            System.out.println(mySchool.students);

        }
        if(menuthing == 3) {
            Content c1 = new Content("Question? A B C of D?", "B");
            Content c2 = new Content("Question? A B C of D?", "C");
            Content c3 = new Content("Question? A B C of D?", "A");

            ArrayList<Content> contentje = new ArrayList<>();
            contentje.add(c1);
            contentje.add(c2);
            contentje.add(c3);

            Exam myExam = new Exam(contentje);
        }
        if(menuthing == 4) {
//            Exam.
        }
        if(menuthing == 5) {
            System.out.println("What is your name?");
            scanner.nextLine();
            String newStudentName = scanner.nextLine();

            Student registerStudent = new Student(newStudentName, 125);
            mySchool.addStudent(registerStudent);
            System.out.println("Hi " + newStudentName);
        }

//            ArrayList<String> studentname = new ArrayList<>();
//            System.out.println("What is your name?");
//            studentname.add(scanner.next());
//            System.out.println(studentname);






    }
}