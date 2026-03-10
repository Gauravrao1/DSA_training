//Q-28 Count number of valleys during a hike
//Logic: Track altitude level. Valley starts when going below 0 and ends when coming back to 0
public class CountingValleys {
        public static int countValleys(String steps) {
                int level = 0, valleys = 0;
                for (char step : steps.toCharArray()) {
                        if (step == 'U')
                                level++;
                        else
                                level--;
                        // A valley ends when we come back to sea level from below
                        if (level == 0 && step == 'U')
                                valleys++;
                }
                return valleys;
        }

        public static void main(String[] args) {
                System.out.println(countValleys("UDDDUDUU")); // Output: 1
        }
}
