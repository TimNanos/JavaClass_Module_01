package by.epam.nanos;

import java.util.Random;

public class Task2 {
    public Task2() {
        System.out.println("Task 2");

        // Get random size circle
        Random rand = new Random();
        Circle circle = new Circle(rand.nextDouble());

        // Print out the numbers
        circle.print();
    }
}

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getCircleLength() {
        return 2*Math.PI*radius;
    }

    public void print(){
        System.out.println("Circle radius: " + getRadius() + ", Circle length: " + getCircleLength() + ", Area: " + getArea());
    }
}