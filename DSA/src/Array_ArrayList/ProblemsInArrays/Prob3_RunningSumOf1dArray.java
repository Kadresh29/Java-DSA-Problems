package Array_ArrayList.ProblemsInArrays;
//1480. Running Sum of 1d Array
//Problem Statement: https://leetcode.com/problems/running-sum-of-1d-array/description/
//| Time  | O(n)  |
//| Space | O(n)  | (for the new array)

class Solution3{
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];

        runningSum[0] = nums[0]; // First element stays the same

        for (int i = 1; i < n; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i]; // Add previous sum
        }
        /*or If modifying nums is allowed:
        for (int i = 1; i < nums.length; i++) {
           nums[i] += nums[i - 1];
        }
        return nums;
        This saves space — O(1) extra space.
         */
        return runningSum;
    }
}
public class Prob3_RunningSumOf1dArray {
    public static void main(String[] args) {
        Solution3 s =new Solution3();
        int[] nums = {1, 2, 3, 4};
        int[] result = s.runningSum(nums);

        for (int num : result) {
            System.out.print(num + " ");  // Output: 1 3 6 10
        }
    }
}
