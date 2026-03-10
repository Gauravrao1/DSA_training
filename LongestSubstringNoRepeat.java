
//Q-38 Find length of longest substring without repeating characters
//Logic: Sliding window with a HashSet to track characters in current window
import java.util.HashSet;

public class LongestSubstringNoRepeat {
        public static int lengthOfLongestSubstring(String s) {
                HashSet<Character> set = new HashSet<>();
                int left = 0, maxLen = 0;

                for (int right = 0; right < s.length(); right++) {
                        // Shrink window from left until no duplicate
                        while (set.contains(s.charAt(right))) {
                                set.remove(s.charAt(left));
                                left++;
                        }
                        set.add(s.charAt(right));
                        maxLen = Math.max(maxLen, right - left + 1);
                }
                return maxLen;
        }

        public static void main(String[] args) {
                System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
                System.out.println(lengthOfLongestSubstring("bbbbb")); // 1
                System.out.println(lengthOfLongestSubstring("pwwkew")); // 3
        }
}
