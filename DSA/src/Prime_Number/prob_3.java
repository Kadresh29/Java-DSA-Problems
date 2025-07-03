package Prime_Number;
//✅ Count total prime numbers between 1 and N
//Input: n = 100 → Output: Number of primes = 25
public class prob_3{
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Number of prime numbers between 1 and " + n + " = " + count);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}

