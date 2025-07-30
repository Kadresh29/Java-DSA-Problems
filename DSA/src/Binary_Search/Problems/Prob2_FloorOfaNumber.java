package Binary_Search.Problems;
//Problem statement : Find the Floor of the number
// Floor means Greatest number in an array smaller than or = target
//Step 1: figure out the target
//Step 2: check the smallest than or = target
//Step 3: check greater  number in smaller than or = target
// it is same as Binary Search , simple change in return -1 change as return end
// time complexity : O(long(n))
// space complexity : O(1)
public class Prob2_FloorOfaNumber {
    public static void main(String[] args) {
        //Binary search give me sorted array only
        int[] arr = {2,3,5,9,14,16,17,18,20,21};
        int target = 19;
        int ans = FloorOfaNumber(arr,target);
        System.out.println("The index of the target element : "+ans); // output : 5
    }
    static int FloorOfaNumber(int[] arr, int target){

        //But what if target greater than the greatest in the array
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        //we check the start <= end
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target < arr[mid]) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return end;
    }
}
