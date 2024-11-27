package JavaPractice;

import java.util.Arrays;

public class moveZeroinArray_to_right {
    public static void main(String[] args) {
        int[] input = {1, 0, 2, 0, 4, 3, 0, 5};
        int index=0;
        for(int i=0;i<input.length;i++) {
            if (input[i] != 0) {
                input[index] = input[i];
                index++;
            }
        }
            while(index<input.length){
                input[index++] = 0;
            }

            System.out.println(Arrays.toString(input));

    }
}
