package Linear_Search.Problems;
// problem statement : https://leetcode.com/problems/richest-customer-wealth/description/
public class Prob1_RichestCustomer {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{3,2,1}};
        int ans = Maxwealth(arr);
        System.out.println(ans);
    }
    // This method returns the maximum wealth among all customers
    static int Maxwealth(int[][] accounts){
        // Initialize max to the smallest possible integer value
        int max = Integer.MIN_VALUE;
        // Iterate over each customer's accounts
        for (int[] ints : accounts) {
            int sum = 0;// To store total wealth of the current customer
            // Sum up all bank balances for the current customer
            for (int anInt : ints) {
                sum += anInt;
            }
            // Update max if current customer's wealth is greater than previous max
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
