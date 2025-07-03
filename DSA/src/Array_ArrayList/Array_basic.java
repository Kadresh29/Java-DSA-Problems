package Array_ArrayList;

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
    }
}
