package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array_basic_Multidimensional_Array {
    public static void main(String[] args) {
        //Declaration of 2D array
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] arr2D = {{1,2,3},// 0th index
                {2,3},// 1st index
                {4,5,6,7}// 2nd index -> arr2D[2] = [4,5,6,7]
        };
        System.out.println(arr.length);// print the number of rows

        //input
        System.out.println("Enter the elements : ");
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
        System.out.println("The elements are : ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();// for newline
        }

        //output easy method using Array.toString()
        System.out.println("The elements printing using Arrays.toString() : ");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Output using for-each loop or call as enhanced for loop
        System.out.println("The elements Printing in for-each loop : ");
        for (int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
    }
}
