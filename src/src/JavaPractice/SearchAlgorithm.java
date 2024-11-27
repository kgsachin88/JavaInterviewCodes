package JavaPractice;

public class SearchAlgorithm {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 11, 13};
        int target = 13;
        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);
        if (result2 != -1) {
            System.out.println("Element found at the index: " + result2);
        } else {
            System.out.println("Element not found in the input Array");
        }
    }

    private static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] nums, int target) {
        int left =0;
        int right =nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }


        return -1;
    }


}
