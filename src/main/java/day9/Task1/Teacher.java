package day9.Task1;

import lombok.Data;

@Data
public class Teacher extends Human {
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Этот преподаватель с именем %s\n", super.getName());
    }
}