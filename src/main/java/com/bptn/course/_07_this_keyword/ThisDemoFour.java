package com.bptn.course._07_this_keyword;


class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // Method to compare two Circle objects
    public boolean isLargerThan(Circle other) {
        return this.getArea() > other.getArea();
    }
}

public class ThisDemoFour {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);
        
        if (circle1.isLargerThan(circle2)) {
            System.out.println("Circle1 is larger than Circle2");
        } else {
            System.out.println("Circle2 is larger than Circle1");
        }
    }
}
