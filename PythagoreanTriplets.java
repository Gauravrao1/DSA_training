//Q-2 Generate all Pythagorean triplets with values smaller than a given limit
public class PythagoreanTriplets {
        public static void main(String[] args) {
                int n = 20;
                for (int a = 1; a <= n; a++) {
                        for (int b = a; b <= n; b++) {
                                int cSquared = a * a + b * b;
                                int c = (int) Math.sqrt(cSquared);
                                if (c <= n && c * c == cSquared) {
                                        System.out.println(a + " " + b + " " + c);
                                }
                        }
                }
        }
}
