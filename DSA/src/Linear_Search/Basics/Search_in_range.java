package Linear_Search.Basics;

public class Search_in_range {
    public static void main(String[] args) {
        int[] num = {26,34,56,78,89,-2};
        int target = 78;
        int ans = linearSearch(num,target,1,4);
        System.out.println("the target item is found in index : "+ans); // output : 3
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        //Check the array is zero or not
        if(arr.length==0){
            return Integer.MAX_VALUE;//max_value is return the constant if array is not found
        }

        //run the for loop to find the targeted key
        for (int index = start; index < end; index++) {
            int elements=arr[index];
            if (elements==target){
                return index;
            }
        }
        //hence the target is not found
        return Integer.MAX_VALUE;
    }
}
