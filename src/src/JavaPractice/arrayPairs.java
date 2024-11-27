package JavaPractice;

import java.util.HashSet;

public class arrayPairs {
    public static void main(String[] args) {
        int[] myarr= {4,1,5,6,9};
        int targetsum = 10;
        boolean fountPair = false;
        HashSet<Integer> number = new HashSet<>();
        for (int i:myarr) {
            int j = targetsum - i;
            if (number.contains(j)) {
                System.out.println("(" + j + "," + i + ")");
                fountPair=true;
            }
            number.add(i);
        }
        if(!fountPair){
            System.out.println("Pair not found");


        }

    }
}
