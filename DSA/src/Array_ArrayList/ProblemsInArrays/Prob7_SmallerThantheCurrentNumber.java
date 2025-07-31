package Array_ArrayList.ProblemsInArrays;

//1365. How Many Numbers Are Smaller Than the Current Number
//Problem Statement: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class Prob7_SmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(nums);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    //Optimized – O(n)
    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] result = new int[nums.length];

        // Step 1: Count frequency
        for (int num : nums) {
            count[num]++;
        }

        // Step 2: Build prefix sum
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: For each nums[i], find how many are less than it
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }

        return result;
    }

    //Brute Force – O(n²) another method
    public static int[] SmallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
}
