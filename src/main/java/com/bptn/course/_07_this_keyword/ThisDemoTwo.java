package com.bptn.course._07_this_keyword;


class Book {
    private String title;
    private double price;

    // Constructor 1
    public Book() {
        // Calling the second constructor using 'this'
        this("Unknown Title", 0.0);
    }

    // Constructor 2
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Price: " + price);
    }
}

public class ThisDemoTwo {
    public static void main(String[] args) {
        Book defaultBook = new Book();   // Calls constructor 1
        Book customBook = new Book("Java Programming", 29.99);  // Calls constructor 2
        
        defaultBook.display();  // Output: Title: Unknown Title, Price: 0.0
        customBook.display();   // Output: Title: Java Programming, Price: 29.99
    }
}
