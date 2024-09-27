public class StepsToZero {
    public static int numberOfSteps(int num) {
        int steps = 0; // Initialize the steps counter

        // Repeat until num becomes 0
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2; // If num is even, divide by 2
            } else {
                num -= 1; // If num is odd, subtract 1
            }
            steps++; // Increment the step counter
        }

        return steps; // Return the total number of steps
    }

    public static void main(String[] args) {
        // Test 1
        int num = 123;
        int steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);

        // Test 2
        num = 14;
        steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);

        // Test 3
        num = 8;
        steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
    }
}
