package Linear_Search.Basics;
// Find the minimum number in the array
public class Search_the_Minimum {
    public static void main(String[] args) {
        int[] num = {26,34,56,78,89};
        int ans = mini(num);
        System.out.println("The minimum number in the array : "+ans);//output : 26
    }
    static int mini(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
