public class MooresVotingMajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        // int[] arr = {10, 10, 2, 10, 3, 5, 10};
        // int[] arr = { 17, 19, 9, 5, 3, 6, 17, 7, 18, 16, 18, 11, 3, 15, 2 };
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int freq = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (freq == 0) {
                ans = arr[i];
            }
            if (arr[i] == ans) {
                freq++;
            } else {
                freq--;
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans) {
                count++;
            }
        }
        if (count > (arr.length) / 2) {
            return ans;
        } else {
            return -1;
        }
    }
}