package a_MOTI;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement that we need to find
            int complement = target - nums[i];
            
            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (this should not happen according to the problem statement)
        return new int[0];
    }
    
    public static void main(String[] args) {
        // Only the first input
        int[] nums1 = {2, 7, 11, 15, 3, 6};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
    }
}
