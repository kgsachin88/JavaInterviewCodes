package JavaPractice;

public class SeconLargestinArray {
    public static void main(String[] args) {
        int[] input = {3,3,5,10};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>largest){
                secondLargest=largest;
                largest=input[i];
            } else if (input[i]>secondLargest && input[i]!=largest) {
                secondLargest=input[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("There is no second largest element (all elements might be the same).");
        } else {
            System.out.println("Second Largest is :"+secondLargest);
        }
    }
}
