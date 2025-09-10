// Prerequisites: Sorted array
public class BinarySearch {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = 140;
        int ans = binarySearch(numbers, target);
        System.out.println(ans + " is the index for the key " + target);
    }

    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid; // found
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Binary Search works only on sorted arrays