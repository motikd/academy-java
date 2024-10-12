package com.bptn.course._07_this_keyword;

class Car {
    private String model;
    private int year;

    // Set model and return the current object
    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    // Set year and return the current object
    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ThisDemoThree {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Method chaining using 'this' to return the current object
        myCar.setModel("Tesla Model S").setYear(2024);
        myCar.display();  // Output: Model: Tesla Model S, Year: 2024
    }
}
