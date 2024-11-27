package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class priting_logest_sequence_array {
    public static void main(String[] args) {
        int[] arr = {100,4,200,3,2,3,2,4,6,4,3,5,7,4,8,0,6,9,10};
        if(arr.length==0){
            System.out.println("No Sequence!");
        }

        Set<Integer> set  = new HashSet<>();
        for(int nums:arr){
            set.add(nums);
        }
        System.out.println(set);
        int maxlength =0;
        int startofLongestSeq = 0;
        for(int num:set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentstreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentstreak++;
                }
                if (currentstreak > maxlength) {
                    maxlength = currentstreak;
                    startofLongestSeq = num;
                }
            }
        }
        System.out.println("Longest Sequesnce :");
        for(int i =0;i<maxlength;i++){
            System.out.print(((startofLongestSeq)+i)+" ");
        }
    }
}
