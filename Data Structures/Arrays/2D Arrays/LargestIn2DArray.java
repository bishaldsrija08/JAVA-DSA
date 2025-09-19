public class LargestIn2DArray {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 10, 4, 5 },
                { 6, 7, 8 }
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("largest element is: " + largest);
    }
}