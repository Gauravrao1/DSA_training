
//Q-6 Find product with minimum discount amount
//Logic: Calculate discount = price * percentage / 100 for each item, find minimum
import java.util.Scanner;
import java.util.ArrayList;

public class MinimumDiscountProduct {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = Integer.parseInt(sc.nextLine());
                String[] names = new String[n];
                int[] discounts = new int[n];

                for (int i = 0; i < n; i++) {
                        String line = sc.nextLine();
                        String[] parts = line.split(",");
                        names[i] = parts[0];
                        int price = Integer.parseInt(parts[1]);
                        int percent = Integer.parseInt(parts[2]);
                        discounts[i] = price * percent / 100;
                }

                // Find minimum discount
                int minDiscount = discounts[0];
                for (int i = 1; i < n; i++) {
                        if (discounts[i] < minDiscount)
                                minDiscount = discounts[i];
                }

                // Print all products with minimum discount
                for (int i = 0; i < n; i++) {
                        if (discounts[i] == minDiscount)
                                System.out.println(names[i]);
                }
                sc.close();
        }
}
