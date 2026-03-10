
//Q-5 Calculate total tyres in each dealership
//Logic: Cars have 4 tyres, bikes have 2 tyres. Total = (cars*4) + (bikes*2)
import java.util.Scanner;

public class DealershipTyres {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt(); // number of dealerships
                for (int i = 0; i < n; i++) {
                        int cars = sc.nextInt();
                        int bikes = sc.nextInt();
                        int tyres = (cars * 4) + (bikes * 2);
                        System.out.println(tyres);
                }
                sc.close();
        }
}
