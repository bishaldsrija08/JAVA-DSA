public class LargestSmallestInArray {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 6, 3, 5, 4, 99, 23, 54, 12 };
        System.out.println(largest(arr));
    }

    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest: " + smallest);
        return largest;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)