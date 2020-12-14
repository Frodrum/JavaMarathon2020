package day14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person {
    private String name;
    private int year;

    @Override
    public String toString() {
        return String.format("{name='%s', year=%d}", name, year);
    }
}
