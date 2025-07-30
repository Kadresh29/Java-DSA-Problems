package Linear_Search.Basics;

//problem statement : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
// to solve this problem
//1st : count the number of digits
//2nd : convert to string like 1768 ="1768" and take the length
// best code
/*class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    // Most efficient way using log10
    private boolean hasEvenDigits(int num) {
        if (num == 0) return false; // 0 has 1 digit, which is odd
        int digits = (int)(Math.log10(Math.abs(num))) + 1;
        return digits % 2 == 0;
    }
}
| Metric               | Value      | Reason                                               |
| -------------------- | ---------- | ---------------------------------------------------- |
| **Time Complexity**  | O(n)       | One loop through array, and log10() is constant time |
| **Space Complexity** | O(1)       | No extra space used; only primitive variables        |
| **Speed**            | 🔥 Fastest | Avoids string creation or object overhead            |
| **Simplicity**       | Clean      | Easy to read, efficient logic                        |
 */
public class Search_the_evendigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);// time = O(n),space = O(1)
        int ans2 = findNumbers2(nums);// time =O(n · log₁₀(max_num)) (slightly slower than log10 method),space = O(k)
        System.out.println(ans); // output : 2
        System.out.println("Using Java Library (String Conversion Method): " +ans2);// output : 2
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for (int num : nums)
            if (even(num))
                count++;
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digit2(num);
        /* if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
         */
         //simplest form use this one to less time complexity
        return numberOfDigits % 2 == 0;
    }

    //count the number of the digits and this is consume more time complexity alter method to less time is digit2
     static int digit(int num) {
        if(num<0){
            return num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while (num>0){
            count++;
            num=num/10; // num/=10;
        }
        return count;
    }
    // it less time consume than digit function
    static int digit2(int num){
        if(num<0){
            return num*-1;
        }
        return (int)(Math.log10(num))+1;// formula in maths number system
    }



    // this another method using the Using Java Library (String Conversion Method):
        static int findNumbers2(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (hasEvenDigits(num)) {
                    count++;
                }
            }
            return count;
        }
        // Using Java's String.length() method
        static boolean hasEvenDigits(int num) {
            int length = String.valueOf(Math.abs(num)).length();
            return length % 2 == 0;
        }
}
