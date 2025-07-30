package Array_ArrayList.ProblemsInArrays;
//1929. Concatenation of Array
//Problem Statement: https://leetcode.com/problems/concatenation-of-array/description/
//Time	O(n)
//Space	O(2n) — for the new array ans
class Solution2{
    // Method to return concatenated array of size 2n
    public int[] getConcatenation(int[] nums) {
        int n = nums.length; // Get the length of original array
        int[] ans = new int[2 * n]; // Create a new array of size 2n

        // Loop through the original array
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // Place nums[i] at position i
            ans[i + n] = nums[i];   // Also place nums[i] at position i + n
        }
        return ans; // Return the final array
    }
}
public class Prob2_ConcatenationOfArray {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = {1,2,1};
        int[] result = s.getConcatenation(nums);
        //print output
        for (int num : result){
            System.out.print(num+ " ");
        }
    }
}
