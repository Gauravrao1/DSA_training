//Q-37 Check if one string is rotation of another
//Logic: If s2 is rotation of s1, then s2 will be a substring of s1+s1
public class StringRotationCheck {
        public static boolean isRotation(String s, String goal) {
                if (s.length() != goal.length())
                        return false;
                // Concatenate s with itself and check if goal is a substring
                return (s + s).contains(goal);
        }

        public static void main(String[] args) {
                System.out.println(isRotation("abcde", "cdeab")); // true
                System.out.println(isRotation("abcde", "abced")); // false
        }
}
