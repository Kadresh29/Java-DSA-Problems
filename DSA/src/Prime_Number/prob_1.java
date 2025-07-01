package Prime_Number;
//✅ Check if a number is prime
//Input: n = 13 → Output: Prime
public class prob_1 {
    public static void main(String[] args) {
        int n = 13;

        if (isPrime(n)) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is NOT a Prime number");
        }
    }

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor
            }
        }

        return true; // No factors found → prime
    }
}

