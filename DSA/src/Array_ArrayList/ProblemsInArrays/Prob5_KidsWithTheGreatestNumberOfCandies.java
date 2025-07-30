package Array_ArrayList.ProblemsInArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//1431. Kids With the Greatest Number of Candies
//Problem Statement: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
//Time: O(n)
//Space: O(n) for result list
public class Prob5_KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result); // Output: [true, true, true, false, true]
        boolean[] ans = KidsWithCandies(candies,extraCandies);
        System.out.println(Arrays.toString(ans));// Output: [true, true, true, false, true]
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();

        // Step 1: Find the maximum in the candies array
        for (int candy : candies){
            if (candy>max){
                max = candy;
            }
        }

        // Step 2: Compare each kid's candy + extraCandies with max
        for (int candy : candies){
            result.add(candy+extraCandies>=max);
        }
        return result;
    }

    // another method
    private static boolean[] KidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        boolean[] result = new boolean[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < n; i++) {
            result[i] = candies[i] + extraCandies >= max;
        }

        return result;
    }
}
