package Binary_Search.Problems;
//Problem statement : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=problem-list-v2&envId=array
/**
 * Problem:
 * Given a sorted array and a target value, find the starting and ending position of the target.
 * If the target is not found, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class Prob4_FindFirstAndLast {
    public static void main(String[] args) {
        //Binary search give me sorted array only
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(arr,target);
        System.out.println("The index range of the target element: [" + ans[0] + ", " + ans[1] + "]");

    }
    /**
     * Returns the first and last position of the target element.
     *
     * @param nums   Sorted array of integers
     * @param target The element to search for
     * @return       An array with start and end index of the target
     */
    static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;

        // or like this also okay
        /*ans[0] = search(nums,target,true);
        if (ans[0] != -1){
           ans[1] = search(nums,target,false);
        }*/

        return ans;
    }

    /**
     * Binary search helper function to find target index.
     * If FindStartIndex is true → find first occurrence.
     * If FindStartIndex is false → find last occurrence.
     *
     * @param nums            Sorted array
     * @param target          Target element
     * @param FindStartIndex  Boolean flag to indicate start or end search
     * @return                Index of first/last occurrence or -1 if not found
     */
    static int search(int[]nums,int target,boolean FindStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        //we check the start <= end
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target < nums[mid]) {
                end = mid-1;
            } else if (target > nums[mid]){
                start = mid+1;
            }else {
                // Potential answer found
                ans = mid;

                // Check for left or right side based on flag
                if(FindStartIndex){
                    // Look for earlier occurrence on the left
                    end = mid-1;
                }else {
                    // Look for later occurrence on the right
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
