public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int key = 60;
        int result = linearSearch(arr, key);
        if (result != -1) {
            System.out.println("Element fount at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}