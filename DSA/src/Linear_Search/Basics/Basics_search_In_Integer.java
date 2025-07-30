package Linear_Search.Basics;

public class Basics_search_In_Integer {
    public static void main(String[] args) {
        int[] num = {26,34,56,78,89,-2};
        int target = 78;
        int ans = linearSearch(num,target);
        int ans2 = linearSearch2(num,target);
        boolean ans3 = linearSearch3(num,target);
        System.out.println("the target item is found in index : "+ans);//output : 3
        System.out.println("the target item is found , element : "+ans2);//output : 78
        System.out.println("the target item is found , return true otherwise false : "+ans3); //output : true


    }

    //Searching in the array : if item is found return the index
    //otherwise return max_value
    static int linearSearch(int[] arr,int target){
        //Check the array is zero or not
        if(arr.length==0){
            return Integer.MAX_VALUE;//max_value is return the constant if array is not found
        }

        //run the for loop to find the targeted key
        for (int index = 0; index < arr.length; index++) {
            int elements=arr[index];
            if (elements==target){
                return index;
            }
        }
        //hence the target is not found
        return Integer.MAX_VALUE;
    }

    // search the elements
    static int linearSearch2(int[] arr,int target){
        //Check the array is zero or not
        if(arr.length==0){
            return Integer.MAX_VALUE;//max_value is return the constant if array is not found
        }

        //run the for loop to find the targeted key
        for (int elements : arr) {
            if (elements == target) {
                return elements;
            }
        }
        //hence the target is not found
        return Integer.MAX_VALUE;
    }

    // search the element return true or false
    static boolean linearSearch3(int[] arr,int target){
        //Check the array is zero or not
        if(arr.length==0){
            return false;//max_value is return the constant if array is not found
        }

        //run the for loop to find the targeted key
        for (int elements : arr) {
            if (elements == target) {
                return true;
            }
        }
        //hence the target is not found
        return false;
    }
}
