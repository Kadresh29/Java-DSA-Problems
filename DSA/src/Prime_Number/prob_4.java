package Prime_Number;
//🔁 Check if a number is a twin prime
//Twin primes are pairs of primes that differ by 2 (like 11 and 13).
//Input: n = 13 → Output: True (13 and 11 are both prime)
public class prob_4 {
    public static void main(String[] args) {
        int n = 13;

        // Check if n is a prime and either n-2 or n+2 is also prime
        if (isPrime(n) && (isPrime(n - 2) || isPrime(n + 2))) {
            System.out.println(n + " is a Twin Prime.");
        } else {
            System.out.println(n + " is NOT a Twin Prime.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        // Check if n has any divisor from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}

