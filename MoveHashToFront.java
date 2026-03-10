//Q-26 Move all '#' to front of string and remove them
//Logic: Replace all '#' with empty string (removing them from original position)
public class MoveHashToFront {
        public static void main(String[] args) {
                String input = "Move#Hash#to#Front";

                // Count hashes and build string without them
                String result = input.replace("#", "");
                // Prepend '#' characters to front
                int hashCount = input.length() - result.length();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < hashCount; i++)
                        sb.append("#");
                sb.append(result);

                System.out.println(sb.toString()); // ###MoveHashtoFront
        }
}
