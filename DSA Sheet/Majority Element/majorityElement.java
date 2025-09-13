public class majorityElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
            if (counter > (n / 2)) {
                return nums[i];
            }
        }
        return -1;
    }
}

// Brute Force Approach
// Time Complexity: O(n^2)
// Space Complexity: O(1)