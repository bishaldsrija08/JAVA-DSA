public class maxSumSubArrays {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        // prefix array sum approach
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}

// time complexity: O(n^2)
// space complexity: O(n)
// Note: The above code finds the maximum subarray sum using the prefix sum approach.
