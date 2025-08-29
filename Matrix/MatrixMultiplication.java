public class MatrixMultiplication {

    // Matrix Multiplication: A[m][n] * B[n][p] = C[m][p]
    public static int[][] Mull(int Arr[][], int Brr[][], int m, int n, int p) {
        int newArr[][] = new int[m][p];  // Result matrix

        for (int i = 0; i < m; i++) {       // rows of A
            for (int j = 0; j < p; j++) {   // cols of B
                for (int k = 0; k < n; k++) {
                    newArr[i][j] += Arr[i][k] * Brr[k][j];
                }
            }
        }
        return newArr;
    }

    public static void main(String args[]) {

        int A[][] = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };

        int B[][] = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };

        int m = 3; // rows in A
        int n = 3; // cols in A == rows in B
        int p = 3; // cols in B

        int Arr[][] = Mull(A, B, m, n, p); // Correct order of arguments

        System.out.println("Result Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
