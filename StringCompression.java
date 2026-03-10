//Q-29 Compress consecutive repeated characters: aabbbbeeeeffggg -> a2b4e4f2g3
//Logic: Loop through string, count consecutive same characters, append char+count
public class StringCompression {
        public static String compress(String s) {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (i < s.length()) {
                        char ch = s.charAt(i);
                        int count = 0;
                        // Count consecutive same characters
                        while (i < s.length() && s.charAt(i) == ch) {
                                count++;
                                i++;
                        }
                        sb.append(ch).append(count);
                }
                return sb.toString();
        }

        public static void main(String[] args) {
                System.out.println(compress("aabbbbeeeeffggg")); // Output: a2b4e4f2g3
        }
}
