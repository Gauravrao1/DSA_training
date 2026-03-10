//Q-8 Rotate a 2D matrix by 90 degrees clockwise
//Logic: First transpose the matrix (swap rows/cols), then reverse each row
public class MatrixRotation90 {
        public static void rotate(int[][] matrix) {
                int n = matrix.length;
                // Step 1: Transpose - swap matrix[i][j] with matrix[j][i]
                for (int i = 0; i < n; i++)
                        for (int j = i + 1; j < n; j++) {
                                int temp = matrix[i][j];
                                matrix[i][j] = matrix[j][i];
                                matrix[j][i] = temp;
                        }
                // Step 2: Reverse each row
                for (int i = 0; i < n; i++)
                        for (int j = 0; j < n / 2; j++) {
                                int temp = matrix[i][j];
                                matrix[i][j] = matrix[i][n - 1 - j];
                                matrix[i][n - 1 - j] = temp;
                        }
        }

        public static void main(String[] args) {
                int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
                rotate(matrix);
                for (int[] row : matrix) {
                        for (int val : row)
                                System.out.print(val + " ");
                        System.out.println();
                }
        }
}
