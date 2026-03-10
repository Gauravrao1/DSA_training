
//Q-13 Merge all overlapping intervals
//Logic: Sort by start time, then merge if current interval overlaps with previous
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
        public static int[][] merge(int[][] intervals) {
                Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
                List<int[]> result = new ArrayList<>();
                result.add(intervals[0]);

                for (int i = 1; i < intervals.length; i++) {
                        int[] last = result.get(result.size() - 1);
                        if (intervals[i][0] <= last[1]) {
                                last[1] = Math.max(last[1], intervals[i][1]); // merge
                        } else {
                                result.add(intervals[i]);
                        }
                }
                return result.toArray(new int[0][]);
        }

        public static void main(String[] args) {
                int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
                int[][] merged = merge(intervals);
                for (int[] interval : merged)
                        System.out.print(Arrays.toString(interval) + " ");
        }
}
