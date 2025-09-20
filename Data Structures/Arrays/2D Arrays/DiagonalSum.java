public class DiagonalSum {
    public static void main(String[] args) {
        // int matrix[][] = {
        //         { 1, 2, 3, 6 },
        //         { 10, 4, 5, 9 },
        //         { 6, 7, 8, 9 },
        //         { 11, 12, 13, 14 }
        // };
        // 3x3 matrix
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }, 
                { 7, 8, 9 }
        };
        int sum = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (((i + j) == n - 1)) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}