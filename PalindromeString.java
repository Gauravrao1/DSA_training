//Q-34 Check if a string is palindrome
//Logic: Compare characters from both ends moving towards center
public class PalindromeString {
        public static boolean isPalindrome(String s) {
                int left = 0, right = s.length() - 1;
                while (left < right) {
                        if (s.charAt(left) != s.charAt(right))
                                return false;
                        left++;
                        right--;
                }
                return true;
        }

        public static void main(String[] args) {
                System.out.println(isPalindrome("abba")); // true
                System.out.println(isPalindrome("abc")); // false
                System.out.println(isPalindrome("madam")); // true
        }
}
