//Q-30 Reverse a string
//Logic: Convert to char array, swap from both ends towards center
public class ReverseString {
        public static String reverse(String s) {
                char[] arr = s.toCharArray();
                int left = 0, right = arr.length - 1;
                while (left < right) {
                        char temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;
                        left++;
                        right--;
                }
                return new String(arr);
        }

        public static void main(String[] args) {
                System.out.println(reverse("Capgemini")); // Output: inimegpaC
                System.out.println(reverse("GLA")); // Output: ALG
        }
}
