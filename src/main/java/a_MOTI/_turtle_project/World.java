package a_MOTI._turtle_project;

import java.awt.Color;

public class World {
    
    private int width;
    private int height;
    private Color backgroundColor;

    // Constructor to initialize the World with specified dimensions and background color
    public World(int width, int height, Color backgroundColor) {
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        setupWorld();
    }

    // Default constructor with standard dimensions and a white background color
    public World() {
        this(400, 400, Color.WHITE);
    }

    // Method to set up the world display (placeholder for a graphical environment setup)
    private void setupWorld() {
        System.out.println("Setting up a world of dimensions " + width + "x" + height);
        System.out.println("Background color: " + backgroundColor);
    }

    // Getters and Setters for width, height, and background color
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        setupWorld(); // Update display
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        setupWorld(); // Update display
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        setupWorld(); // Update display
    }

}
