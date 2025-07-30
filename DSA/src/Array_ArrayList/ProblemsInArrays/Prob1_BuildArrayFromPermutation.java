package Array_ArrayList.ProblemsInArrays;
//1920. Build Array from Permutation
//Problem statement: https://leetcode.com/problems/build-array-from-permutation/description/
//Time: O(n)
//Space: O(n) — for the output array

class Solution{
    public int[] buildArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[n]; // [0,0,0...n]  Create new array of same size
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];// Build according to the permutation rule
        }
        return ans;
    }
}
public class Prob1_BuildArrayFromPermutation {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,2,1,5,3,4};
        int[] result = s.buildArray(nums);
        //print output
        for (int num : result){
            System.out.print(num+ " ");
        }
    }
}
