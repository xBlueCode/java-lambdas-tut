package main.java.com.jlamda.basic;

import main.java.com.jlamda.school.MathClass;
import main.java.com.jlamda.school.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        System.out.println("--- Using Anonymous Inline Class ---");
        usingAnonymousInlineClass();
        System.out.println("-----------------------------------");

        System.out.println("--- Using Lambda Form 1 ---");
        usingLambdaForm1();
        System.out.println("-----------------------------------");

        System.out.println("--- Using Lambda Form 2 ---");
        usingLambdaForm2();
        System.out.println("-----------------------------------");

        System.out.println("--- Using Method Refrence ---");
        usingMethodRefrence();
        System.out.println("-----------------------------------");
    }

    public static void usingAnonymousInlineClass(){
        List<Student> students = MathClass.getAllStudent();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return ((Integer)s2.getMark()).compareTo(s1.getMark());
            }
        });

        for (Student student : students)
            System.out.println(student);
    }

    public static void usingLambdaForm1(){
        List<Student> students = MathClass.getAllStudent();
        Collections.sort(students, (Student s1, Student s2) -> {
                return ((Integer)s2.getMark()).compareTo(s1.getMark());
            });

        for (Student student : students)
            System.out.println(student);
    }

    public static void usingLambdaForm2(){
        List<Student> students = MathClass.getAllStudent();
        Collections.sort(students, (s1, s2) -> ((Integer)s2.getMark()).compareTo(s1.getMark()));

        students.forEach(student -> System.out.println(student));
    }

    public static void usingMethodRefrence(){
        List<Student> students = MathClass.getAllStudent();
        Collections.sort(students, Comparator.comparing(Student::getMark).reversed());

        students.forEach(System.out::println);
    }

}
