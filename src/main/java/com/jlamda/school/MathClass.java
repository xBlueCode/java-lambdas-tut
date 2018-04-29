package main.java.com.jlamda.school;

import java.util.ArrayList;
import java.util.List;

public class MathClass{

    public static List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ahmed", "B", 85));
        students.add(new Student("Jack", "VC", 64));
        students.add(new Student("Evan", "MC", 82));
        students.add(new Student("Ilyes", "D", 78));
        students.add(new Student("Ammer", "F", 58));
        students.add(new Student("Jhon", "KC", 48));
        students.add(new Student("Hamid", "R", 62));
        return students;
    }
}
