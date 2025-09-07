public class butterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // upper left half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // upper right half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // Lower left half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Lower right half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// 2nd approach to butterfly pattern for 2nd half

    //     for (int i = 1; i <= n; i++) {
    //         // Lower left half
    //         for (int j = 1; j <= (n - i + 1); j++) {
    //             System.out.print("*");
    //         }
    //         // Spaces
    //         for (int j = 1; j <= 2 * (i - 1); j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= (n - i + 1); j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

}}
