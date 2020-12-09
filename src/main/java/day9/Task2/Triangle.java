package day9.Task2;

import lombok.Data;

@Data
public class Triangle extends Figure {
    private double firstLength;
    private double secondLength;
    private double thirdLength;

    public Triangle(double firstLength, double secondLength, double thirdLength, String color) {
        super(color);
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        this.thirdLength = thirdLength;
    }

    /**
     * Формула Герона:
     * S = √ (p * (p - a)*(p - b)*(p - c)), где
     * p - полупериметр треугольника (a+b+c) / 2;
     * a, b, c - длины сторон треугольника.
     *
     * @return
     */

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstLength) * (halfPerimeter - secondLength) * (halfPerimeter - thirdLength));
    }

    /**
     * Формула периметра:
     * P = a + b + c
     *
     * @return
     */
    @Override
    public double perimeter() {
        return firstLength + secondLength + thirdLength;
    }
}


