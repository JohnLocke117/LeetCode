package Leetcode;

public class MatrixDiagonalSum {
    static MatrixDiagonalSum classObject = new MatrixDiagonalSum();
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0, j = mat.length - 1; i < mat.length && j >= 0; i++, j--) {
            sum += mat[i][i];
            sum += mat[j][i];
        }

        if (mat.length % 2 == 1) {
            int mid = mat[mat.length / 2][mat.length / 2];
            System.out.println(mid);
            sum -= mid;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat =  {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        int[][] mat1 =  {{7,3,1,9},
                         {3,4,6,9},
                         {6,9,6,6},
                         {9,5,8,5}};

        System.out.println(classObject.diagonalSum(mat1));
    }
}
