package JavaPractice;

public class Practice {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,};
        int target= 4;
        int n = array.length;
        int result =-1;
        int left = 0;
        int right = n-1;
        while (left<right){
           int mid = left+right/2;
            System.out.println("mid is "+mid+" "+array[mid]);
            if (array[mid]==target){
                result=mid;
                break;
            } else if (array[mid]<target) {
                left =mid+1;
            }else {
                right =mid-1;
            }
        }
        if(result!=-1){
            System.out.println("Index of : "+target+" is "+ result);
        }else {
            System.out.println("Element not found in the array.");
        }
    }
}
