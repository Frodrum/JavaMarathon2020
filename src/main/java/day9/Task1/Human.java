package day9.Task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human {
    private String name;

    public void printInfo() {
        System.out.printf("Этот человек с именем %s\n", name);
    }
}