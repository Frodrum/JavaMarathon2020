package day6.other_classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@Data
@AllArgsConstructor
public class Teacher {
    private String name;
    private String subject;

    public void evaluate(Student someStudent) {
        String mark;
        Random random = new Random();
        int number = random.nextInt(4) + 2;

        switch (number) {
            case 2:
                mark = "Неудовлетворительно";
                break;
            case 3:
                mark = "Удовлетворительно";
                break;
            case 4:
                mark = "Хорошо";
                break;
            case 5:
                mark = "Отлично";
                break;
            default:
                mark = "Что-то странное с этим студентом";
        }

        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s\n", name, someStudent.getName(), subject, mark);
    }
}