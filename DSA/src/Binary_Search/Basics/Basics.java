package Binary_Search.Basics;
// time complexity : O(long(n))
// space complexity : O(1)
public class Basics{
    public static void main(String[] args) {
        //Binary search give me sorted array only
        int[] arr = {-18,-14,-1,0,3,5,7,89};
        int target = 3;
        int ans = BinarySearch(arr,target);
        System.out.println("The index of the target element : "+ans); // output : 4
    }

    //Binary search
    // If element found return the index
    // if not found return -1
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        //we check the start <= end
        while (start<=end){
            //find the mid element
            //int mid = (start-end)/2; //might be a possible that (start-end)exceeds the range of the integer
            // when the large input size
            // we can use like this start+(end-start)/2
            // this also same but diff
            // start+(end-start)/2 = 2start+end-start/2 = start-end/2
            int mid = start+(end-start)/2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else return mid;
        }
        return -1;
    }
}
