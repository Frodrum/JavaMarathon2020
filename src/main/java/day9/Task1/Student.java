package day9.Task1;

import lombok.Data;

@Data
public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Этот студент с именем %s\n", super.getName());
    }
}