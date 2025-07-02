package Prime_Number;

// ✅ Print all prime numbers in a range
// Input: low = 10, high = 50 → Output: 11 13 17 19 23 29 31 37 41 43 47

public class prob_2 {
    public static void main(String[] args) {
        int low = 10;
        int high = 50;
        int sum = 0;

        System.out.println("Prime numbers between " + low + " and " + high + ":");

        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                sum += i; // No need to check again
            }
        }

        System.out.println("\nSum of prime numbers between " + low + " and " + high + " is: " + sum);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            // for(int i = 2; i * i <= n; i++) also works
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
