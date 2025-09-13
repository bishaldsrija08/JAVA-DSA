public class Question1 {
    public static void main(String[] args) {
        int arr[]= {7,1,5,3,6,4,2};
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element found: " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicate elements found.");
    }
}