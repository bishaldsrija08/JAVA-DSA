public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // min_idx is the index of the minimum element in the unsorted array
            if (min_idx != i) {
                // swaps
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
// Time Complexity: O(n^2) in all cases
// Space Complexity: O(1)