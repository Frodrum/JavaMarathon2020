package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Стивен", "Brief Answers to the Big Questions");
        Teacher teacher = new Teacher("Деннис", "Космология / Квантовая гравитация");

        student.printInfo();
        teacher.printInfo();
    }
}