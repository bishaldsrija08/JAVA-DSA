import java.util.Arrays;
import java.util.Collections;

public class inBuiltSort {
    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 3, 2, 1, 6, 10, 7, 8 };
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}