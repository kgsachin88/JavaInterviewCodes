package JavaPractice;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,1,1,1,1,3,3,1,1,2,2,2,2,2,1,3,3,3};
        int maxlength = 1;
        int currentLength = 1;
        int currentElement = arr[0];
        int arrayLength = arr.length;


        for(int i = 1;i<arrayLength;i++){
            if (arr[i]==currentElement){
                currentLength++;
            }else{
                if(currentLength>maxlength){
                    maxlength = currentLength;

                }
                currentElement = arr[i];
                currentLength=1;

            }
        }


        if(currentLength>maxlength){
            maxlength = currentLength;
        }

        System.out.println(maxlength);

    }

}
