public class rotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target =0;
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                return;
            }
            if(nums[start]<=nums[mid]){ // Left side is sorted
                if(target>=nums[start] && target<=nums[mid]){
                    
                }
            }
        }
    }
}
