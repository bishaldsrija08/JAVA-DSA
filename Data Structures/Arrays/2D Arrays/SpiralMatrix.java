public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom row
            for (int j = endCol - 1; j >= startCol; j--) {
                // for odd case
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left column
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // for odd case
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 6 },
                { 10, 4, 5, 9 },
                { 6, 7, 8, 9 },
                { 11, 12, 13, 14 }
        };
        printSpiral(matrix);
    }
}