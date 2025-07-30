package Array_ArrayList.ProblemsInArrays;
//1470. Shuffle the Array
//Problem Statement: https://leetcode.com/problems/shuffle-the-array/description/
//Time	O(n)
//Space	O(n)
public class Prob4_ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = shuffle(nums, n);

        for (int num : result) {
            System.out.print(num + " ");  // Output: 2 3 5 4 1 7
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];         // Place xi
            ans[2 * i + 1] = nums[i + n]; // Place yi
        }

        return ans;
    }
}
