package Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax to create the ArrayList
        ArrayList<Integer> list = new ArrayList<>(10);

        //add the elements to Array keyword-> variable name.add(values/elements) like list.add(1)
        list.add(23);
        list.add(24);
        list.add(26);
        list.add(27);
        list.add(28);

        //output
        System.out.println("output of added values : "+list);//output -> [23,24,26,27,28]

        //modification the item
        list.set(0,90);
        System.out.println("After modification : "+list);//output -> [90,24,26,27,28]

        //remove the value
        list.remove(1);
        System.out.println("After removing index 1 : "+list);//output -> [90,26,27,28]

        //Take a user inputs
        System.out.println("Enter the 5 values : ");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item in any index
        System.out.println("Geting the Item in Index : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here , the list[index] is not work
        }

        //output using list
        System.out.println("output using List : ");
        System.out.println(list);


        // for 2D ArrayList
        //declaration of 2D arrayList / Syntax
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        //Initialisation of the Arraylist
        for (int i = 0; i < 3; i++) {
            lists.add(new ArrayList<>());
        }
        //adding
        System.out.println("Enter the values to 2D array : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                lists.get(i).add(in.nextInt());
            }
        }
        //output
        System.out.println("The values in 2D ArrayList : "+lists);
    }
}
