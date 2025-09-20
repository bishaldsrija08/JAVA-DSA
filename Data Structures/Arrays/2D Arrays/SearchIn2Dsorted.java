public class SearchIn2Dsorted {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 20;
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Found at: " + row + ", " + col);
                return;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Not Found");
    }
}

// TC = O(n+m)
// SC = O(1)