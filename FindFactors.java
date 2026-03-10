
//Q-7 Find all factors of a given number
//Logic: Loop from 1 to n, if n % i == 0 then i is a factor. Negative input: use absolute value
import java.util.Scanner;

public class FindFactors {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                if (n == 0) {
                        System.out.println("No Factors");
                        return;
                }

                n = Math.abs(n); // ignore sign for negative numbers
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= n; i++) {
                        if (n % i == 0) {
                                if (sb.length() > 0)
                                        sb.append(",");
                                sb.append(i);
                        }
                }
                System.out.println(sb);
                sc.close();
        }
}
