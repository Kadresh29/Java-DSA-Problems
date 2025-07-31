package Array_ArrayList.ProblemsInArrays;

import java.util.HashMap;

//1512. Number of Good Pairs
//Problem Statement: https://leetcode.com/problems/number-of-good-pairs/description/
public class Prob6_NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = numIdenticalPairs(nums);
    }

    // Optimized Using HashMap
    //Time: O(n)
    //Idea: Count frequency of each number. If a number appears k times, it contributes k * (k - 1) / 2 good
    private static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                count += map.get(num);  // All previous same elements can pair with this one
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        return count;
    }

    //Brute Force (Nested Loops)
    //Time: O(n²)
    public static int NumIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
