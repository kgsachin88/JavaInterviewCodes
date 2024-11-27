package JavaPractice;

public class bubbleSort {
    public static void main(String[] args) {
        int[] input = {3,4,2,5,10,9,1,12,32,11};
        int n = input.length;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(input[j]>input[j+1]){
                    int temp =input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;

                }
            }
        }
        for(int sorted : input){
            System.out.print(sorted+",");
        }


    }
}
