import java.util.Arrays;

public class majorityElementBetter {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0];
        int count = 1;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
                ans = nums[i];
            }
            if (count > n / 2) {
                return ans;
            }
        }
        return -1;
    }
}

// Better Approach: Sorting the array and returning the middle element
// Time Complexity: O(n log n) due to sorting
// Space Complexity: O(1)