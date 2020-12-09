package day9.Task2;

import lombok.Data;

@Data
public class Circle extends Figure {
    private double radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    /**
     * Формула площади:
     * S = p * R2
     *
     * @return
     */
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Формула периметра:
     * P = 2pR
     *
     * @return
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
