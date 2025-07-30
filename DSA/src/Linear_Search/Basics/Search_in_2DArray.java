package Linear_Search.Basics;

import java.util.Arrays;

public class Search_in_2DArray {
    public static void main(String[] args) {
        int[][] arr ={{23,45,67,76},
                {34,56,78},
                {56,78,90,88}};
        int target = 88;
        int[] ans = search2Darray(arr,target);
        int ans2 = max(arr);
        System.out.println("the targeted element found in : "+ Arrays.toString(ans));
        System.out.println("the max element is : "+ans2);
    }
    static int[] search2Darray(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }

    //to find the max element
    static int max(int[][] arr){
        int max=arr[0][0];//or max=Integer.MAX_VALUE
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
