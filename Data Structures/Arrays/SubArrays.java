public class SubArrays {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArraysAndSum(arr);
    }

    public static void printSubArraysAndSum(int arr[]) {
        int total = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum = 0; 
            for (int j = i; j < arr.length; j++) {
                // for (int k = i; k <= j; k++) {
                //     currentSum += arr[k];
                // }
                currentSum+=arr[j]; // optimization;
                // System.out.println(currentSum + "");
                // if (currentSum > maxSum) {
                //     maxSum = currentSum;
                // }
                maxSum = Math.max(maxSum, currentSum);
                total++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + total);
        System.out.println("Max sum: " + maxSum);
    }
}
// time complexity: O(n^3)
// space complexity: O(1)
// Note: The above code prints all subarrays and their sums, counts total subarrays, and finds the maximum subarray sum using a brute-force approach.