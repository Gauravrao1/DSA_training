//Q-36 Find longest common prefix among array of strings
//Logic: Compare character by character across all strings at same position
public class LongestCommonPrefix {
        public static String longestCommonPrefix(String[] strs) {
                if (strs.length == 0)
                        return "";
                // Use first string as reference
                for (int i = 0; i < strs[0].length(); i++) {
                        char c = strs[0].charAt(i);
                        for (int j = 1; j < strs.length; j++) {
                                if (i >= strs[j].length() || strs[j].charAt(i) != c)
                                        return strs[0].substring(0, i);
                        }
                }
                return strs[0];
        }

        public static void main(String[] args) {
                System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" })); // fl
                System.out.println(longestCommonPrefix(new String[] { "dog", "racecar", "car" })); // ""
        }
}
