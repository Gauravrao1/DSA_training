//Q-14 Check if two matrices are identical
//Logic: Compare each element at same position in both matrices
public class MatrixIdentityCheck {
        public static void main(String[] args) {
                int[][] A = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
                int[][] B = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };

                boolean identical = true;
                for (int i = 0; i < A.length && identical; i++)
                        for (int j = 0; j < A[0].length && identical; j++)
                                if (A[i][j] != B[i][j])
                                        identical = false;

                System.out.println(identical ? "Matrices are identical" : "Matrices are not identical");
        }
}
