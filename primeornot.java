//First Question
//Write a function to check if a given number is prime
public class primeornot {

        public static boolean isPrime(int n) {
                if (n <= 1)
                        return false;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0)
                                return false;
                }
                return true;
        }
        public static void main(String[] args) { 
                int number = 29;
                System.out.println(isPrime(number));
        }
}
