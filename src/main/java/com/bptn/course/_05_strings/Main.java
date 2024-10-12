package com.bptn.course._05_strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
        
        String command = scan.nextLine();
        
        if (command.equals("n")) {
            System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
        } else if (command.equals("s")) {
            System.out.println("You walk towards the sea and feel the waves lapping at your feet.");
        } else if (command.equals("e")) {
            System.out.println("You approach the beach shack. It looks inviting with a warm glow coming from inside.");
        } else if (command.equals("w")) {
            System.out.println("You venture west and discover a hidden cove.");
        } else {
            System.out.println("That's not a valid direction! Please choose n, e, s, or w.");
        }
        
        System.out.println("End of adventure!");   
        scan.close();
    }
}
