package Binary_Search.Problems;
//Problem statement : https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// 1. this problem exact same approach for Ceiling Number
// 2. Ignore the target = what we are looking for
// 3. If target is greater than or equal to all elements, return the first character (wrap-around).
// condition violated = start = end+1 -> length of the array =N
// only small change return Start % N or if( start == N) return 0;
// time complexity : O(long(n))
// space complexity : O(1)
public class Prob3_SmallestLetter {
    public static void main(String[] args) {
        //Binary search give me sorted array only
        char[] letters = {'c','f','j'};
        char target = 'a';
        char ans = nextGreatestLetter(letters,target);
        System.out.println("The index of the target element : "+ans); // output : 5
    }

    /**
     * Function to find the smallest letter greater than the given target.
     * If such letter does not exist (i.e., target >= last letter), we wrap around and return the first letter.
     *
     * @param letters Sorted array of lowercase letters
     * @param target  Target character to find the next greatest letter
     * @return        The smallest character in letters that is greater than the target
     */

    static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        //we check the start <= end
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target < letters[mid]) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        // like this happens  let length 4  and while con breaks let start =4 = 4 % 4 = 0
        //or if(start==letter.lenght) return 0;
        /*
         * At this point, start is the index of the smallest letter greater than target.
         * If target >= all elements, start == letters.length, so we wrap around:
         *    - Example: letters = ['x','x','y','y'], target = 'z' → start = 4
         *    - Wrap around: start % letters.length = 0 → return letters[0]
         */
        return letters[start % letters.length];
    }
}
