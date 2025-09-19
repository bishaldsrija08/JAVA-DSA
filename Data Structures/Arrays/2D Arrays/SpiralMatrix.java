public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for(){

            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 6 },
                { 10, 4, 5, 9 },
                { 6, 7, 8, 9 },
                { 11, 12, 13, 14 }
        };
    }
}