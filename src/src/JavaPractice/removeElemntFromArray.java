package JavaPractice;

import java.util.Arrays;

public class removeElemntFromArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};

        int elementToRemove = 2;
        int index = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=elementToRemove){
                index++;
            }

        }
        System.out.println(index);
        int[] num = new int[index];
        int k = 0;
        for(int i:nums){
            if(i!=elementToRemove){
                num[k++]=i;
            }
        }

        System.out.println(index);
        System.out.println(Arrays.toString(num));

    }
}
