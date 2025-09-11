public class KadansAlgo {
    public static void main(String[] args) {
        int[] arr = { -2, -3, -4, -1, -2, -1, -5, -3000 };
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
// Kadane's Algorithm to find the maximum subarray sum
// Handles arrays with all negative numbers by initializing maxSum to
// Integer.MIN_VALUE
// Resets currentSum to 0 when it becomes negative