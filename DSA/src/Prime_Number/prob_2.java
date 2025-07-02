package Prime_Number;
//✅ Print all prime numbers in a range
//Input: low = 10, high = 50 → Output: 11 13 17 19 23 29 31 37 41 43 47
public class prob_2 {
    public static void main(String[] args) {
        for (int i = 10; i <=50 ; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i*i <=n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}

