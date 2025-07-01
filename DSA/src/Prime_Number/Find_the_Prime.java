package Prime_Number;
// Finding the Prime number or not
public class Find_the_Prime {
    public static void main(String[] args) {
        int n = 20; // Set the upper limit to check for prime numbers

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // Call the isPrime() method and print result
            if (isPrime(i)) {
                System.out.println(i + " is a Prime number");
            } else {
                System.out.println(i + " is NOT a Prime number");
            }
        }
    }

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }

        int c = 2; // Start checking from 2

        // Loop from 2 up to √n
        while (c * c <= n) {
            // If n is divisible by c, it's not a prime
            if (n % c == 0) {
                return false;
            }
            c++; // Increment the counter
        }

        // If no factors found, it's a prime
        return true;
    }
}
