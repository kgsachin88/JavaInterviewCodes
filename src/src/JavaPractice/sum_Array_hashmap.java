package JavaPractice;

import java.util.HashMap;

public class sum_Array_hashmap {
    public static void main(String[] args) {
        int[] input = {3,2,5,10};
        int j =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : input){
            map.put(j,i);
            j++;
        }
        System.out.println(map);
        int sum = 0;
        for (int output:map.values()){
            sum+=output;
        }
        System.out.println(sum);
    }
}
