package JavaPractice;

public class LargestInTheArray {
    public static void main(String[] args) {
        int[] input = {3,4,2,5,10,9,1,12,32,11};
        int largest = input[0];
        for(int i=1;i<input.length;i++){
            if(input[i]>largest){
                largest = input[i];
            }
        }
        System.out.println(largest);
    }
}
