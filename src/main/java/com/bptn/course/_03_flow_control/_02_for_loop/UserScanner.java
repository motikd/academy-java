package com.bptn.course._03_flow_control._02_for_loop;

import java.util.Scanner;

class UserScanner {
    public static void main(String[] args) {
        // condition
        // initialisation
        // updation
        // For Loop -> when we know the exact number of times (iteration) loop
        // should run
        for (int n = 1; n <= 10; n++) {
            System.out.println(n);
        }

        // While Loop -> when we know the end condition but we are unsure of
        // number of iterations
        int m = 5;
        while (m < 10) {
            System.out.println(m);
            m++;
        }

        // Do-While Loop -> menu-based programs
        m = 10;
        do {
            System.out.println(m);
            m++;
        } while (m < 10);

        // Keep reading positive values
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        while (true) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }

        System.out.println("The sum of positive numbers is: " + sum);

        // break and continue
        for (int n = 1; n <= 10; n++) {
            if (n == 5) {
                return;
            }
            System.out.println(n);
        }
        System.out.println("After the loop");
        scanner.close();
    }
}
