package day9.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Figure {
    private String color;

    public abstract double area();
    public abstract double perimeter();
}