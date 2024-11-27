package JavaPractice;

import java.util.Arrays;

public class moveZerosinArray_ToLeft {
    public static void main(String[] args) {
        int[] input = {1, 0, 2, 0, 4, 3, 0, 5};
        int index = input.length - 1;
        for(int i = input.length-1;i>=0;i--){
            if(input[i]!=0){
                input[index--]=input[i];
            }

        }
        while (index>=0){
            input[index--] = 0;
        }
        System.out.println(Arrays.toString(input));
    }

}
