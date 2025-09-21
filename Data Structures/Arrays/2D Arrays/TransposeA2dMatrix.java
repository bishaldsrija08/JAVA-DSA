public class TransposeA2dMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2 },
                { 4, 5 },
                { 7, 8 }
        };
        int row = matrix.length;
        int col = matrix[0].length;
        // new 2d array for transposed matrix
        // reverse row and col
        int[][] transposed = new int[col][row];
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}