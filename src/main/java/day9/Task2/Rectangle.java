package day9.Task2;

import lombok.Data;

@Data
public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    /**
     * Формула площади:
     * S = width * height
     *
     * @return
     */
    @Override
    public double area() {
        return width * height;
    }

    /**
     * Формула периметра:
     * P = (width + height) * 2
     *
     * @return
     */
    @Override
    public double perimeter() {
        return (width + height) * 2;
    }
}