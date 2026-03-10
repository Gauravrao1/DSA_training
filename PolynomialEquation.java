
//Q-4 Solve equation a³ + a²b + 2a²b + 2ab² + ab² + b³
//Logic: Simplifies to a³ + 3a²b + 3ab² + b³ = (a+b)³
import java.util.Scanner;

public class PolynomialEquation {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a: ");
                int a = sc.nextInt();
                System.out.print("Enter b: ");
                int b = sc.nextInt();
                System.out.print("Enter c: ");
                int c = sc.nextInt();

                // a³ + a²b + 2a²b + 2ab² + ab² + b³ = (a+b)³
                long result = (long) Math.pow(a + b, 3);
                System.out.println("Result: " + result);
                sc.close();
        }
}
