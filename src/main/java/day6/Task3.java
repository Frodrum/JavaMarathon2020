package day6;

import day6.other_classes.Student;
import day6.other_classes.Teacher;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Марья", "География");
        Student student = new Student("Василий");
        teacher.evaluate(student);
    }
}