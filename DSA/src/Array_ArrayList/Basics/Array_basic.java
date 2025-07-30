package Array_ArrayList.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array_basic {
    public static void main(String[] args) {
        //declaration of  array
        // This are the array of the primitives
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int[] rollno = new int[5];
        rollno[0]= 28;
        rollno[1]=34;
        rollno[2]=45;
        rollno[3]=56;
        //Printing the array index 3
        System.out.println("Printing Index 3 : " +rollno[3]);// output = 56
        System.out.println("Printing Index 4 : " +rollno[4]);//output = 0

        //Input using for loop
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(); // take the user input and store in arr[i]
        }
        //printing the entered elements
        System.out.println("Printing  the elements  what you entered : ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n");

        System.out.println("Printing using for-each loop : ");
        // Using for-each loop
        for(int num : arr){
            System.out.print(num+ " ");// Here the num represent the elements of array
        }

        System.out.println("\n");

        // Another easy method to print using : Array.toString(arr) This is the best one
        System.out.println("Printing using Arrays : " +Arrays.toString(arr));


        //System.out.println(arr[5]);// Error : ArrayIndexOutOfBoundsException


        // This the array of the object
        String[] str = new String[4];
        System.out.println("Enter the String elements");
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        System.out.println("String elements to print : "+Arrays.toString(str));

        //Swap the array
        int[] arr1  = { 1,2,3,4,5};
        swap(arr1,1,2);
        System.out.println("swaped array : "+Arrays.toString(arr1));//output-> [1,3,2,4,5]

        //Find the Max
        System.out.println("The max value in the array : "+max(arr1));//output-> 5

        //Find the Range in max
        System.out.println("The range in array to find max : "+maxrange(arr1,0,3));//output-> 3

        //reverse the array
        Reverse(arr1);
        System.out.println("the reversed array : "+Arrays.toString(arr1));
    }
    static void swap(int[] arr1,int index1,int index2){
        int temp=arr1[index1];
        arr1[index1]=arr1[index2];
        arr1[index2]=temp;
    }
    static int max(int[] arr1){

        if (arr1.length==0){// work on edge cases here ,like array being null
            return -1;
        }
        int maxValue=arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]>maxValue){
                maxValue=arr1[i];
            }
        }
        return maxValue;
    }

    static int maxrange(int[] arr1,int start,int end){

        // Edge case : Invalid range
        if (start < 0 || end > arr1.length || start >= end) {
            return -1;
        }
        //edge case : array=null
        if (arr1==null){// work on edge cases here ,like array being null
            return -1;
        }

        int maxValue = arr1[start];
        for (int i = start; i < end; i++) {
            if (arr1[i]>maxValue){
                maxValue=arr1[i];
            }
        }
        return maxValue;
    }

    static void Reverse(int[] arr1){
        int start=0;
        int end=arr1.length-1;
        while(start<end){
            swap(arr1,start,end);
            start++;
            end--;
        }
    }
}
