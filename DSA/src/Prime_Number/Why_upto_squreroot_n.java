package Prime_Number;

public class Why_upto_squreroot_n {
    public static void main(String[] args) {
        int num = 1_000_003; // You can try larger numbers too

        // ✅ Efficient check (up to √n)
        long start1 = System.nanoTime();
        boolean isPrime1 = isPrimeEfficient(num);
        long end1 = System.nanoTime();

        System.out.println("Efficient Method: " + num + " is " + (isPrime1 ? "Prime" : "Not Prime"));
        System.out.println("Time taken (√n method): " + (end1 - start1) + " ns");

        // ❌ Naive check (up to n)
        long start2 = System.nanoTime();
        boolean isPrime2 = isPrimeNaive(num);
        long end2 = System.nanoTime();

        System.out.println("Naive Method: " + num + " is " + (isPrime2 ? "Prime" : "Not Prime"));
        System.out.println("Time taken (n method): " + (end2 - start2) + " ns");
    }

    // ✅ Efficient prime check (up to √n)
    static boolean isPrimeEfficient(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ❌ Naive prime check (up to n)
    static boolean isPrimeNaive(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

