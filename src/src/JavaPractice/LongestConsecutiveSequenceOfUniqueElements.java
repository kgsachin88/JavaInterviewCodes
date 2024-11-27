package JavaPractice;

import java.util.HashMap;

public class LongestConsecutiveSequenceOfUniqueElements {
    public static void main(String[] args) {
        int[] arr = {4,1,1,2,2,2,1,1,1,1,3,3,1,1,2,2,2,2,2,1,3,3,3};
        HashMap<Integer,Integer> maxConsecutiveCounts = new HashMap<>();
        int currentNum = arr[0];
        int currentCount = 1;
        for (int i =1;i<arr.length;i++){
            if(arr[i]==currentNum){
                currentCount++;
            }else {
                if(!maxConsecutiveCounts.containsKey(currentNum) || currentCount>maxConsecutiveCounts.get(currentNum)){
                    maxConsecutiveCounts.put(currentNum,currentCount);
                }
                currentNum =arr[i];
                currentCount =1;
            }

            }
        if(!maxConsecutiveCounts.containsKey(currentNum) || currentCount>maxConsecutiveCounts.get(currentNum)){
            maxConsecutiveCounts.put(currentNum,currentCount);
        }
        System.out.println(maxConsecutiveCounts);
    }
}
