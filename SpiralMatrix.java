//Q-11 Traverse a matrix in spiral order
//Logic: Use 4 boundaries (top, bottom, left, right) and shrink them after each direction
public class SpiralMatrix {
        public static void main(String[] args) {
                int[][] matrix = {
                                { 1, 2, 3, 4 },
                                { 5, 6, 7, 8 },
                                { 9, 10, 11, 12 },
                                { 13, 14, 15, 16 },
                                { 17, 18, 19, 20 }
                };

                int top = 0, bottom = matrix.length - 1;
                int left = 0, right = matrix[0].length - 1;
                StringBuilder sb = new StringBuilder();

                while (top <= bottom && left <= right) {
                        for (int i = left; i <= right; i++)
                                sb.append(matrix[top][i] + " ");
                        top++;
                        for (int i = top; i <= bottom; i++)
                                sb.append(matrix[i][right] + " ");
                        right--;
                        if (top <= bottom) {
                                for (int i = right; i >= left; i--)
                                        sb.append(matrix[bottom][i] + " ");
                                bottom--;
                        }
                        if (left <= right) {
                                for (int i = bottom; i >= top; i--)
                                        sb.append(matrix[i][left] + " ");
                                left++;
                        }
                }
                System.out.println(sb.toString().trim());
        }
}
