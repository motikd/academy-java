package a_MOTI;

public class StepsToZero {
    public static void main(String[] args) {
        // Test for num = 123
        int num = 123; // Input number
        int steps = numberOfSteps(num);
        System.out.println("Input: num = " + num);
        System.out.println("Output: " + steps); // Expected Output: 12
    }
    
    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) { // If num is even
                num /= 2;
            } else { // If num is odd
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
