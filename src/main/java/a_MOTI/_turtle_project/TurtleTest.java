package a_MOTI._turtle_project;

import java.awt.Color;

public class TurtleTest {
    public static void main(String[] args) {
        World habitat = new World(300, 300, Color.WHITE);
        Turtle yertle = new Turtle(habitat);
        yertle.forward(100); 
        yertle.forward(100); 
        yertle.right(90);
        yertle.forward(100);
        yertle.goTo(0,0);
    }
}