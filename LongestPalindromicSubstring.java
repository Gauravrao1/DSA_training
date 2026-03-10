//Q-35 Find longest palindromic substring
//Logic: Expand around each center (both odd and even length palindromes)
public class LongestPalindromicSubstring {
        static int start = 0, maxLen = 0;

        static void expand(String s, int left, int right) {
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                        if (right - left + 1 > maxLen) {
                                start = left;
                                maxLen = right - left + 1;
                        }
                        left--;
                        right++;
                }
        }

        public static String longestPalindrome(String s) {
                start = 0;
                maxLen = 0;
                for (int i = 0; i < s.length(); i++) {
                        expand(s, i, i); // odd length
                        expand(s, i, i + 1); // even length
                }
                return s.substring(start, start + maxLen);
        }

        public static void main(String[] args) {
                System.out.println(longestPalindrome("babad")); // bab or aba
                System.out.println(longestPalindrome("cbbd")); // bb
        }
}
